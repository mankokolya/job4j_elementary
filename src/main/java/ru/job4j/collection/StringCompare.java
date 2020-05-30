package ru.job4j.collection;

import java.util.Comparator;
import java.util.Iterator;

public class StringCompare implements Comparator<String> {

    @Override
    public int compare(String first, String second) {
        char[] firstChar =  first.toCharArray();
        char[] secondChar = second.toCharArray();
        int size = Math.min(firstChar.length, secondChar.length);
        for (int i = 0; i < size; i++) {
            int result = Character.compare(firstChar[i], secondChar[i]);
            if (result != 0) {
                return result;
            }
        }
        return Integer.compare(first.length(), second.length());
    }
}
