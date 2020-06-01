package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int maxNumber = Max.max(1, 2);
        assertThat(maxNumber, is(2));
    }

    @Test
    public void whenMax4To2Then4() {
        int maxNumber = Max.max(4, 2);
        assertThat(maxNumber, is(4));
    }

    @Test
    public void whenMax5To5Then5() {
        int maxNumber = Max.max(5, 5);
        assertThat(maxNumber, is(5));
    }

    @Test
    public void whenThreeNumbers() {
        int maxNumber = Max.max(5, 10, 1);
        assertThat(maxNumber, is(10));
    }

    @Test
    public void whenFourNumbers() {
        int maxNumber = Max.max(3, 4, 16, 2);
        assertThat(maxNumber, is(16));
    }

}