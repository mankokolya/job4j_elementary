package ru.job4j.lambda;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class MatrixToListTest {

    @Test
    public void matrixToList() {
        Integer[][] input = {
                {1, 2, 3},
                {4, 5, 6}
        };

        List<Integer> result = MatrixToList.matrixToList(input);
        List<Integer> expect = List.of(1, 2, 3, 4, 5, 6);
        assertEquals(expect, result);
    }
}