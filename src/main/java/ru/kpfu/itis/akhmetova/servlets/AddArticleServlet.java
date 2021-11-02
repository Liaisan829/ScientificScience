package ru.kpfu.itis.akhmetova.servlets;

import ru.kpfu.itis.akhmetova.models.Article;
import ru.kpfu.itis.akhmetova.service.ArticleService;
import ru.kpfu.itis.akhmetova.service.impl.ArticleServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "AddArticle", value = "/addArticle")
public class AddArticleServlet extends HttpServlet {

    private final ArticleService articleService = new ArticleServiceImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect("/addArticle.ftl");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String subject = request.getParameter("subject");
        String title = request.getParameter("title");
        String content = request.getParameter("content");

        Article article = new Article(subject, title, content);
        articleService.saveArticle(article);
        response.sendRedirect("/userPage.jsp");
        //как то открыть модалку и сказать о молодец мы проверим статью и добавим скоро
    }
}
