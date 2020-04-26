package ru.job4j.calculator;

public class Fit {
    public static double manWeight(double height) {
         return (height - 100) * 1.15;
    }

    public static double womanWeight(double height) {
        return (height - 110) * 1.15;
    }

    public static void main(String[] args) {
        double manIdealWeight = Fit.manWeight(180);
        System.out.println("Ideal weight of 180 centimeters tall man is " + manIdealWeight + " kilograms.");
        double womanIdealWeight = Fit.womanWeight(160);
        System.out.println("Ideal weight of 160 centimeters tall woman is " + womanIdealWeight + " kilograms.");

    }
}
