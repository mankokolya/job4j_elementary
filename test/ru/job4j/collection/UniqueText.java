package ru.job4j.collection;

import java.util.Arrays;
import java.util.HashSet;

public class UniqueText {
    public static boolean isEquals(String originText, String duplicate) {
        HashSet<String> check = new HashSet<>(Arrays.asList(originText.split(" ")));
        HashSet<String> textDuplicate = new HashSet<>(Arrays.asList(duplicate.split(" ")));
        return check.equals(textDuplicate);
    }
}

