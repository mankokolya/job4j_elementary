package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void distanceFromPoint1ToPoint2() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double distance = a.distance(b);
        double expectedDistance = 2.0;
        Assert.assertEquals(distance, expectedDistance, 0.01);
    }
}