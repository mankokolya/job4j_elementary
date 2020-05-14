package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Random;

public class Tracker {

    /**
     * Массив для хранение заявок.
     */
    private final Item[] items = new Item[100];

    /**
     * Указатель ячейки для новой заявки.
     */
    private int position = 0;

    /**
     * Метод реализующий добавление заявки в хранилище;
     *
     * @param item новая заявка
     */
    public Item add(Item item) {
        item.setId(generateId());
        this.items[position++] = item;
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
    public Item[] findAll() {
        return Arrays.copyOf(items, position);
    }

    /**
     * @param name - name of the task you are looking for;
     * @return - - array of all tasks in tracker with the same name without empty cells;
     */
    public Item[] findByName(String name) {
        Item[] itemsByName = new Item[position];
        int size = 0;
        for (int i = 0; i < position; i++) {
            if (this.items[i] != null) {
                if (this.items[i].getName().equals(name)) {
                    itemsByName[size++] = this.items[i];
                }
            }
        }
        return Arrays.copyOf(itemsByName, size);
    }

    /**
     * @param id - identification number of the task you are looking for in the tracker;
     * @return - the task you are looking for if it is not in the tracker then null is returned;
     */
    public Item findById(String id) {
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
    }

    /**
     * @param id   - identification number of the task you are looking for in the tracker;
     * @param item - new task you want to replace the old one with provided id;
     * @return - if id is found in tracker we replace the item with the new one;
     */
    public boolean replace(String id, Item item) {
        int index = indexOf(id);
        boolean result =  index != -1;
        if (result) {
            item.setId(id);
            items[index] = item;
        }
        return result;
    }

    /**
     * @param id - identification number of the task you are looking for in the tracker;
     * @return - index of task in array;
     */
    private int indexOf(String id) {
        int result = -1;
        for (int i = 0; i < position; i++) {
            if (this.items[i].getId().equals(id)) {
                result = i;
                break;
            }
        }
        return result;
    }

    public boolean delete(String id) {
        int index = indexOf(id);
        boolean result = index != -1;
        if (result) {
            items[index] = null;
            System.arraycopy(items, index + 1, items, index, position - index);
            items[position - 1] = null;
            position--;
        }
        return result;
    }
}
