package ru.job4j.tracker;

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
        String[] data = {"one", "1"};
        ValidateInput input = new ValidateStableInput(data);
        input.askInt("Enter");
        assertThat(new String(out.toByteArray()), is(String.format("Please enter a valid data again.%n")));
        System.setOut(def);
    }

    @Test(expected = IllegalArgumentException.class)
    public void whenOutOfRangeInput()  {
        String[] data = {"8"};
        ValidateInput input = new ValidateStableInput(data);
        input.askInt("Enter", 7);
    }
}