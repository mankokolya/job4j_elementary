package ru.job4j.strategy;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class PaintTest {

    @Test
    public void whenDrawSquare() {
        //link to the standard console output
        PrintStream stdout = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        // action that writes to the console
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
                .add(System.lineSeparator())
                .toString();
        assertThat(new String(out.toByteArray()), is(expected));
        System.setOut(stdout);
    }
}