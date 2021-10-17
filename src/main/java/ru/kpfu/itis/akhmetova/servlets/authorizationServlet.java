package ru.kpfu.itis.akhmetova.servlets;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "authorizationServlet", urlPatterns = "/authorization")
public class authorizationServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher dispatcher = req.getServletContext().getRequestDispatcher("/jsp/authorization.jsp");
        dispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //проверка логина и пароля на соответствие и перенаправляем на глвную страницу без вход и регистрация, вместо них можно имя пользователя показать и нажав на нее пользователь переходит на страницу свою
        String email = req.getParameter("email");
        String password = req.getParameter("password");

//        if (usersRepository.isExist(email, password)) {помоему в бд проверять что такой пользователь есть
            HttpSession session = req.getSession();
            session.setAttribute("userEmail", email);//на сервере создали сессию и дали ей атрибут юзер и ее значение маил
            req.getServletContext().getRequestDispatcher("/main").forward(req, resp);
//        }
        resp.sendRedirect(req.getContextPath() + "/authorization");
    }
}
