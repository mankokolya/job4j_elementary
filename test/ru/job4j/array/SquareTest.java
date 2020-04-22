package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class SquareTest {

    @Test
    public void whenBound3Then014() {
        int bound = 3;
        int[] squaredNumbers = Square.numbersToSquare(bound);
        int[] expect = new int[] {0, 1, 4};
        assertThat(squaredNumbers, is(expect));
    }

    @Test
    public void whenBound5Then014916() {
        int bound = 5;
        int[] squaredNumbers = Square.numbersToSquare(bound);
        int[] expect = new int[] {0, 1, 4, 9, 16};
        assertThat(squaredNumbers, is(expect));
    }
}