package se.iths;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TextProcessorTest {
//    @DisplayName("Test of textprocessor functions")
    @Test
    void testForEmptyWord() {
        assertFalse(TextProcessor.wordNotEmptyString(""));
    }
    @Test
    void testUppercaseFunction() {
        assertEquals("WORD",TextProcessor.upperCase("word"));
    }
    @Test
    void testLovercaseFuntction(){
        assertEquals("word",TextProcessor.lowerCase("WORD"));
    }
    @Test
    void testReverseWord(){
        assertEquals("drow",TextProcessor.reverseWord("word"));
    }
    @Test
    void testReverseWordforNull(){
        assertNotNull(new Calculator().Addition(2,2));
    }
}
