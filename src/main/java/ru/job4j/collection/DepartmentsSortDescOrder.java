package ru.job4j.collection;

import java.util.Comparator;
import java.util.List;

public class DepartmentsSortDescOrder implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        int result;
        String[] o1Split = o1.split("/", 2);
        String[] o2Split = o2.split("/", 2);
        if (o1Split.length == 1 || o2Split.length == 1) {
            result = o2Split[0].compareTo(o1Split[0]);
            if (result == 0) {
                result = Integer.compare(o1Split.length, o2Split.length);
            }
        } else {
            result = o2Split[0].compareTo(o1Split[0]);
            if (result == 0) {
                result = o1Split[1].compareTo(o2Split[1]);
            }
        }
        return result;
    }
}
