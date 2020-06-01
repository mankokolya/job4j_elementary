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

        assertThat(MatrixCheck.checkHorizontalLineHasOnlyX(input, 1), is(true));
    }

    @Test
    public void whenDoesNotHaveMonoHorizontal() {
        char[][] input = {
                {' ', ' ', ' '},
                {'X', ' ', 'X', 'S'},
                {' ', ' ', ' '}
        };

        assertThat(MatrixCheck.checkHorizontalLineHasOnlyX(input, 1), is(false));
    }

    @Test
    public void whenHasMonoVertical() {
        char[][] input = {
                {' ', ' ', 'X'},
                {' ', 'S', 'X'},
                {' ', ' ', 'X'}
        };
        assertThat(MatrixCheck.checkVerticalLineHasOnlyX(input, 2), is(true));
    }

    @Test
    public void whenDoesNotHaveMonoVertical() {
        char[][] input = {
                {' ', ' ', 'X'},
                {' ', 'S', 'X'},
                {' ', ' ', 'X'},
                {' ', ' ', 'S'}
        };
        assertThat(MatrixCheck.checkVerticalLineHasOnlyX(input, 2), is(false));
    }

    @Test
    public void extractDiagonalToArrayTrue() {
        char[][] input = {
                {'X', ' ', ' '},
                {' ', 'X', ' '},
                {' ', ' ', 'X'}
        };
        char[] expect = {'X', 'X', 'X'};
        assertThat(MatrixCheck.extractDiagonal(input), is(expect));
    }

    @Test
    public void whenDataMonoVertical() {
        char[][] input = {
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
        };
        boolean result = MatrixCheck.isWin(input);
        assertThat(result, is(true));
    }

    @Test
    public void whenDataNotMonoVertical() {
        char[][] input = {
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', 'X', ' ', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
        };
        boolean result = MatrixCheck.isWin(input);
        assertThat(result, is(false));
    }

    @Test
    public void whenDataMonoHorizontal() {
        char[][] input = {
                {' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' '},
                {'X', 'X', 'X', 'X', 'X'},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
        };
        boolean result = MatrixCheck.isWin(input);
        assertThat(result, is(true));
    }
}