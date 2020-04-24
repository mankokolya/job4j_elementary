package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class MatrixCheckTest {

    @Test
    public void whenHasMonoHorizontal() {
        char[][] input = {
                {' ', ' ', ' '},
                {'X', 'X', 'X'},
                {' ', ' ', ' '}
        };

        assertThat(MatrixCheck.checkHorizontalLineIsUnique(input, 1), is(true));
    }

    @Test
    public void whenDoesNotHaveMonoHorizontal() {
        char[][] input = {
                {' ', ' ', ' '},
                {'X', ' ', 'X', 'S'},
                {' ', ' ', ' '}
        };

        assertThat(MatrixCheck.checkHorizontalLineIsUnique(input, 1), is(false));
    }

    @Test
    public void whenHasMonoVertical() {
        char[][] input = {
                {' ', ' ', 'X'},
                {' ', 'S', 'X'},
                {' ', ' ', 'X'}
        };
        assertThat(MatrixCheck.checkVerticalLineISUnique(input, 2), is(true));
    }

    @Test
    public void whenDoesNotHaveMonoVertical() {
        char[][] input = {
                {' ', ' ', 'X'},
                {' ', 'S', 'X'},
                {' ', ' ', 'X'},
                {' ', ' ', 'S'}
        };
        assertThat(MatrixCheck.checkVerticalLineISUnique(input, 2), is(false));
    }
}