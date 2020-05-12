package ru.job4j.oop;

public class Jukebox {
    public void music(int variant) {
        switch (variant) {
            case 1:
                System.out.println("Пусть бегут неуклюжи");
                break;
            case 2:
                System.out.println("Спокойной ночи малыши");
                break;
            default:
                System.out.println("Песня не найдена");
        }
    }

    public static void main(String[] args) {
        Jukebox track1 = new Jukebox();
        Jukebox track2 = new Jukebox();
        Jukebox trackAbsent = new Jukebox();
        track1.music(1);
        track2.music(2);
        trackAbsent.music(3);
    }
}
