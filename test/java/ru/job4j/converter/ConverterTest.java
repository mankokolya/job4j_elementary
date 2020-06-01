package ru.job4j.converter;

import org.junit.Test;
import org.junit.Assert;

public class ConverterTest {

    @Test
    public void whenConvert140RblThen2Euro() {
        int rubleToEuroInputValue = 140;
        int euroExpectedValue = 2;
        int euroConverted = Converter.rubleToEuro(rubleToEuroInputValue);
        Assert.assertEquals(euroExpectedValue, euroConverted);
    }

    @Test
    public void whenConvert200RblThen3Dollars() {
        int rubleToDollarInputValue = 200;
        int dollarsExpectedValue = 3;
        int dollarsConverted = Converter.rubleToDollar(rubleToDollarInputValue);
        Assert.assertEquals(dollarsExpectedValue, dollarsConverted);
    }
}