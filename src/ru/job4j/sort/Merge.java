package ru.job4j.sort;

import java.util.Arrays;

public class Merge {

    public int[] merge(int[] first, int[] second) {
        int[] rsl = new int[first.length + second.length];
        int rslIndex = 0;
        int firstIndex = 0;
        int secondIndex = 0;

        if (first.length == 0 && second.length == 0) {
            return rsl;
        } else if (first.length == 0) {
            return second;
        } else if (second.length == 0) {
            return first;
        } else {
            while (firstIndex + secondIndex < rsl.length) {
                if (firstIndex == first.length) {
                    rsl[rslIndex] = second[secondIndex];
                    rslIndex++;
                    secondIndex++;
                } else if (secondIndex == second.length) {
                    rsl[rslIndex] = first[firstIndex];
                    rslIndex++;
                    firstIndex++;
                } else {
                    if (first[firstIndex] <= second[secondIndex]) {
                        rsl[rslIndex] = first[firstIndex];
                        rslIndex++;
                        firstIndex++;
                    } else if (first[firstIndex] > second[secondIndex]) {
                        rsl[rslIndex] = second[secondIndex];
                        rslIndex++;
                        secondIndex++;
                    }
                    // With this commented statement code is working a bit faster but readability is worth. I don't know if it
                    // worth to add it in the code or just leave as it is.
//
//                    } else if (first[firstIndex] == second[secondIndex]) {
//                        rsl[rslIndex] = first[firstIndex];
//                        rslIndex++;
//                        firstIndex++;
//                        rsl[rslIndex] = second[secondIndex];
//                        rslIndex++;
//                        secondIndex++;
//                    }
                }
            }
        }
        return rsl;
    }
}
