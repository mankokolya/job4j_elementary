package ru.job4j.exception;

public class User {
    private String userName;
    private boolean valid;

    public User(String name, boolean valid) {
        this.userName = name;
        this.valid = valid;
    }

    public boolean isValid() {
        return valid;
    }

    public String getUserName() {
        return userName;
    }
}
