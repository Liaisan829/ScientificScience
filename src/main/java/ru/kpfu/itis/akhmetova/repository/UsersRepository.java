package ru.kpfu.itis.akhmetova.repository;

import ru.kpfu.itis.akhmetova.models.User;

import java.util.List;

public interface UsersRepository {

    List<User> findAll();
    void save(User user);
    boolean isExist(String login, String password);
}
