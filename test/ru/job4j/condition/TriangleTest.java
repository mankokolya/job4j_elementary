package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class TriangleTest {

    @Test
    public void whenExist() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        Point c = new Point(2, 0);
        Triangle triangle = new Triangle(a, b, c);
        assertEquals(triangle.area(), 1.73, 0.01);
    }

    @Test
    public void whenNotExist() {
        Point a = new Point(1, 0);
        Point b = new Point(1, 0);
        Point c = new Point(3, 0);
        Triangle triangle = new Triangle(a, b, c);
        assertThat(triangle.area(), is(-1.0));
    }
}