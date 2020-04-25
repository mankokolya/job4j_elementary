package ru.job4j.array;

/**
 * MatrixCheck - is used to extract and check for similarity data from multidimensional array;
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
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] != 'X') {
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
        for (char[] chars : board) {
            if (chars[column] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    /**
     * This method is used to extract chars from matrix diagonal and save them in the array;
     *
     * @param board - provided matrix;
     * @return - array with chars from diagonal;
     */
    public static char[] extractDiagonal(char[][] board) {
        char[] result = new char[board.length];
        for (int i = 0; i < board.length; i++) {
            result[i] = board[i][i];
        }
        return result;
    }

    public static boolean isWin(char[][] board) {
        boolean result = false;
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == 'X') {
                if (checkHorizontalLineIsUnique(board, i) || checkVerticalLineISUnique(board, i)) {
                    result = true;
                    break;
                }
            }
        }
        return result;
    }
}
