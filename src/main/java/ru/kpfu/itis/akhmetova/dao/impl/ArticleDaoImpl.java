package ru.kpfu.itis.akhmetova.dao.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.kpfu.itis.akhmetova.dao.ArticleDao;
import ru.kpfu.itis.akhmetova.helper.PostgresConnectionHelper;
import ru.kpfu.itis.akhmetova.models.Article;
import ru.kpfu.itis.akhmetova.models.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ArticleDaoImpl implements ArticleDao<Article> {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserDaoImpl.class);

    private final Connection connection = PostgresConnectionHelper.getConnection();

    @Override
    public List<Article> getAllArticles() {
        try {
            Statement statement = connection.createStatement();
            String sql = "SELECT * FROM article";
            ResultSet resultSet = statement.executeQuery(sql);

            List<Article> articleList = new ArrayList<>();
            while (resultSet.next()) {
                Article article = new Article(
                        resultSet.getInt("id"),
                        resultSet.getString("title"),
                        resultSet.getString("subject"),
                        resultSet.getString("content")
                );
                articleList.add(article);
            }
            return articleList;
        } catch (SQLException throwables) {
            LOGGER.warn("Failed execute getAll query", throwables);
            return new ArrayList<>();
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

    @Override
    public void saveArticle(Article article) {
        String sql = "INSERT INTO article (subject, title, content) VALUES (?, ?, ?)";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);//позволяет предотвращать sql инъекции
            preparedStatement.setString(1, article.getSubject());
            preparedStatement.setString(2, article.getTitle());
            preparedStatement.setString(3, article.getContent());
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            LOGGER.warn("Failed to save new user", throwables);
        }
    }
}
