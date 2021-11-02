package ru.kpfu.itis.akhmetova.service.impl;

import ru.kpfu.itis.akhmetova.dao.ArticleDao;
import ru.kpfu.itis.akhmetova.dao.impl.ArticleDaoImpl;
import ru.kpfu.itis.akhmetova.dto.ArticleDto;
import ru.kpfu.itis.akhmetova.models.Article;
import ru.kpfu.itis.akhmetova.service.ArticleService;

import java.util.List;
import java.util.stream.Collectors;

public class ArticleServiceImpl implements ArticleService {

    private final ArticleDao<Article> articleDao = new ArticleDaoImpl();
    @Override
    public List<ArticleDto> getAllArticles() {
        List<Article> articleList = articleDao.getAllArticles();
        return articleList.stream()
                .map(article -> new ArticleDto(article.getTitle(), article.getSubject(), article.getContent()))
                .collect(Collectors.toList());
    }

    @Override
    public Article getArticle() {//пока просто взять любую статью
        return articleDao.getArticle();
    }

    @Override
    public void saveArticle(Article article) {
        articleDao.saveArticle(new Article(
                article.getSubject(),
                article.getTitle(),
                article.getContent()
        ));
    }
}
