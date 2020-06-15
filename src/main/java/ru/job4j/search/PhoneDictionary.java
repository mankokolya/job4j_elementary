package ru.job4j.search;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {
    private final ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Person> find(String key) {
        Predicate<Person> checkName = person -> person.getName().contains(key);
        Predicate<Person> checkSurname = person -> person.getSurname().contains(key);
        Predicate<Person> checkAddress = person -> person.getAddress().contains(key);
        Predicate<Person> checkPhone = person -> person.getPhone().contains(key);
        Predicate<Person> combine = checkName.or(checkSurname).or(checkAddress).or(checkPhone);

        var result = new ArrayList<Person>();
        for (Person person : this.persons) {
            if (combine.test(person)) {
                result.add(person);
            }
        }
        return result;


    }
}
