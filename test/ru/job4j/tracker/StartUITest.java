package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class StartUITest {

    @Test
    public void addItem() {
        String[] answers = {"Fix PC"};
        Input input = new StableInput(answers);
        Tracker tracker = new Tracker();
        StartUI.addItem(input, tracker);
        Item created = tracker.findAll()[0];
        Item expected = new Item("Fix PC");
        assertThat(created.getName(), is(expected.getName()));
    }
}