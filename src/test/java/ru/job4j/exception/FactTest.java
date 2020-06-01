package ru.job4j.exception;

import org.junit.Test;

import static org.junit.Assert.*;

public class FactTest {

    @Test(expected = IllegalArgumentException.class)
    public void calcFactMinus2() {
        Fact factorial = new Fact();
        factorial.calc(-2);
    }
}