package ru.job4j.array;

/**
 * MatrixCheck - is used to check one horizontal line in multidimensional array and determine if it is filled with
 * the same chars;
 *
 * @author mankokolya;
 */
public class MatrixCheck {
    /**
     * @param board - provided multidimensional array;
     * @param row   - row which you have to check;
     * @return - either true if the horizontal line contains only similar chars or false if it doesn't;
     */
    public static boolean checkHorizontalLineIsUnique(char[][] board, int row) {
        boolean result = true;
        char itemToCheck = board[row][0];
        for (int i = 1; i < board[row].length; i++) {
            if (board[row][i] != itemToCheck) {
                result = false;
                break;
            }
        }
        return result;
    }
}
