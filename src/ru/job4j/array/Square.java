package ru.job4j.array;

/**
 *  Square - is used to square numbers in range from 0 to the given number and add them into array
 *
 * @author - mankokolya
 */
public class Square {
    /**
     *
     * @param bound - the end of the numbers range
     * @return the array filled with squared numbers
     */
    public static int[] numbersToSquare(int bound) {
        int[] squaredNumbers = new int[bound];
        for (int i = 0; i < bound; i++) {
            squaredNumbers[i] = (int) Math.pow(i, 2);
        }
        return squaredNumbers;
    }
}
