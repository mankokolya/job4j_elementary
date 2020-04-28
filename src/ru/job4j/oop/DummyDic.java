package ru.job4j.oop;

public class DummyDic {
    public String engToRus(String eng) {
        return "Unknown word - " + eng;
    }

    public static void main(String[] args) {
        DummyDic engToRusDic = new DummyDic();
        System.out.println(engToRusDic.engToRus("encapsulation"));
    }
}
