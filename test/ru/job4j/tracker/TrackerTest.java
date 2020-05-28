package ru.job4j.tracker;

import org.hamcrest.Matcher;
import org.junit.Test;

import java.util.*;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.*;

public class TrackerTest {
    private Tracker tracker = new Tracker();

    @Test
    public void whenSortAscendingOrder() {
        Item item1 = new Item("item1");
        Item item2 = new Item("item2");
        Item item3 = new Item("item3");
        Item item4 = new Item("item4");
        Item item5 = new Item("item5");
        List<Item> input = Arrays.asList(item2, item1, item4, item3, item5);
        List<Item> expected = Arrays.asList(item1, item2, item3, item4, item5);
        Collections.sort(input);
        assertEquals(input, expected);
    }

    @Test
    public void whenSortDescendingOrder() {
        Item item1 = new Item("item1");
        Item item2 = new Item("item2");
        Item item3 = new Item("item3");
        Item item4 = new Item("item4");
        Item item5 = new Item("item5");
        List<Item> input = Arrays.asList(item2, item1, item4, item3, item5);
        List<Item> expected = Arrays.asList(item5, item4, item3, item2, item1);
        Collections.sort(input, Collections.reverseOrder());
        assertEquals(input, expected);
    }

    @Test
    public void whenSortAscendingOrderById() {
        Item item1 = new Item("item1");
        Item item2 = new Item("item2");
        Item item3 = new Item("item3");
        Item item4 = new Item("item4");
        Item item5 = new Item("item5");
        item1.setId("6");
        item2.setId("7");
        item3.setId("8");
        item4.setId("9");
        item5.setId("10");
        List<Item> input = Arrays.asList(item2, item1, item4, item3, item5);
        List<Item> expected = List.of(item1, item2, item3, item4, item5);
        Collections.sort(input, new CompareItemById());
        assertEquals(expected, input);
    }

    @Test
    public void whenSortDescendingOrderById() {
        Item item1 = new Item("item1");
        Item item2 = new Item("item2");
        Item item3 = new Item("item3");
        Item item4 = new Item("item4");
        Item item5 = new Item("item5");
        item1.setId("6");
        item2.setId("7");
        item3.setId("8");
        item4.setId("9");
        item5.setId("10");
        List<Item> input = Arrays.asList(item2, item1, item4, item3, item5);
        List<Item> expected = Arrays.asList(item5, item4, item3, item2, item1);
        Comparator comparator = Collections.reverseOrder(new CompareItemById());
        Collections.sort(input, comparator);
        assertEquals(input, expected);
    }

    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Item item = new Item("test1");
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result.getName(), is(item.getName()));
    }

    @Test
    public void findAll() {
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
        List<Item> result = tracker.findAll();
        List<Item> expect = new ArrayList<>();
        expect.add(item1);
        expect.add(item2);
        expect.add(item3);
        expect.add(item4);
        expect.add(item5);
        assertThat(result, is(expect));
    }

    @Test
    public void findByName() {
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
        List<Item> result = tracker.findByName("item4");
        List<Item> expect = new ArrayList<>();
        expect.add(item4);
        assertThat(result, is(expect));
    }


    @Test
    public void findById() {
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

    @Test
    public void whenReplace() {
        Item bug = new Item("Bug");
        tracker.add(bug);
        String id = bug.getId();
        Item bugWithDesc = new Item("Bug with description");
        tracker.replace(id, bugWithDesc);
        assertThat(tracker.findById(id).getName(), is("Bug with description"));
    }

    @Test
    public void whenDelete() {
        Item bug = new Item("Bug");
        tracker.add(bug);
        String id = bug.getId();
        tracker.delete(id);
        assertThat(tracker.findById(id), is(nullValue()));
    }
}