package ru.job4j.collection;

import java.util.HashSet;
import java.util.Set;

public class UsageHashSet {
    public static void main(String[] args) {
        HashSet<String> autos = new HashSet<>();
        autos.add("Lada");
        autos.add("BMW");
        autos.add("VOLVO");
        autos.add("TOYOTA");

        for (String auto : autos) {
            System.out.println(auto);
        }
    }
}
