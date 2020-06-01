package ru.job4j.algorithms;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class BinarySearchTest {
    BinarySearch binarySearch = new BinarySearch();

    @Test
    public void binarySearchWhenItemExist() {
        int[] data = {1, 3, 5, 7, 5, 9};
        int expected = 1;
        assertThat(binarySearch.search(data, 3), is(expected));
    }

    @Test
    public void binarySearchWhenItemNotExist() {
        int[] data = {1, 3, 5, 7, 9};
        int expected = -1;
        assertThat(binarySearch.search(data, 10), is(expected));
    }
}