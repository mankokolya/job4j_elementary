package ru.job4j.oop.inheritance;

public class Patient extends Profession {
    private String complaints;

    public Patient(String name, String surname, String education, String birthday, String complaints) {
        super(name, surname, education, birthday);
        this.complaints = complaints;
    }

    public String getComplaints() {
        return complaints;
    }

    public boolean getSick() {
        return true;
    }
}
