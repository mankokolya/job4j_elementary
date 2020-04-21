package ru.job4j.condition;

public class AlertDivisionByZero {
    public static void main(String[] args) {
        possibleDiv(4);
        possibleDiv(0);
        possibleDiv(-2);
    }

    public static void possibleDiv(int i) {
        if(i == 0){
            System.out.println("Could not div by 0.");
        }
        if(i < 0) {
            System.out.println("This is negative numbers.");
        }
    }
}
