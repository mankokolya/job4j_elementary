package ru.job4j.array;

/**
 *  ArrayChar - is used to determine if the word starts with certain letter combination;
 *
 * @author mankokolya;
 */
public class ArrayChar {
    /**
     *
     * @param word - provided word saved in the array as chars;
     * @param startingCombination - chars the provided word has to start with;
     * @return - the result of the check either true or false;
     */
    public static boolean startsWith(char[] word, char[] startingCombination) {
        boolean result = true;
        for (int i = 0; i < startingCombination.length; i++) {
            if (word[i] != startingCombination[i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
