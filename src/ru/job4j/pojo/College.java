package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student nick = new Student();
        nick.setFullName("Manko Mykola");
        nick.setGroup("215");
        nick.setStartingDate("June 2007");

        System.out.println(nick.getFullName() + " started to study at group " + nick.getGroup() + " in " + nick.getStartingDate());
    }
}
