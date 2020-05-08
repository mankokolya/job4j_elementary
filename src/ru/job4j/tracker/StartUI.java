package ru.job4j.tracker;

public class StartUI {

    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            int select = input.askInt(showMenu());
            run = action(select, input, tracker, true);
        }
    }

    private boolean action(int select, Input input, Tracker tracker, boolean run) {
        Item item;
        String name;
        switch (select) {
            case 0:
                System.out.println("=== Add a new Item ====");
                name = input.askStr("Enter name: ");
                item = new Item(name);
                tracker.add(item);
                break;
            case 1:
                System.out.println("=== Show all Items ====");
                Item[] allItems = tracker.findAll();
                for (Item element : allItems) {
                    System.out.println(element);
                }
                break;
            case 2:
                System.out.println("=== Replace an Item ====");
                String id = input.askStr("Enter id: ");
                name = input.askStr("Enter a new name: ");
                item = new Item(name);
                if (tracker.replace(id, item)) {
                    System.out.println("Item with id: " + id + " was replaced by the item " + item.getId());
                } else {
                    System.out.println("Item with id: " + id + "wasn't found in the tracker.");
                }
                break;
            case 3:
                System.out.println("=== Delete an Item ====");
                id = input.askStr("Enter id: ");
                if (tracker.delete(id)) {
                    System.out.println("Item with id: " + id + " was deleted from tracker");
                } else {
                    System.out.println("Item with id: " + id + "wasn't found in the tracker.");
                }
                tracker.delete(id);
                break;
            case 4:
                System.out.println("=== Find an Item by ID ====");
                id = input.askStr("Enter id: ");
                item = tracker.findById(id);
                if (item != null) {
                    System.out.println(item);
                } else {
                    System.out.println("Item with id: " + id + " not found in the tracker.");
                }
                break;
            case 5:
                System.out.println("=== Find items by Name ====");
                name = input.askStr("Enter a name: ");
                Item[] sameNameItems = tracker.findByName(name);
                if (sameNameItems.length > 0) {
                    for (Item element : sameNameItems) {
                        System.out.println(element);
                    }
                } else {
                    System.out.println("There is no item with name: \" " + name + "\" in the tracker");
                }
                break;
            case 6:
                System.out.println("Exit");
                run = false;
                break;
            default:
                while (select < 0 || select > 6) {
                    System.out.println("Wrong choice. Please try again!!!");
                    select = input.askInt(this.showMenu());
                }
                break;
        }
        return run;
    }

    private String showMenu() {
        return "Menu." + System.lineSeparator()
                + "0. Add new Item" + System.lineSeparator()
                + "1. Show all items" + System.lineSeparator()
                + "2. Replace item" + System.lineSeparator()
                + "3. Delete item" + System.lineSeparator()
                + "4. Find item by Id" + System.lineSeparator()
                + "5. Find items by Name" + System.lineSeparator()
                + "6. Exit Program" + System.lineSeparator()
                + "Select:";
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }
}
