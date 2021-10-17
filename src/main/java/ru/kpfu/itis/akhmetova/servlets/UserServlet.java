package ru.kpfu.itis.akhmetova.servlets;

import ru.kpfu.itis.akhmetova.dto.UserDto;
import ru.kpfu.itis.akhmetova.service.Service;
import ru.kpfu.itis.akhmetova.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "userServlet", urlPatterns = "/registeredUsers")
public class UserServlet extends HttpServlet {

    private final Service<UserDto> userService = new UserServiceImpl();



    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<UserDto> registeredUsers = userService.getAll();
        req.setAttribute("users", registeredUsers);
        req.getRequestDispatcher("users.ftl").forward(req, resp);
    }

}
