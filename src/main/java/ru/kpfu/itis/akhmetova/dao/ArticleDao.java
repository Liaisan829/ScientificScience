package ru.kpfu.itis.akhmetova.dao;

import java.util.List;

public interface ArticleDao<T> {
    List<T> getAllArticles();
    T getArticle();
    void saveArticle(T t);
}
