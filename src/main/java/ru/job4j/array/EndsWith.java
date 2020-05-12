package ru.job4j.array;

/**
 *  EndsWith - is used to check if the word ends with the certain letter combination;
 *
 * @author mankokolya;
 */
public class EndsWith {
    /**
     *
     * @param word - provided word to check, saved in the array of chars;
     * @param endingCombination - provided ending letter combination saved int he array of chars;
     * @return - result of the check, either true or false;
     */
    public static boolean endsWith(char[] word, char[] endingCombination) {
        boolean result = true;
        for (int i = 0; i < endingCombination.length; i++) {
            if (word[word.length - 1 - i] != endingCombination[endingCombination.length - 1 - i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
