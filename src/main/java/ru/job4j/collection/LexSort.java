package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        String[] o1Digit = o1.split("\\.");
        String[] o2Digit = o2.split("\\.");
        return Integer.compare(Integer.parseInt(o1Digit[0]), Integer.parseInt(o2Digit[0]));
    }
}
