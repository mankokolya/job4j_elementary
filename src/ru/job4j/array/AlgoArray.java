package ru.job4j.array;

public class AlgoArray {
    public static void main(String[] args) {
        int[] array = new int[]{5, 3, 2, 1, 4};
        SwitchArray.swap(array, 3, 0);
        SwitchArray.swap(array, 2, 1);
        SwitchArray.swap(array, 4, 3);
        for (int number : array) {
            System.out.println(number);
        }
    }
}
