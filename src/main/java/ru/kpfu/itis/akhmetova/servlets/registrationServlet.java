package ru.kpfu.itis.akhmetova.servlets;

import ru.kpfu.itis.akhmetova.dao.Dao;
import ru.kpfu.itis.akhmetova.dao.impl.UserDaoImpl;
import ru.kpfu.itis.akhmetova.models.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "registrationServlet", urlPatterns = "/registration")
public class registrationServlet extends HttpServlet {

    private static Dao<User> dao = new UserDaoImpl();

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
        User user = new User(name, email, password);

        //сохранять в бд
        dao.save(user);
        resp.sendRedirect(req.getContextPath() + "/main");
    }
}
