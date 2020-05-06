package ru.job4j.tracker;

import com.sun.source.tree.IfTree;

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
     * Метод реализующий добавление заявки в хранилище
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
     * @return - array of tasks in tracker without empty cells;
     */
    public Item[] findAll() {
        Item[] itemsWithoutNull = new Item[this.items.length];
        int size = 0;
        for (int i = 0; i < this.items.length; i++) {
            if (this.items[i] != null) {
                itemsWithoutNull[size++] = this.items[i];
            }
        }
        return Arrays.copyOf(itemsWithoutNull, size);
    }

    /**
     *
     * @param name - name of the task you are looking for;
     * @return - - array of all tasks in tracker with the same name without empty cells;
     */
    public Item[] findByName(String name) {
        Item[] itemsByName = new Item[this.items.length];
        int size = 0;
        for (int i = 0; i < this.items.length; i++) {
            if (this.items[i] != null) {
                if (this.items[i].getName().equals(name)) {
                    itemsByName[size++] = this.items[i];
                }
            }
        }
        return Arrays.copyOf(itemsByName, size);
    }

    /**
     *
     * @param id - identification number of the task you are looking for in the tracker;
     * @return - the task you are looking for if it is not in the tracker then null is returned;
     */
    public Item findById(String id) {
        for (int i = 0; i < this.items.length; i++) {
            if (this.items[i] != null) {
                if (this.items[i].getId().equals(id)) {
                    return this.items[i];
                }
            }
        }
        return null;
    }
}
