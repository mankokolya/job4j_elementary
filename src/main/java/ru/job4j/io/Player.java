package ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

public class Player {
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int makeMove(int totalNumber, String name) {
        Scanner input = new Scanner(System.in);
        System.out.println("It's " + name + "'s turn.");
        System.out.println("Please enter a number from 1 to 3: ");
        int move = Integer.parseInt(input.nextLine());
        while (move <= 0 || move > 3) {
            System.out.println("Illegal move!");
            System.out.println("Please enter a number from 1 to 3");
            move = Integer.parseInt(input.nextLine());
        }
        System.out.println((totalNumber - move) + " - matches left;");
        return totalNumber - move;
    }
}
