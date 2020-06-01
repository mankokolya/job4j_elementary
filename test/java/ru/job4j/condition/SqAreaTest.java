package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void squareAreaWithP6K2() {
        double expectedSquareArea = 2.0;
        double actualSquareArea = SqArea.squareArea(6, 2);
        Assert.assertEquals(expectedSquareArea, actualSquareArea, 0.01);
    }

    @Test
    public void squareAreaWithP10K6() {
        double expectedSquareArea = 3.06;
        double actualSquareArea = SqArea.squareArea(10, 6);
        Assert.assertEquals(expectedSquareArea, actualSquareArea, 0.01);
    }
}