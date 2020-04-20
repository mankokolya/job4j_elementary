package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void distanceFromPoint1ToPoint2() {
        double distance = Point.distance(0, 0, 2, 0);
        double expectedDistance = 2.0;
        Assert.assertEquals(distance, expectedDistance, 0.01);
    }
}