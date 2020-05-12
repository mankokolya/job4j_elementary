package ru.job4j.strategy;

import java.util.StringJoiner;

public class Square implements Shape {

    public String draw() {
        int size = 5;
        StringJoiner stringJoiner = new StringJoiner("");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == 0 || i == size - 1) {
                    stringJoiner.add("*");
                }else if (j == 0 || j== size - 1) {
                    stringJoiner.add("*");
                }else{
                    stringJoiner.add(" ");
                }
            }
            stringJoiner.add(System.lineSeparator());
        }
        return stringJoiner.toString();
    }
}
