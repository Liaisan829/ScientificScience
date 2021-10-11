package ru.kpfu.itis.akhmetova.repository;

import ru.kpfu.itis.akhmetova.models.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class UsersRepositoryInMemoryImpl implements UsersRepository {

    private List<User> users;

    public UsersRepositoryInMemoryImpl() {
        this.users = new ArrayList<>();
        User user = new User("Liaisan", "password", LocalDate.parse("2002-07-08"));
        User user1 = new User("Liaisan1", "password", LocalDate.parse("2002-07-08"));
        User user2 = new User("Liaisan2", "password", LocalDate.parse("2002-07-08"));

        users.add(user);
        users.add(user1);
        users.add(user2);
    }

    @Override
    public List<User> findAll() {
        return this.users;
    }

    @Override
    public void save(User user) {
        users.add(user);
    }
}
