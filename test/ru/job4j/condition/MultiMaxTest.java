package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class MultiMaxTest {

    MultiMax check = new MultiMax();
    int result;

    @Test
    public void whenSecondMax() {
        result = check.max(1, 4, 2);
        assertThat(result, is(4));
    }

    @Test
    public void whenFirstMax() {
        result = check.max(8, 4, 2);
        assertThat(result, is(8));
    }

    @Test
    public void whenThirdMax() {
        result = check.max(1, 4, 9);
        assertThat(result, is(9));
    }

    @Test
    public void allEqual() {
        result = check.max(2, 2, 2);
        assertThat(result, is(2));
    }

}