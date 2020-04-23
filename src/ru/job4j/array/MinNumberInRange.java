package ru.job4j.array;

/**
 *  MinNumberInRange - is used to find the minimum number in the array in the provided range;
 *
 * @author mankokolya;
 */
public class MinNumberInRange {
    /**
     *
     * @param array - provided numbers for search;
     * @param start - index to start the searching from;
     * @param finish - the last index to look at;
     * @return - minimum value;
     */
    public static int findMinInRange(int[] array, int start, int finish) {
        int min = array[start];
        for (int i = start + 1; i <= finish; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}
