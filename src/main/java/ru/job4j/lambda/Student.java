package ru.job4j.lambda;

public class Student {
    private final int score;
    private final String surname;

    public Student(int score, String surname) {
        this.score = score;
        this.surname = surname;
    }

    public int getScore() {
        return score;
    }

    public String getSurname() {
        return surname;
    }
}
