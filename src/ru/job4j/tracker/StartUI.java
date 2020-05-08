package ru.job4j.tracker;

import java.util.Scanner;

public class StartUI {


    public void init(Scanner scanner, Tracker tracker, boolean run) {
        while (run) {
            this.showMenu();
            int select = new Scanner(System.in).nextInt();
            run = action(select, scanner, tracker, true);
        }
    }

    private boolean action(int select, Scanner scanner, Tracker tracker, boolean run) {
        Item item;
        String name;
        switch (select) {
            case 0:
                System.out.println("=== Add a new Item ====");
                System.out.print("Enter name: ");
                name = scanner.nextLine();
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
                System.out.print("Enter id: ");
                String id = scanner.nextLine();
                System.out.println("Enter a new name: ");
                name = new Scanner(System.in).nextLine();
                item = new Item(name);
                if (tracker.replace(id, item)) {
                    System.out.println("Item with id: " + id + " was replaced by the item " + item.getId());
                } else {
                    System.out.println("Item with id: " + id + "wasn't found in the tracker.");
                }
                break;
            case 3:
                System.out.println("=== Delete an Item ====");
                System.out.print("Enter id: ");
                id = scanner.nextLine();
                if (tracker.delete(id)) {
                    System.out.println("Item with id: " + id + " was deleted from tracker");
                } else {
                    System.out.println("Item with id: " + id + "wasn't found in the tracker.");
                }
                tracker.delete(id);
                break;
            case 4:
                System.out.println("=== Find an Item by ID ====");
                System.out.print("Enter id: ");
                id = scanner.nextLine();
                item = tracker.findById(id);
                if (item != null) {
                    System.out.println(item);
                } else {
                    System.out.println("Item with id: " + id + " not found in the tracker.");
                }
                break;
            case 5:
                System.out.println("=== Find items by Name ====");
                System.out.print("Enter a name: ");
                name = scanner.nextLine();
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
                    this.showMenu();
                    select = new Scanner(System.in).nextInt();
                }
                break;
        }
        return run;
    }

    private void showMenu() {
        System.out.println("Menu.");
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Replace item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by Name");
        System.out.println("6. Exit Program");
        System.out.println("Select:");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        boolean run = true;
        new StartUI().init(scanner, tracker, run);
    }
}
