package ru.kpfu.itis.akhmetova.service;

import ru.kpfu.itis.akhmetova.dto.UserDto;
import ru.kpfu.itis.akhmetova.models.Article;
import ru.kpfu.itis.akhmetova.models.User;

import java.util.List;

public interface UserService {//это уровень который возварщает сервлету, а сервлет пользователю
    List<UserDto> getAllUsers();
    String getUserByEmail(String email);
    void save (User user);
    Article getArticle();
}
