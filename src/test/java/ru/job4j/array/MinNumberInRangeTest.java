package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class MinNumberInRangeTest {


    @Test
    public void whenFirstMin() {
        assertThat(MinNumberInRange.findMinInRange(new int[] {-1, 0, 5, 10}, 1, 3), is(0));
    }

    @Test
    public void whenLastMin() {
        assertThat(MinNumberInRange.findMinInRange(new int[] {10, 5, 3, 1}, 1, 3), is(1));
    }

    @Test
    public void whenMiddleMin() {
        assertThat(MinNumberInRange.findMinInRange(new int[] {10, 2, 5, 1}, 0, 2), is(2));
    }
}