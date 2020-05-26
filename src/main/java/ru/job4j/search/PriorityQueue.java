package ru.job4j.search;

import java.util.LinkedList;
import java.util.Comparator;

public class PriorityQueue {
    private LinkedList<Task> tasks = new LinkedList<Task>();

    /**
     * This method puts the task in the correspondent position found in the field priority;
     * method add(int index, E value) is used to add the item to the List;
     *
     * @param task - element to add;
     */
    public void put(Task task) {
        int index = 0;
        if (this.tasks.size() != 0) {
            for (Task element : this.tasks) {
                if (element.getPriority() > task.getPriority()) {
                    break;
                }
                index++;
            }
        }
        this.tasks.add(index, task);
    }
    public Task take() {
        return tasks.poll();
    }
}
