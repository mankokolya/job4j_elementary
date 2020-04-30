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

    @Test
    public void distance3D() {
        Point a = new Point(1, 0, 4);
        Point b = new Point(0, 2, 5);
        Assert.assertEquals(a.distance3D(b), 2.45, 0.01);
    }
}