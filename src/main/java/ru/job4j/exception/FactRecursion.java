package ru.job4j.exception;

public class FactRecursion {
    public static int calculate(int number) {
        if (number == 0 || number == 1) {
            return 1;
        }
        return calculate(number - 1) * number;
    }

    public static void main(String[] args) {
        int result = calculate(5);
        System.out.println(result);
    }
}
