package ru.job4j.oop;

public class BunStory {
    public static void main(String[] args) {
        Hare hare = new Hare();
        Wolf wolf = new Wolf();
        Fox fox = new Fox();
        Bun bun = new Bun();

        bun.runAway();
        hare.eat(bun);
        bun.sing();
        bun.runAway();
        wolf.eat(bun);
        bun.sing();
        bun.runAway();
        fox.eat(bun);
    }
}
