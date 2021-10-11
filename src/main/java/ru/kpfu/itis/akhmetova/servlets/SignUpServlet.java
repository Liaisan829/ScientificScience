package ru.kpfu.itis.akhmetova.servlets;

import ru.kpfu.itis.akhmetova.models.User;
import ru.kpfu.itis.akhmetova.repository.UsersRepository;
import ru.kpfu.itis.akhmetova.repository.UsersRepositoryInMemoryImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

@WebServlet(name = "SignUpServlet", urlPatterns = "/signedUsers")
public class SignUpServlet extends HttpServlet {

    private UsersRepository usersRepository;

    @Override
    public void init() throws ServletException {
       this.usersRepository = new UsersRepositoryInMemoryImpl();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<User> users = usersRepository.findAll();
        req.setAttribute("usersFromServer", users);
        RequestDispatcher dispatcher = req.getServletContext().getRequestDispatcher("/signedUsers.jsp");
        dispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String password = req.getParameter("password");
        LocalDate birthdate = LocalDate.parse(req.getParameter("birthdate"));//мы берем параметры
        User user = new User(name, password, birthdate);

        usersRepository.save(user);
        doGet(req, resp);

    }
}
