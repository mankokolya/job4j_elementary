package ru.job4j.tracker;

import org.hamcrest.Matcher;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class TrackerTest {

    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1");
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result.getName(), is(item.getName()));
    }

    @Test
    public void findAll() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("item1");
        Item item2 = new Item("item2");
        Item item3 = new Item("item3");
        Item item4 = new Item("item4");
        Item item5 = new Item("item5");
        tracker.add(item1);
        tracker.add(item2);
        tracker.add(item3);
        tracker.add(item4);
        tracker.add(item5);
        Item[] result = tracker.findAll();
        assertThat(result, is(new Item[] {item1, item2, item3, item4, item5}));
    }

    @Test
    public void findByName() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("item1");
        Item item2 = new Item("item2");
        Item item3 = new Item("item3");
        Item item4 = new Item("item4");
        Item item5 = new Item("item5");
        tracker.add(item1);
        tracker.add(item2);
        tracker.add(item3);
        tracker.add(item4);
        tracker.add(item5);
        Item[] result = tracker.findByName("item4");
        assertThat(result, is(new Item[] {item4}));
    }


    @Test
    public void findById() {
            Tracker tracker = new Tracker();
            Item item1 = new Item("item1");
            Item item2 = new Item("item2");
            Item item3 = new Item("item3");
            Item item4 = new Item("item4");
            Item item5 = new Item("item5");
            tracker.add(item1);
            tracker.add(item2);
            tracker.add(item3);
            tracker.add(item4);
            tracker.add(item5);
            assertThat(tracker.findById(item1.getId()), is(item1));
    }

    @Test
    public void findByIdWhenNotIncluded() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("item1");
        Item item2 = new Item("item2");
        Item item3 = new Item("item3");
        Item item4 = new Item("item4");
        Item item5 = new Item("item5");
        tracker.add(item1);
        tracker.add(item2);
        tracker.add(item3);
        tracker.add(item4);
        tracker.add(item5);
        assertNull(tracker.findById("25681475689"));
    }
}