package ru.job4j.oop.inheritance;

public class Doctor extends Profession {
    private String specialization;

    public Doctor(String name, String surname, String education, String birthday, String specialization) {
        super(name, surname, education, birthday);
        this.specialization = specialization;
    }

    public Diagnose heal(Patient patient) {
        return null;
    }
}
