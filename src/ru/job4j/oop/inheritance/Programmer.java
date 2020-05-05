package ru.job4j.oop.inheritance;

public class Programmer extends Engineer {

    public Programmer(String name, String surname, String education, String birthday, String specialization) {
        super(name, surname, education, birthday, specialization);
    }

    @Override
    public Project makeProject(Customer customer) {
        return null;
    }
}
