package ru.kpfu.itis.akhmetova.filter;

import ru.kpfu.itis.akhmetova.helper.CheckParametersHelper;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter(filterName = "RequireRegistrationFilter", urlPatterns = "/registration")
public class CheckParametersFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) servletRequest;
        HttpServletResponse resp = (HttpServletResponse) servletResponse;

        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String password = req.getParameter("password");

        if(!CheckParametersHelper.checkName(name)){
            servletRequest.setAttribute("error", "Name format is incorrect");
            resp.sendRedirect("/registration.jsp");
        }
        else if (!CheckParametersHelper.checkEmail(email)){
            servletRequest.setAttribute("error", "Email format is incorrect");
            resp.sendRedirect("/registration.jsp");
        }
        else if(!CheckParametersHelper.checkPassword(password)){
            servletRequest.setAttribute("error", "Password format is incorrect");
            resp.sendRedirect("/registration.jsp");
        }
        else{
            filterChain.doFilter(req, resp);
        }
    }

    @Override
    public void destroy() {
    }
}
