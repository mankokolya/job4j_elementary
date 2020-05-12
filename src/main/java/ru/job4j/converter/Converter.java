package ru.job4j.converter;

/**
 *  Converter - used to convert ruble to dollar and ruble to euro
 *
 * @author mankokolya
 */

public class Converter {
    /**
     *
     * rubleToEuro - is used to convert certain amount of rubles to euros according to the exchange course
     * @param value - amount of money to convert;
     * @return - amount of euros we get after changing ruble to euro;
     */
    public static int rubleToEuro(int value) {
        return value / 70;
    }

    /**
     * rubleToDollar - is used to convert certain amount of rubles to dollars according to the exchange course
     *
     * @param value- amount of money to convert;
     * @return - amount of dollars we get after changing ruble to euro;
     */
    public static int rubleToDollar(int value) {
        return value / 60;
    }
}
