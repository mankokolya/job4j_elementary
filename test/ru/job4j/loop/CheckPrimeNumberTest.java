package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class CheckPrimeNumberTest {

    @Test
    public void when5() {
        boolean rsl = CheckPrimeNumber.checkPrimeNumber(5);
        assertThat(rsl, is(true));
    }

    @Test
    public void when4() {
        boolean rsl = CheckPrimeNumber.checkPrimeNumber(4);
        assertThat(rsl, is(false));
    }

    @Test
    public void when1() {
        boolean rsl = CheckPrimeNumber.checkPrimeNumber(1);
        assertThat(rsl, is(false));
    }

    @Test
    public void when2() {
        boolean rsl = CheckPrimeNumber.checkPrimeNumber(2);
        assertThat(rsl, is(true));
    }
}