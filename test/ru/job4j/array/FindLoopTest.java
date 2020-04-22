package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        int[] input = new int[] {5, 10, 3};
        int valueToFind = 5;
        int result = FindLoop.indexOfElement(input, valueToFind);
        int expect = 0;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHas4Then3() {
        int[] input = new int[] {5, 10, 3, 4};
        int valueToFind = 4;
        int result = FindLoop.indexOfElement(input, valueToFind);
        int expect = 3;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHasNot2() {
        int[] input = new int[] {5, 10, 3, 4};
        int valueToFind = 2;
        int result = FindLoop.indexOfElement(input, valueToFind);
        int expect = -1;
        assertThat(result, is(expect));
    }
}