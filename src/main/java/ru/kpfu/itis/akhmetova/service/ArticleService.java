package ru.kpfu.itis.akhmetova.service;

import ru.kpfu.itis.akhmetova.dto.ArticleDto;
import ru.kpfu.itis.akhmetova.models.Article;

import java.util.List;

public interface ArticleService {
    List<ArticleDto> getAllArticles();
    Article getArticle();
    void saveArticle(Article article);
}
