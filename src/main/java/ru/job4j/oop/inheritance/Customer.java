package ru.job4j.oop.inheritance;

public class Customer extends Profession {
    private String idea;

    public Customer(String name, String surname, String education, String birthday, String idea) {
        super(name, surname, education, birthday);
        this.idea = idea;
    }

    public String getIdea() {
        return idea;
    }
}
