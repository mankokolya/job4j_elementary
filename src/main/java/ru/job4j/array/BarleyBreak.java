package ru.job4j.array;

/**
 *  BarleyBreak - is used to fill multidimensional array with numbers from 1 to 9;
 *
 * @author mankokolya;
 */
public class BarleyBreak {
    public static void main(String[] args) {
        int size = 3;
        int[][] data = new int[size][size];
        int number = 1;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                data[i][j] = number;
                number++;
            }
        }
        for (int[] numb : data) {
            for (int value : numb) {
                System.out.print(value);
            }
            System.out.println();
        }
    }
}
