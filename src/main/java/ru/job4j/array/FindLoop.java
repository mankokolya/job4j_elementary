package ru.job4j.array;

/**
 * FindLoop - is used to find the value in the array with the help of sequential search;
 *
 * @author mankokolya
 */
public class FindLoop {
    /**
     * This method is used to search for the index of the provided number in the given array;
     *
     * @param data    - array with numbers;
     * @param element - element to find;
     * @return - index of searching number in the array; if the number is absent then -1 is returned;
     */
    public static int indexOfElement(int[] data, int element) {
        int index = -1;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == element) {
                index = i;
                break;
            }
        }
        return index;
    }

    /**
     * @param data            - array with numbers;
     * @param elementToSearch - - element to search;
     * @param start           - index to start searching from;
     * @param finish          - last index where to search;
     * @return - index of searching number in the array; if the number is absent then -1 is returned;
     */
    public static int indexOfElement(int[] data, int elementToSearch, int start, int finish) {
        int index = -1;
        for (int i = start; i <= finish; i++) {
            if (data[i] == elementToSearch) {
                index = i;
                break;
            }
        }
        return index;
    }

}
