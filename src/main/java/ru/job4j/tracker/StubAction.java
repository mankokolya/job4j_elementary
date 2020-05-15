package ru.job4j.tracker;

public class StubAction implements UserAction {
    private boolean call = false;
    private String name;

    public StubAction(String name) {
        this.name = name;
    }

    @Override
    public String name() {
        return this.name;
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        call = true;
        return false;
    }

    public boolean isCall() {
        return call;
    }
}
