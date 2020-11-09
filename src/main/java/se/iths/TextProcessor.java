package se.iths;

public class TextProcessor {

    public static String lowerCase(String word) {
        return word.toLowerCase();
    }

    public static String upperCase(String word) {
        return word.toUpperCase();
    }


    public static String reverseWord(String word) {
        StringBuilder wordSlot = new StringBuilder(word);
        wordSlot.reverse();
        return wordSlot.toString();
    }
    //Returns true if word is not and empty string
    public static boolean wordNotEmptyString(String word) {
        return !word.equals("");

    }
}
