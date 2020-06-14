package ru.job4j.collection;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static org.junit.Assert.*;

public class DepartmentsTest {

    @Test
    public void fillGapsWhenMissed() {
        List<String> input = List.of("k1/sk1");
        List<String> expect = List.of("k1", "k1/sk1");
        List<String> result = Departments.fillGaps(input);
        Departments.sortAsc(result);
        assertEquals(expect, result);
    }

    @Test
    public void fillGapsWhenNoMissed() {
        List<String> input = List.of("k1", "k1/sk1");
        List<String> expect = List.of("k1", "k1/sk1");
        List<String> result = Departments.fillGaps(input);
        Departments.sortAsc(result);
        assertEquals(expect, result);
    }

    @Test
    public void sortAsc() {
        List<String> input = List.of("k1/sk1/ssk1");
        List<String> expect = List.of("k1", "k1/sk1", "k1/sk1/ssk1");
        List<String> result = Departments.fillGaps(input);
        Departments.sortAsc(result);
        assertEquals(expect, result);
    }

    @Test
    public void sortDesc() {
        List<String> input = List.of("k1/sk1/ssk1", "k2/sk1");
        List<String> expect = List.of("k2", "k2/sk1", "k1", "k1/sk1", "k1/sk1/ssk1");
        List<String> result = Departments.fillGaps(input);
        Departments.sortDesc(result);
        assertEquals(expect, result);
    }

    @Test
    public void sortDesc2() {
        List<String> input = List.of("j1/sj1/ssj1", "j2/sj1");
        List<String> expect = List.of("j2", "j2/sj1", "j1", "j1/sj1", "j1/sj1/ssj1");
        List<String> result = Departments.fillGaps(input);
        Departments.sortDesc(result);
        assertEquals(expect, result);
    }
}