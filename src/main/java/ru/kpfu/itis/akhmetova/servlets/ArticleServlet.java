package ru.kpfu.itis.akhmetova.servlets;

import ru.kpfu.itis.akhmetova.dto.ArticleDto;
import ru.kpfu.itis.akhmetova.models.Article;
import ru.kpfu.itis.akhmetova.service.ArticleService;
import ru.kpfu.itis.akhmetova.service.impl.ArticleServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;



@WebServlet(name = "articleServlet", urlPatterns = "/article")
public class ArticleServlet extends HttpServlet {

    private final ArticleService articleService = new ArticleServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Article article = articleService.getArticle();
        req.setAttribute("article", article);
        req.getRequestDispatcher(req.getContextPath() + "/article.ftl").forward(req, resp);
    }

}
