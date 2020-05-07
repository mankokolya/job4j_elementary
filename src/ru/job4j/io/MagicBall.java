package ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

public class MagicBall {
    public static void main(String[] args) {
        System.out.println("Hello! I am a predictor.");
        System.out.println("Ask me something that can be answered with \"Yes\", \"No\", \"Maybe\"");
        String question = new Scanner(System.in).nextLine();
        int answer = new Random().nextInt(3);
        System.out.println("You asked me: " + question);
        System.out.println("My answer to your question is - " + prediction(answer));
    }

    private static String prediction(int choice) {
        String answer;
        switch (choice){
            case 0:
                answer = "Yes";
                break;
            case 1:
                answer = "No";
                break;
            default:
                answer = "Maybe";
                break;
        }
        return answer;
    }
}
