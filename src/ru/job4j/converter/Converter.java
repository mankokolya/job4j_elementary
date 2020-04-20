package ru.job4j.converter;

public class Converter {

    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static void main(String[] args) {
        int rubleToEuroInputValue = 140;
        int euroExpectedValue = 2;
        int euroConverted = Converter.rubleToEuro(rubleToEuroInputValue);
        boolean rubleToEuro = euroExpectedValue == euroConverted;
        System.out.println("140 rubles are 2 euros. Test result: " + rubleToEuro);

        int rubleToDollarInputValue = 200;
        int dollarsExpectedValue = 3;
        int dollarsConverted = Converter.rubleToDollar(rubleToDollarInputValue);
        boolean rubleToDollar = dollarsExpectedValue == dollarsConverted;
        System.out.println("200 rubles are 3 dollars. Test result: " +  rubleToDollar);
    }
}
