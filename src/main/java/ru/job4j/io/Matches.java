package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Player firstPlayer = new Player(setName());
        Player secondPlayer = new Player(setName());
        int matches = 11;
        while (matches > 0) {
            System.out.println("Welcome to the game!!!");
            matches = firstPlayer.makeMove(matches, firstPlayer.getName());
            checkWinner(matches, firstPlayer.getName());
            matches = secondPlayer.makeMove(matches, secondPlayer.getName());
            checkWinner(matches, secondPlayer.getName());
        }
    }

    private static String setName() {
        System.out.println("Enter your nickname: ");
        return new Scanner(System.in).next();
    }

    private static void checkWinner(int matches, String name) {
        if (matches <= 0) {
            System.out.println(name + " wins!!!");
        }
    }
}
