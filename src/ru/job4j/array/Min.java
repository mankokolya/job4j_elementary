package ru.job4j.array;

/**
 *  Min - is used to find minimum number in the provided array;
 *
 * @author mankokolya;
 */
public class Min {
    /**
     *
     * @param array - provided array with numbers;
     * @return - minimum number in the array;
     */
    public static int findMin(int[] array) {
        int min = array[0];
        for (int number : array) {
            if (number < min) {
                min = number;
            }
        }
        return min;
    }
}
