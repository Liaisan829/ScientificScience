package ru.kpfu.itis.akhmetova.servlets;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.kpfu.itis.akhmetova.helper.PasswordHelper;
import ru.kpfu.itis.akhmetova.service.UserService;
import ru.kpfu.itis.akhmetova.service.impl.UserServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet(name = "authorizationServlet", urlPatterns = "/authorization")
public class authorizationServlet extends HttpServlet {

    public static final Logger LOGGER = LoggerFactory.getLogger(authorizationServlet.class);
    public static final UserService userService = new UserServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher dispatcher = req.getServletContext().getRequestDispatcher(req.getContextPath() + "/authorization.jsp");
        dispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //проверка логина и пароля на соответствие и перенаправляем на главную страницу без вход и регистрация, вместо них можно имя пользователя показать и нажав на нее пользователь переходит на страницу свою
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        String hashPassword = PasswordHelper.encrypt(password);
        String remember = req.getParameter("remember");

        if (userService.getUserByEmail(email).equals(hashPassword)) {
            LOGGER.info("пароль прошел проверку");
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
            resp.sendRedirect("/");

        } else {
            LOGGER.warn("пароль проверку не прошел");
            resp.sendRedirect("/authorization");//трабла с редиректом, 500 ошибка
        }
    }
}
