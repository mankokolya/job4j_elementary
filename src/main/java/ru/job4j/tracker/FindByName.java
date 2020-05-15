package ru.job4j.tracker;

public class FindByName implements UserAction {
    @Override
    public String name() {
        return "=== Find items by Name ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String name = input.askStr("Enter a name: ");
        Item[] sameNameItems = tracker.findByName(name);
        if (sameNameItems.length > 0) {
            for (Item element : sameNameItems) {
                System.out.println(element);
            }
        } else {
            System.out.println("There is no item with name: \" " + name + "\" in the tracker");
        }
        return true;
    }
}
