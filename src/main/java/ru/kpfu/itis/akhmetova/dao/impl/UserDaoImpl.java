package ru.kpfu.itis.akhmetova.dao.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.kpfu.itis.akhmetova.dao.Dao;
import ru.kpfu.itis.akhmetova.helper.PostgresConnectionHelper;
import ru.kpfu.itis.akhmetova.models.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements Dao<User> {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserDaoImpl.class);

    private final Connection connection = PostgresConnectionHelper.getConnection();

    @Override
    public User get(int id) {
        return null;
    }

    @Override
    public List<User> getAll() {
        try{
            Statement statement = connection.createStatement();
            String sql = "SELECT * FROM registeredUsers";
            ResultSet resultSet = statement.executeQuery(sql);

            List<User> userList = new ArrayList<>();
            while(resultSet.next()){
                User user = new User(
                        resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getString("email"),
                        resultSet.getString("password")
                );
                userList.add(user);
            }
            return userList;
        } catch (SQLException throwables) {
            LOGGER.warn("Failed execute getAll query", throwables);
            return null;
        }
    }

    @Override
    public void save(User user) {
        String sql = "INSERT INTO registeredUsers (name, email, password) VALUES (?, ?, ?);";

        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, user.getName());
            preparedStatement.setString(2, user.getEmail());
            preparedStatement.setString(3, user.getPassword());
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            LOGGER.warn("Failed to save new user", throwables);
        }
    }
}
