package ru.kpfu.itis.akhmetova.service.impl;

import ru.kpfu.itis.akhmetova.dao.UserDao;
import ru.kpfu.itis.akhmetova.dao.impl.UserDaoImpl;
import ru.kpfu.itis.akhmetova.dto.UserDto;
import ru.kpfu.itis.akhmetova.helper.PasswordHelper;
import ru.kpfu.itis.akhmetova.models.User;
import ru.kpfu.itis.akhmetova.service.UserService;

import java.util.List;
import java.util.stream.Collectors;

public class UserServiceImpl implements UserService {

    private final UserDao<User> userDao = new UserDaoImpl();

    @Override
    public String getUserByEmail(String email) {
        return userDao.getUserByEmail(email);
    }

    //преобразует модельку из бд в класс юзердто что потом может быть использовано в сервлете

    @Override
    public List<UserDto> getAllUsers() {
        List<User> userList = userDao.getAllUsers();
        return userList.stream()
                .map(user -> new UserDto(user.getName(), user.getEmail()))
                .collect(Collectors.toList());
    }

    @Override
    public void saveUser(User user) {//просто юзер потому что у него пароль есть а у юзердто нет
        userDao.saveUser(new User(
                user.getName(),
                user.getEmail(),
                PasswordHelper.encrypt(user.getPassword())
        ));
    }


}
