package ru.kpfu.itis.akhmetova.servlets;

import ru.kpfu.itis.akhmetova.models.User;
import ru.kpfu.itis.akhmetova.service.UserService;
import ru.kpfu.itis.akhmetova.service.impl.UserServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet(name = "registrationServlet", urlPatterns = "/registration")
public class registrationServlet extends HttpServlet {

    private static final UserService usi = new UserServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher dispatcher = req.getServletContext().getRequestDispatcher("/jsp/registration.jsp");
        dispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String email = req.getParameter("email");//мы берем параметры
        String password = req.getParameter("password");
        String remember = req.getParameter("remember");
        User user = new User(name, email, password);

        usi.save(user);

        HttpSession session = req.getSession();
        session.setAttribute("userEmail", email);//на сервере создали сессию и дали ей атрибут юзер и ее значение маил
        session.setMaxInactiveInterval(60 * 60);

        Cookie emailCookie = new Cookie("userEmail", email);
        Cookie passCookie = new Cookie("userPassword", password);
        Cookie rememberCookie = new Cookie("userRemember", remember);
        emailCookie.setMaxAge(24 * 60 * 60);
        passCookie.setMaxAge(24*60*60);
        rememberCookie.setMaxAge(24*60*60);
        resp.addCookie(emailCookie);
        resp.addCookie(passCookie);
        resp.addCookie(rememberCookie);
        resp.sendRedirect(req.getContextPath() + "/main");
    }
}
