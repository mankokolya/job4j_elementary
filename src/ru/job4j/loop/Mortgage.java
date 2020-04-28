package ru.job4j.loop;

public class Mortgage {
    public static int yearsToRepayMortgage(int loan, int salary, double percent) {
        int year = 0;
        int percentsOnLoan;
        while (loan > 0) {
            percentsOnLoan = (int) ((loan * percent) / 100);
            loan = (loan + percentsOnLoan) - salary;
            year++;
        }
        return year;
    }
}