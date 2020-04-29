package ru.job4j.oop;

public class Cat {
    private String food;
    private String name;

    public void giveNickname(String nickname) {
        this.name = nickname;
    }

    public void show() {
        System.out.println(this.name + "'s " + this.food);
    }

    public void eat(String eating) {
        this.food = eating;
    }

    public static void main(String[] args) {
        System.out.println("This is Gav's food.");
        Cat gav = new Cat();
        gav.giveNickname("Gav");
        gav.eat("cutlet");
        gav.show();
        System.out.println("This is Black's food");
        Cat black = new Cat();
        black.giveNickname("Black");
        black.eat("fish");
        black.show();
    }
}
