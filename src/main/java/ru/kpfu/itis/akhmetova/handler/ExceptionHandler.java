package ru.kpfu.itis.akhmetova.handler;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(urlPatterns = "/handle")
public class ExceptionHandler extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        handleException(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        handleException(request, response);
    }

    private void handleException(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Throwable throwable = (Throwable) req.getAttribute("javax.servlet.error.exception");
        Integer code = (Integer) req.getAttribute("javax.servlet.error.status_code");
        String uri = (String) req.getAttribute("javax.servlet.error.request_uri");
        uri = uri == null ? "" : uri;

        req.setAttribute("statusCode", code);
        req.setAttribute("uri", uri);
        if (code == 500) {
            req.setAttribute("message", throwable.getMessage());
        }

        req.getRequestDispatcher("exception.ftl").forward(req, resp);
    }
}
