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

    public static boolean sent(String value, String[] abuses) throws ElementAbuseException {
        for (String abuse : abuses) {
            if (abuse.equals(value)) {
                throw new ElementAbuseException("The key: " + value + "is abused");
            }
        }
        return true;
    }

    public static void process(String[] values, String key, String[] abuses) {
        try {
            if (indexOf(values, key) != -1) {
                sent(key, abuses);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        process(new String[]{"HELLO", "JAVA", "World"}, "Exception", new String[]{"John", "Pizza"});
    }
}
