package ru.job4j.collection;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class LexSort implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        String[] o1Split = o1.split(" ");
        String[] o2Split = o2.split(" ");
        String[] o1Digit = o1Split[0].split("\\.");
        String[] o2Digit = o2Split[0].split("\\.");

        int size = Math.min(o1Digit.length, o2Digit.length);

        for (int i = 0; i < size; i++) {
            int result = Integer.compare(Integer.parseInt(o1Digit[i]), Integer.parseInt(o2Digit[i]));
            if (result != 0) {
                return result;
            }
        }

        return Integer.compare(o1Digit.length, o2Digit.length);
    }
}
