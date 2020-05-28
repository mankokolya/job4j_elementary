package ru.job4j.tracker;

import java.util.*;

public class Tracker {

    /**
     * Массив для хранение заявок.
     */
    private final List<Item> items = new ArrayList<>();

    /**
     * Метод реализующий добавление заявки в хранилище;
     *
     * @param item новая заявка
     */
    public Item add(Item item) {
        item.setId(generateId());
        this.items.add(item);
        return item;
    }

    /**
     * Метод генерирует уникальный ключ для заявки.
     * Так как у заявки нет уникальности полей, имени и описание. Для идентификации нам нужен уникальный ключ.
     *
     * @return Уникальный ключ.
     */
    private String generateId() {
        Random random = new Random();
        return String.valueOf(System.currentTimeMillis() + random.nextLong());
    }

    /**
     * This method finds all tasks included in tracker;
     *
     * @return - array of tasks in tracker without empty cells;
     */
    public List<Item> findAll() {
        return this.items;
    }

    /**
     * @param name - name of the task you are looking for;
     * @return - - array of all tasks in tracker with the same name without empty cells;
     */
    public List<Item> findByName(String name) {
        List<Item> itemsByName = new ArrayList<>();
        for (Item item : this.items) {
            if (item != null) {
                if (item.getName().equals(name)) {
                    itemsByName.add(item);
                }
            }
        }
        return itemsByName;
    }

    /**
     * @param id - identification number of the task you are looking for in the tracker;
     * @return - the task you are looking for if it is not in the tracker then null is returned;
     */
    public Item findById(String id) {
        int index = indexOf(id);
        return index != -1 ? items.get(index) : null;
    }

    /**
     * @param id   - identification number of the task you are looking for in the tracker;
     * @param item - new task you want to replace the old one with provided id;
     * @return - if id is found in tracker we replace the item with the new one;
     */
    public boolean replace(String id, Item item) {
        int index = indexOf(id);
        boolean result = index != -1;
        if (result) {
            item.setId(id);
            this.items.set(index, item);
        }
        return result;
    }

    /**
     * @param id - identification number of the task you are looking for in the tracker;
     * @return - index of task in array;
     */
    private int indexOf(String id) {
        int caseNotFound = -1;
        int index = 0;
        for (Item item : this.items) {
            if (item.getId().equals(id)) {
                return index;
            }
            index++;
        }
        return caseNotFound;
    }

    public boolean delete(String id) {
        int index = indexOf(id);
        boolean result = index != -1;
        if (result) {
            this.items.remove(index);
        }
        return result;
    }
}
