package ru.job4j.condition;

public class StringEq {
    public static void main(String[] args) {
        String yourName = "your_name";
        boolean userHasAccess = StringEq.check(yourName);
        System.out.println(userHasAccess);
    }

    public static boolean check(String login) {
        String root = "root";
        return root.equals(login);
    }
}
