package ru.job4j.loop;

public class Factorial {
    public static int factorial(int number) {
        int result = 1;

        for (int i = 2; i <= number; i++) {
            result *= i;
        }

        return result;
    }
}
