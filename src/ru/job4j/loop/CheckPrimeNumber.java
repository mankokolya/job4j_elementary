package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean checkPrimeNumber(int number) {
        boolean prime = false;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                break;
            } else{
                prime = true;
            }
        }
        return prime;
    }
}
