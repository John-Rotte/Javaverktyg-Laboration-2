package se.iths;

public class TextProcessor {

    public String lowerCase(String word) {
        return word.toLowerCase();
    }
    public String upperCase(String word) {
        return word.toUpperCase();
    }
    public String reverseWord(String word) {
        StringBuilder wordSlot = new StringBuilder(word);
        wordSlot.reverse();
        return wordSlot.toString();
    }
}
