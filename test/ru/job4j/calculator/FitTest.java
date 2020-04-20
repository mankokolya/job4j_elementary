package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

public class FitTest {

    @Test
    public void manWeight() {
        double manHeight = 180; //centimeters
        double expectedIdealWeight = 92.0; // kilogram
        double manActualWeight = Fit.manWeight(manHeight);
        Assert.assertEquals(expectedIdealWeight, manActualWeight, 0.01);
    }

    @Test
    public void womanWeight() {
        double womanHeight = 160; //centimeters
        double expectedIdealWeight = 57.49; // kilogram
        double womanActualWeight = Fit.womanWeight(womanHeight);
        Assert.assertEquals(expectedIdealWeight, womanActualWeight, 0.01);
    }
}
