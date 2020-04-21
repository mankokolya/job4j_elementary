package ru.job4j.condition;

public class MultiMax {
    public int max(int first, int second, int third){
        int maxFirstSecond = first >= second ? first : second;
        int maxNumber = maxFirstSecond >= third ? maxFirstSecond : third;
        return maxNumber;
    }
}
