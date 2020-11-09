package se.iths;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    @DisplayName("Test of calculator functions")

    @BeforeEach
    void printLine(){
        System.out.println("___________________________________________________________________________________");
        System.out.println("                               THIS IS A TEST");
        System.out.println("___________________________________________________________________________________");
    }
    @Test
    void testAdd() {
        assertEquals(2 + 2,Calculator.Addition(2,2));
    }
    @Disabled
    //Disabled for later no need to test this now
    @Test
    void testSubtract() {
        assertEquals(5,Calculator.Subtract(10,5));
    }
    @RepeatedTest(5)
    void testMultiplication(){
        assertEquals(20,Calculator.multiply(5,4));
    }


}
