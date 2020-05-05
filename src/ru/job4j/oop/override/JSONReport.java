package ru.job4j.oop.override;

public class JSONReport {

    public String generate(String name, String body) {
        return "{\n\nname : " + name + System.lineSeparator() + "body : " + body + "\n\n}";
    }
}
