package ru.kpfu.itis.akhmetova.repository;

import ru.kpfu.itis.akhmetova.fake.FakeStorage;
import ru.kpfu.itis.akhmetova.models.User;

import java.util.List;

public class UsersRepositoryInMemoryImpl implements UsersRepository {

    @Override
    public List<User> findAll() {
        return FakeStorage.storage().users();
    }

    @Override
    public void save(User user) {
        FakeStorage.storage().users().add(user);
    }

    @Override
    public boolean isExist(String login, String password) {
        for(User user: FakeStorage.storage().users()){
            if(user.getLogin().equals(login) && user.getPassword().equals(password)){
                return true;
            }
        }
        return false;
    }
}
