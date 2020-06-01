package ru.job4j.tracker;

import org.junit.Test;
import ru.job4j.tracker.Tracker;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class StartUITest {
    private Tracker tracker = new Tracker();
    private StubAction[] actions = createStubActionList();

    @Test
    public void whenCreateCall() {
        StableInput input = new StableInput(new String[]{"0"});
        new StartUI().init(input, new Tracker(), actions);
        assertThat(actions[0].isCall(), is(true));
    }

    @Test
    public void whenShowAllCall() {
        StableInput input = new StableInput(new String[]{"1"});
        new StartUI().init(input, new Tracker(), actions);
        assertThat(actions[1].isCall(), is(true));
    }

    @Test
    public void whenReplaceCall() {
        StableInput input = new StableInput(new String[]{"2"});
        new StartUI().init(input, new Tracker(), actions);
        assertThat(actions[2].isCall(), is(true));
    }

    @Test
    public void whenDeleteCall() {
        StableInput input = new StableInput(new String[]{"3"});
        new StartUI().init(input, new Tracker(), actions);
        assertThat(actions[3].isCall(), is(true));
    }

    @Test
    public void whenFindByIdCall() {
        StableInput input = new StableInput(new String[]{"4"});
        new StartUI().init(input, new Tracker(), actions);
        assertThat(actions[4].isCall(), is(true));
    }

    @Test
    public void whenFindByNameCall() {
        StableInput input = new StableInput(new String[]{"5"});
        new StartUI().init(input, new Tracker(), actions);
        assertThat(actions[5].isCall(), is(true));
    }

    @Test
    public void whenExit() {
        StableInput input = new StableInput(new String[]{"6"});
        new StartUI().init(input, new Tracker(), actions);
        assertThat(actions[6].isCall(), is(true));
    }

    @Test
    public void addItem() {
        Input input = new StableInput(new String[]{"Fix PC"});
        new CreateAction().execute(input, tracker);
        Item created = tracker.findAll().get(0);
        Item expected = new Item("Fix PC");
        assertThat(created.getName(), is(expected.getName()));
    }


    @Test
    public void whenReplaceItem() {
        Item item = new Item("new item");
        tracker.add(item);
        String[] answers = {item.getId(), "replaced item"};
        new ReplaceItem().execute(new StableInput(answers), tracker);
        Item replaced = tracker.findById(item.getId());
        assertThat(replaced.getName(), is("replaced item"));
    }

    @Test
    public void whenDeleteItem() {
        Item item = new Item("Car");
        tracker.add(item);
        String[] answers = {item.getId()};
        new DeleteItem().execute(new StableInput(answers), tracker);
        Item deleted = tracker.findById(item.getId());
        assertNull(deleted);
    }

    @Test
    public void whenShowMenu() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream def = System.out;
        System.setOut(new PrintStream(out));
        StableInput input = new StableInput(new String[]{"0"});
        StubAction action = new StubAction("Create an Item");
        new StartUI().init(input, new Tracker(), new UserAction[] {action});
        String expect = new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                .add("Menu.")
                .add("0. Create an Item")
                .toString();
        assertThat(new String(out.toByteArray()), is(expect));
        System.setOut(def);
    }


    private StubAction[] createStubActionList() {
        StubAction createAction = new StubAction("Create an Item");
        StubAction showAll = new StubAction("Show all Items");
        StubAction replaceItem = new StubAction("Replace an Item");
        StubAction deleteItem = new StubAction("Delete an Item");
        StubAction findById = new StubAction("Find an Item by ID");
        StubAction findByName = new StubAction("Find the Item by NAME");
        StubAction exit = new StubAction("Exit");
        return new StubAction[]{createAction, showAll, replaceItem, deleteItem, findById, findByName, exit};
    }
}