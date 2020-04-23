package ru.job4j.array;

/**
 *  CheckArray - is used to check if the values in the provided array are similar or different;
 *
 * @author mankokolya;
 */
public class CheckArray {
    /**
     *
     * @param data - provided array with values to check;
     * @return - result of the check;
     */
    public static boolean checkArrayIsMono(boolean[] data) {
        boolean result = true;
        boolean valueToCheck = data[0];
        for (int i = 1; i < data.length; i++) {
            if (data[i] != valueToCheck) {
                result = false;
                break;
            }
        }
        return result;
    }
}
