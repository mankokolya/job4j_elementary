package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class SwitchArrayTest {

    @Test
    public void whenSwap0To3() {
        int[] input = {1, 2, 3, 4};
        int[] expect = {4, 2, 3, 1};
        int[] result = SwitchArray.swap(input, 0, input.length - 1);
        assertThat(result, is(expect));
    }

    @Test
    public void whenSwap2to4() {
        int[] input = {5, 6, 3, 7, 8, 1};
        int[] expect = {5, 6, 8, 7, 3, 1};
        int[] result = SwitchArray.swap(input, 2, 4);
        assertThat(result, is(expect));
    }
}