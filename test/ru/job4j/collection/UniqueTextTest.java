package ru.job4j.collection;

import org.junit.Test;

import static org.junit.Assert.*;

public class UniqueTextTest {

    @Test
    public void isEquals() {
        String origin = "My cat eats a mouse";
        String text = "My cat eats a mouse";
        assertEquals(UniqueText.isEquals(origin, text), true);
    }

    @Test
    public void notEquals() {
        String origin = "My cat eats a mouse";
        String text = "My cat eats cheese";
        assertEquals(UniqueText.isEquals(origin, text), false);
    }

    @Test
    public void isNotEquals() {
        String origin = "My cat eats a mouse";
        String text = "A mouse was eaten by cat";
        assertEquals(UniqueText.isEquals(origin, text), false);
    }
}