package ru.kpfu.itis.akhmetova.service.impl;

import ru.kpfu.itis.akhmetova.dao.Dao;
import ru.kpfu.itis.akhmetova.dao.impl.UserDaoImpl;
import ru.kpfu.itis.akhmetova.dto.UserDto;
import ru.kpfu.itis.akhmetova.helper.PasswordHelper;
import ru.kpfu.itis.akhmetova.models.Article;
import ru.kpfu.itis.akhmetova.models.User;
import ru.kpfu.itis.akhmetova.service.UserService;

import java.util.List;
import java.util.stream.Collectors;

public class UserServiceImpl implements UserService {

    private final Dao<User> dao = new UserDaoImpl();

    @Override
    public String getUserByEmail(String email) {
        return dao.getUserByEmail(email);
    }

    //преобразует модельку из бд в класс юзердто что потом может быть использовано в сервлете

    @Override
    public List<UserDto> getAllUsers() {
        List<User> userList = dao.getAllUsers();
        return userList.stream()
                .map(user -> new UserDto(user.getName(), user.getEmail()))
                .collect(Collectors.toList());
    }

    @Override
    public void save(User user) {//просто юзер потому что у него пароль есть а у юзердто нет
        dao.save(new User(
                user.getName(),
                user.getEmail(),
                PasswordHelper.encrypt(user.getPassword())
        ));
    }

    @Override
    public Article getArticle() {
        return dao.getArticle();
    }
}
