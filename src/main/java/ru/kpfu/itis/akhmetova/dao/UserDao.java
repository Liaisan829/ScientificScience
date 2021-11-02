package ru.kpfu.itis.akhmetova.dao;

import java.util.List;

public interface UserDao<T> {//работает с уровнем бд модельки это на уроыне дао
    String getUserByEmail (String email);
    List<T> getAllUsers();
    void saveUser(T t);
}
