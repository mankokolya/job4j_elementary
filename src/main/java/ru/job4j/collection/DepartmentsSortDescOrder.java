package ru.job4j.collection;

import java.util.Comparator;
import java.util.List;

public class DepartmentsSortDescOrder implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        String[] o1Split = o1.split("/", 2);
        String[] o2Split = o2.split("/", 2);
        int result = o2Split[0].compareTo(o1Split[0]);
        return result == 0 ? o1.compareTo(o2) : result;
    }
}
