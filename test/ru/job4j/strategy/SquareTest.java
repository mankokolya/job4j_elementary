package ru.job4j.strategy;

import org.junit.Test;

import java.util.StringJoiner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SquareTest {

    @Test
    public void whenDrawSquare() {
        Square square = new Square(5);
        String expected = new StringJoiner("")
                .add("*****")
                .add(System.lineSeparator())
                .add("*   *")
                .add(System.lineSeparator())
                .add("*   *")
                .add(System.lineSeparator())
                .add("*   *")
                .add(System.lineSeparator())
                .add("*****")
                .add(System.lineSeparator())
                .toString();
        assertThat(square.draw(), is(expected));
    }
}