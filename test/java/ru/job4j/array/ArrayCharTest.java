package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class ArrayCharTest {

    @Test
    public void whenStartsWithPrefixThenTrue() {
        char[] inputWord = {'H', 'e', 'l', 'l', 'o'};
        char[] startingCombination = {'H', 'e'};
        boolean result = ArrayChar.startsWith(inputWord, startingCombination);
        assertThat(result, is(true));
    }

    @Test
    public void whenNotStartsWithPrefixThenFalse() {
        char[] inputWord = {'H', 'e', 'l', 'l', 'o'};
        char[] startingCombination = {'H', 'i'};
        boolean result = ArrayChar.startsWith(inputWord, startingCombination);
        assertThat(result, is(false));
    }
}