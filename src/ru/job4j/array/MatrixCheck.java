package ru.job4j.array;

/**
 * MatrixCheck - is used to check either horizontal or vertical line in multidimensional array
 * and determine if it is filled with the same char;
 *
 * @author mankokolya;
 */
public class MatrixCheck {
    /**
     * @param board - provided multidimensional array;
     * @param row   - row which you have to check;
     * @return - either true if the horizontal line contains only the same char or false if it doesn't;
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

    /**
     * @param board  - provided multidimensional array;
     * @param column - column in the array which has to be checked;
     * @return - either true if the vertical line contains only the same char or false if it doesn't;
     */
    public static boolean checkVerticalLineISUnique(char[][] board, int column) {
        boolean result = true;
        char itemToCheck = board[0][column];
        for (char[] chars : board) {
            if (chars[column] != itemToCheck) {
                result = false;
                break;
            }
        }
        return result;
    }
}
