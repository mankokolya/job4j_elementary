package ru.job4j.collection;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class LexSortTest {
    @Test
    public void sortNum1and2and10() {
        String[] input = {
                "10. Task.",
                "1. Task.",
                "2. Task."
        };
        String[] out = {
                "1. Task.",
                "2. Task.",
                "10. Task."
        };
        Arrays.sort(input, new LexSort());
        assertThat(input, is(out));
    }

    @Test
    public void sortNum() {
        String[] input = {
                "2.1. Task.",
                "1.2 Task.",
                "2.2. Task.",
                "1.3 Task."
        };
        String[] out = {
                "1.2 Task.",
                "1.3 Task.",
                "2.1. Task.",
                "2.2. Task."
        };
        Arrays.sort(input, new LexSort());
        assertThat(input, is(out));
    }
    @Test

    public void sortMultiLevel() {
        String[] input = {
                "2.1. Task.",
                "1.2 Task.",
                "2.2. Task.",
                "2.2.3 Task.",
                "1.3 Task."
        };
        String[] out = {
                "1.2 Task.",
                "1.3 Task.",
                "2.1. Task.",
                "2.2. Task.",
                "2.2.3 Task.",
        };
        Arrays.sort(input, new LexSort());
        assertThat(input, is(out));
    }

}