package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;


public class EndsWithTest {

    @Test
    public void whenEndWithPrefixThenTrue() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] endingCombination = {'l', 'o'};
        boolean result = EndsWith.endsWith(word, endingCombination);
        assertThat(result, is(true));
    }

    @Test
    public void whenNotEndWithPrefixThenFalse() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] endingCombination = {'l', 'a'};
        boolean result = EndsWith.endsWith(word, endingCombination);
        assertThat(result, is(false));
    }
}