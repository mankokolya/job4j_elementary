package ru.job4j.oop;

public class Jar {
    private int value;

    public Jar(int value) {
        this.value = value;
    }

    public void pour(Jar another) {
        this.value = this.value + another.value;
        another.value = 0;
    }

    public static void main(String[] args) {
        Jar first = new Jar(10);
        Jar second = new Jar(5);
        System.out.println("first jar: " + first.value + ". Second jar: " + second.value);
        first.pour(second);
        System.out.println("first jar: " + first.value + ". Second jar: " + second.value);
    }

}