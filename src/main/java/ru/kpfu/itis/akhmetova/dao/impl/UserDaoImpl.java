package ru.kpfu.itis.akhmetova.dao.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.kpfu.itis.akhmetova.dao.Dao;
import ru.kpfu.itis.akhmetova.helper.PostgresConnectionHelper;
import ru.kpfu.itis.akhmetova.models.Article;
import ru.kpfu.itis.akhmetova.models.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements Dao<User> {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserDaoImpl.class);

    private final Connection connection = PostgresConnectionHelper.getConnection();

    @Override
    public String getUserByEmail(String email) {
        try {
            String sql = "SELECT password FROM usualUser WHERE email = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, email);//число - номер вопросика

            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
              return resultSet.getString("password");
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return "";
    }

    @Override
    public List<User> getAllUsers() {
        try {
            Statement statement = connection.createStatement();
            String sql = "SELECT * FROM usualuser";
            ResultSet resultSet = statement.executeQuery(sql);

            List<User> userList = new ArrayList<>();
            while (resultSet.next()) {
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
            return new ArrayList<>();
        }
    }

    @Override
    public void save(User user) {
        String sql = "INSERT INTO usualuser (name, email, password) VALUES (?, ?, ?)";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);//позволяет предотвращать sql инъекции
            preparedStatement.setString(1, user.getName());
            preparedStatement.setString(2, user.getEmail());
            preparedStatement.setString(3, user.getPassword());
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            LOGGER.warn("Failed to save new user", throwables);
        }
    }

    @Override
    public Article getArticle() {
        try {
            Statement statement = connection.createStatement();
            String sql = "SELECT * FROM article";
            ResultSet resultSet = statement.executeQuery(sql);

            Article article = null;
           if(resultSet.next()){
               article = new Article(
                       resultSet.getInt("id"),
                       resultSet.getString("subject"),
                       resultSet.getString("title"),
                       resultSet.getString("content")
               );
           }
           return article;

        } catch (SQLException throwables) {
            LOGGER.warn("Failed execute getAll query", throwables);
        }
        return null;
    }
}