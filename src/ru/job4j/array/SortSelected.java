package ru.job4j.array;

/**
 *  SortedSelected - is used to sort numbers in the array selecting the minimum number in the array and shifting
 *  it to the beginning in increasing order;
 *
 * @author mankokolya;
 */
public class SortSelected {
    /**
     *
     * @param data - provedid array that need to be sorted in increasing order;
     *
     * @return - sorted array;
     */
    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int min = MinNumberInRange.findMinInRange(data, i, data.length - 1);
            int index = FindLoop.indexOfElement(data, min, i, data.length - 1);
            data[index] = data[i];
            data[i] = min;
        }
        return data;
    }

}
