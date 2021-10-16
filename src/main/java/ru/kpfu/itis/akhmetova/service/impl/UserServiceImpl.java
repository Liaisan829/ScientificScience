package ru.kpfu.itis.akhmetova.service.impl;

import ru.kpfu.itis.akhmetova.dao.Dao;
import ru.kpfu.itis.akhmetova.dao.impl.UserDaoImpl;
import ru.kpfu.itis.akhmetova.dto.UserDto;
import ru.kpfu.itis.akhmetova.models.User;
import ru.kpfu.itis.akhmetova.service.Service;

import java.util.List;
import java.util.stream.Collectors;

public class UserServiceImpl implements Service<UserDto> {

    private final Dao dao = new UserDaoImpl();

    @Override
    public UserDto get(int id) {
        return null;
    }
//преобразует модельку из бд в класс юзердто что потом может быть использовано в сервлете
    @Override
    public List<UserDto> getAll() {
        List<User> userList = dao.getAll();
        return userList.stream()
                .map(user -> new UserDto(user.getName(), user.getEmail()))
                .collect(Collectors.toList());
    }

    @Override
    public void save(UserDto userDto) {

    }
}
