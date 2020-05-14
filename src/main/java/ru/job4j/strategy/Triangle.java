package ru.job4j.strategy;

import java.util.StringJoiner;

public class Triangle implements Shape {
    private int size;

    public Triangle(int size) {
        this.size = size;
    }

    public String draw() {
        StringJoiner stringJoiner = new StringJoiner("");
        for (int i = 1; i < size; i++) {
            for (int j = i; j < size - 1; j++) {
                stringJoiner.add(" ");
            }
            for (int j = 1; j < i * 2; j++) {
                stringJoiner.add("*");
            }
            stringJoiner.add(System.lineSeparator());
        }
        return stringJoiner.toString();
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}

