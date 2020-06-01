package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class MatrixTest {

    @Test
    public void when2on2() {
        int[][] expected = {
                {1, 2},
                {2, 4}
        };
        assertThat(Matrix.multiple(2), is(expected));
    }

    @Test
    public void when4on4() {
        int[][] expected = {
                {1, 2, 3, 4},
                {2, 4, 6, 8},
                {3, 6, 9, 12},
                {4, 8, 12, 16}
        };
        assertThat(Matrix.multiple(4), is(expected));
    }
}