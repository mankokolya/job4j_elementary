package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class CounterTest {

   @Test
    public void whenSumNumbersFromOneToTenThenThirty() {
        int rsl = Counter.sum(1, 9);
        int expected = 45;
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int rsl = Counter.sumByEven(1, 10);
        int expected = 30;
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenSumEvenNumbersFromTenToFortyThenFourHundred() {
        int rsl = Counter.sumByEven(10, 40);
        int expected = 400;
        assertThat(rsl, is(expected));
    }
}