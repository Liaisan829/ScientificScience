package ru.kpfu.itis.akhmetova.filter;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter(filterName = "RequireRegistrationFilter", urlPatterns = {"/", "/article"})
public class RequireRegistrationFilter implements Filter {
    public void init(FilterConfig config) throws ServletException {
    }


    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse resp = (HttpServletResponse) response;

        String uri = req.getRequestURI();
        HttpSession session = req.getSession(false);
        if (session == null && !uri.contains("registration")) {
            resp.sendRedirect("registration");
        } else {
            filterChain.doFilter(request, response);
        }
    }

    public void destroy() {
    }
}
