package ru.job4j.strategy;

public class Main {
    public static void main(String[] args) {
        Shape square = new Square();
        Shape triangle = new Triangle();
        Paint paint = new Paint();
        paint.draw(square);
        paint.draw(triangle);
    }
}
