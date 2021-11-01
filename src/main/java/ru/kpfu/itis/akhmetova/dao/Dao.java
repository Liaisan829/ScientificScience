package ru.kpfu.itis.akhmetova.dao;

import ru.kpfu.itis.akhmetova.models.Article;
import ru.kpfu.itis.akhmetova.models.User;

import java.util.List;

public interface Dao<T> {//работает с уровнем бд модельки это на уроыне дао
    String getUserByEmail (String email);
    List<T> getAllUsers();
    void save(T t);
    Article getArticle();
}
