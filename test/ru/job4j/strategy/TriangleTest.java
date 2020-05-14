package ru.job4j.strategy;

import org.junit.Test;

import java.util.StringJoiner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class TriangleTest {

    @Test
    public void whenDrawTriangle() {
        Triangle pyramid = new Triangle(3);
        String expected = new StringJoiner("")
                .add(" *")
                .add(System.lineSeparator())
                .add("***")
                .add(System.lineSeparator())
                .toString();
        assertThat(pyramid.draw(), is(expected));
    }
}