package ru.job4j.exception;

public class FindElement {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int result = -1;
        for (String element : value) {
            if (element.equals(key)) {
                return ++result;
            }
            result++;
        }
        throw new ElementNotFoundException("Element - \"" + key + "\" was not found in the array");
    }

    public static void main(String[] args) {
        try {
            System.out.println(FindElement.indexOf(new String[] {"HELLO", "JAVA", "World"}, "Exception"));
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
