package ru.job4j.strategy;

import org.hamcrest.core.Is;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class PaintTest {
    //default console output
    private final PrintStream stdout = System.out;
    //buffer for result
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();

    @Before
    public void loadOutput() {
        System.setOut(new PrintStream(this.out));
    }

    @After
    public void backOutput() {
        System.setOut(this.stdout);
    }

    @Test
    public void whenDrawSquare() {
        new Paint().draw(new Square(5));
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
        assertThat(new String(out.toByteArray()), is(expected));
    }

    @Test
    public void whenDrawTriangle() {
        new Paint().draw(new Triangle(3));
        String expected = new StringJoiner("")
                .add(" *")
                .add(System.lineSeparator())
                .add("***")
                .add(System.lineSeparator())
                .toString();
        assertThat(new String(out.toByteArray()), is(expected));
    }
}