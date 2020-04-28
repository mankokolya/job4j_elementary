package ru.job4j.array;

/**
 *  ArrayDefragmentation - is used to shift null String in the array to its end.
 *
 * @author mankokolya;
 */
public class ArrayDefragmentation {
    /**
     *
     * @param array - provided array of String type;
     *
     * @return - array with shifted null value to its end;
     */
    public static String[] compress(String[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                int point = i;
                while (array[point] == null && point < array.length - 1) {
                    point++;
                }
                String temp = array[i];
                array[i] = array[point];
                array[point] = temp;
            }
            System.out.println(array[i] + " ");
        }
        return array;
    }
}
