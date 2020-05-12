package ru.job4j.array;

/**
 * TurnArray - is used to reverse the given array;
 *
 * @author mankokolya;
 */
public class TurnArray {
    /**
     *
     * @param array - provided array;
     * @return - reversed array
     */
    public static int[] reverseArray(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        return array;
    }
}
