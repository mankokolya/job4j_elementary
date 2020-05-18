package ru.job4j.exception;

public class Fact {
    public static void main(String[] args) {
        Fact fact = new Fact();
        System.out.println(fact.calc(-5));

    }
    public int calc(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("number should be greater then 0");
        }
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
