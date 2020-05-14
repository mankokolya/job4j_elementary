package ru.job4j.strategy;

public class Main {
    public static void main(String[] args) {
        Shape square = new Square(5);
        Shape triangle = new Triangle(7);
        Paint paint = new Paint();
        paint.draw(square);
        paint.draw(triangle);
    }
}
