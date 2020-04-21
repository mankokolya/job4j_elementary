package ru.job4j.loop;

public class Counter {
    public static int sum(int start, int finish) {
        int sum = 0;
        for (int i = start; i <= finish; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(Counter.sum(5, 25));
        System.out.println(Counter.sum(25, 65));
        System.out.println(Counter.sum(-5, 12));
    }
}
