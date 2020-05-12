package ru.job4j.array;

/**
 *  Matrix - is used to fill multidimensional array with numbers by multiplying indexes on each other;
 *
 * @author mankokolya;
 */
public class Matrix {
    /**
     *
     * @param size - the size of the multidimensional array;
     * @return - array filled with numbers;
     */
    public static int[][] multiple(int size) {
        int[][] multipleTable = new int[size][size];
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                multipleTable[i - 1][j - 1] = i * j;
            }
        }
        return multipleTable;
    }
}
