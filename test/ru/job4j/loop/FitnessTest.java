package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class FitnessTest {

    @Test
    public void whenIvanGreatNik() {
        int month = Fitness.calcTime(95, 90);
        assertThat(month, is(0));
    }

    @Test
    public void whenIvanLessByOneNik() {
        int month = Fitness.calcTime(90, 95);
        assertThat(month, is(1));
    }

    @Test
    public void whenIvanLessByFewNik() {
        int month = Fitness.calcTime(50, 90);
        assertThat(month, is(2));
    }
}