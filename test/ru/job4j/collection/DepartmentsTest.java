package ru.job4j.collection;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static org.junit.Assert.*;

public class DepartmentsTest {

    @Test
    public void fillGapsWhenMissed() {
        List<String> input = Arrays.asList("k1/sk1");
        List<String> expect = Arrays.asList("k1", "k1/sk1");
        List<String> result = Departments.fillGaps(input);
        Departments.sortAsc(result);
        assertEquals(expect, result);
    }

    @Test
    public void fillGapsWhenNoMissed() {
        List<String> input = Arrays.asList("k1", "k1/sk1");
        List<String> expect = Arrays.asList("k1", "k1/sk1");
        List<String> result = Departments.fillGaps(input);
        Departments.sortAsc(result);
        assertEquals(expect, result);
    }

    @Test
    public void sortAsc() {
        List<String> input = Arrays.asList("k1/sk1/ssk1");
        List<String> expect = Arrays.asList("k1", "k1/sk1", "k1/sk1/ssk1");
        List<String> result = Departments.fillGaps(input);
        Departments.sortAsc(result);
        assertEquals(expect, result);
    }

    @Test
    public void sortDesc() {
        List<String> input = Arrays.asList("k1/sk1/ssk1", "k2/sk1");
        List<String> expect = Arrays.asList("k2", "k2/sk1", "k1", "k1/sk1", "k1/sk1/ssk1");
        List<String> result = Departments.fillGaps(input);
        Departments.sortDesc(result);
        assertEquals(expect, result);
    }
}