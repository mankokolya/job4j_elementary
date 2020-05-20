package ru.job4j.tracker;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class ValidateInputTest {
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();
    private final PrintStream def = System.out;

    @Before
    public void loadOutput() {
        System.setOut(new PrintStream(out));
    }

    @After
    public void returnStandardOutput() {
        System.setOut(def);
    }

    @Test
    public void whenInvalidInput() {
        ValidateInput input = new ValidateInput(new StableInput(new String[]{"one", "1"}));
        input.askInt("Enter");
        assertThat(new String(out.toByteArray()), is(String.format("Please enter a valid data again.%n")));
    }

    @Test
    public void whenOutOfRangeInput() {
        String[] data = {"8", "6"};
        ValidateInput input = new ValidateInput(new StableInput(data));
        input.askInt("Enter", 7);
        assertThat(new String(out.toByteArray()), is(String.format("Please select key from menu.%n")));
    }
}