package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];

        String[] names = new String[4];
        names[0] = "Nick";
        names[1] = "Ira";
        names[2] = "Anna";
        names[3] = "Jonh";

        for (String name : names) {
            System.out.println(name);
        }
    }
}
