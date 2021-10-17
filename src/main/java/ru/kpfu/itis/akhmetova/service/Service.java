package ru.kpfu.itis.akhmetova.service;

import java.util.List;

public interface Service<T> {//это уровень который возварщает сервлету, а сервлет пользователю
    T get (int id);
    List<T> getAll();
    void save(T t);
}
