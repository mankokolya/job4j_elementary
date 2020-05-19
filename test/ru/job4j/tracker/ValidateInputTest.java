package ru.job4j.tracker;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class ValidateInputTest {

    @Test
    public void whenInvalidInput() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream def = System.out;
        System.setOut(new PrintStream(out));

        ValidateInput input = new ValidateInput(new StableInput(new String[]{"one", "1"}));
        input.askInt("Enter");
        assertThat(new String(out.toByteArray()), is(String.format("Please enter a valid data again.%n")));
        System.setOut(def);
    }

    @Test
    public void whenOutOfRangeInput()  {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream def = System.out;
        System.setOut(new PrintStream(out));

        String[] data = {"8"};
        ValidateInput input = new ValidateInput(new StableInput(data));
        input.askInt("Enter", 7);
        assertThat(new String(out.toByteArray()), is(String.format("Please select key from menu.%n")));
        System.setOut(def);
    }
}