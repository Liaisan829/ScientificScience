package ru.kpfu.itis.akhmetova.models;

import java.time.LocalDate;

public class User {
    public String name;
    public String password;
    public LocalDate birthdate;

    public User(String name, String password, LocalDate birthdate) {
        this.name = name;
        this.password = password;
        this.birthdate = birthdate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }
}
