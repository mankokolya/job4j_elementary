package ru.job4j.condition;

public class SqArea {
    public static double squareArea(int p, int k) {
        double height = p / (2.0 * (k + 1));
        double length = height * k;
        return length * height;
    }

    public static void main(String[] args) {
        double result = SqArea.squareArea(6, 2);
        System.out.println("The square area of the rectangle with p = 6, k = 2 is: " + result);
    }
}
