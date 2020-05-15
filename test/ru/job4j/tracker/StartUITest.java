package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class StartUITest {

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