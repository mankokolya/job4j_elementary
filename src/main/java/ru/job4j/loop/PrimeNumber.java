package ru.job4j.loop;

public class PrimeNumber {
    public int calcPrimeNumbers(int finish) {
        int count = 0;
        for (int i = 0; i <= finish; i++) {
            if (CheckPrimeNumber.checkPrimeNumber(i)) {
                ++count;
            }
        }
        return count;
    }
}
