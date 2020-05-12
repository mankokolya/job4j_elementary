package ru.job4j.oop.inheritance;

public class Surgeon extends Doctor {

    public Surgeon(String name, String surname, String education, String birthday, String specialization) {
        super(name, surname, education, birthday, specialization);
    }

    @Override
    public Diagnose heal(Patient patient) {
        return null;
    }
}
