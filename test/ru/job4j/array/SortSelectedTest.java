package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class SortSelectedTest {

    @Test
    public void sort5NumbersInIncreasingOrder() {
        assertThat(SortSelected.sort(new int[] {3, 4, 1, 2, 5}), is(new int[] {1, 2, 3, 4, 5}));
    }

    @Test
    public void sort3NumbersInIncreasingOrder() {
        assertThat(SortSelected.sort(new int[] {3, 4, 1}), is(new int[] {1, 3, 4}));
    }
}

