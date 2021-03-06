package ru.kpfu.itis.akhmetova.filter;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter(filterName = "RequireRegistrationFilter", urlPatterns = "/article")
public class RequireRegistrationFilter implements Filter {
    public void init(FilterConfig config) throws ServletException {
    }


    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse resp = (HttpServletResponse) response;

        HttpSession session = req.getSession(false);
        Object email = session.getAttribute("userEmail");
        if (email == null) {
            resp.sendRedirect("/registration.jsp");
        } else {
            filterChain.doFilter(request, response);
        }

    }

    public void destroy() {
    }
}
