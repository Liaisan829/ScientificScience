package ru.kpfu.itis.akhmetova.dao;

import java.util.List;

public interface Dao<T> {//работает с уровнем бд модельки это на уроыне дао
    T get (int id);
    List<T> getAll();
    void save(T t);
}
