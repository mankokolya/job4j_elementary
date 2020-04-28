package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class CheckArrayTest {

    @Test
    public void whenAllDataTrueThenTrue() {
        boolean[] input = {true, true, true, true};
        boolean result = CheckArray.checkArrayIsMono(input);
        assertThat(result, is(true));
    }

    @Test
    public void whenDataAreDifferent() {
        boolean[] input = {true, false, true, true};
        boolean result = CheckArray.checkArrayIsMono(input);
        assertThat(result, is(false));
    }
}