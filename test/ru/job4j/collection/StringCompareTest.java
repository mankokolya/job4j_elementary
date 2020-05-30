package ru.job4j.collection;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringCompareTest {
    private StringCompare compare = new StringCompare();

    @Test
    public void whenStringsAreEqualThenZero() {
        int rst = compare.compare(
                "Ivanov",
                "Ivanov"
        );
        assertTrue(rst == 0);
    }

    @Test
    public void whenLeftLessThanRightResultShouldBeNegative() {
        int rst = compare.compare(
                "Ivanov",
                "Ivanova"
        );
        assertTrue(rst < 0);
    }

    @Test
    public void whenLeftGreaterThanRightResultShouldBePositive() {
        int rst = compare.compare(
                "Petrov",
                "Ivanova"
        );
        assertTrue(rst > 0);
    }

    @Test
    public void secondCharOfLeftGreaterThanRightShouldBePositive() {
        int rst = compare.compare(
                "Petrov",
                "Patrov"
        );
        assertTrue(rst > 0);
    }

    @Test
    public void secondCharOfLeftLessThanRightShouldBeNegative() {
        int rst = compare.compare(
                "Patrova",
                "Petrov"
        );
        assertTrue(rst < 0);
    }
}