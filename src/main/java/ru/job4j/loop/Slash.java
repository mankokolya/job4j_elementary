package ru.job4j.loop;

/**
 * Slash - is used to print a slash with the help of for loop and symbol "0";
 *
 * @author mankokolya;
 */

public class Slash {
    /**
     * @param size - the size of the slash you want to print;
     */
    public static void draw(int size) {
        for (int row = 0; row < size; row++) {
            for (int cell = 0; cell < size; cell++) {
                //left - is used to print the diagonal from left upper corner to right bottom corner;
                boolean left = row == cell;
                //right - is used to print the diagonal from right upper corner to left bottom corner;
                boolean right = row + cell == size - 1;
                if (left) {
                    System.out.print("0");
                } else if (right) {
                    System.out.print("0");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("Draw by 3");
        draw(3);
        System.out.println("Draw by 5");
        draw(5);
    }
}
