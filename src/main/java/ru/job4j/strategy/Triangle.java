package ru.job4j.strategy;

import java.util.StringJoiner;

public class Triangle implements Shape {
    public String draw() {
        int size = 7;
        StringJoiner stringJoiner = new StringJoiner("");
        for (int i = 1; i < size; i++) {
            for (int j = i; j < size; j++) {
                stringJoiner.add(" ");
            }
            for (int j = 1; j < i * 2; j++) {
                stringJoiner.add("*");
            }
            stringJoiner.add(System.lineSeparator());
        }

        return stringJoiner.toString();
    }
}

