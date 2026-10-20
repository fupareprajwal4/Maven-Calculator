
package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private com.example.Calculator Calculator;

    @Test
    void testAddition() {
        assertEquals(15.0, Calculator.calculate(10, '+', 5));
    }

    @Test
    void testSubtraction() {
        assertEquals(5.0, Calculator.calculate(10, '-', 5));
    }

    @Test
    void testMultiplication() {
        assertEquals(12.0, Calculator.calculate(4, '*', 3));
    }

    @Test
    void testDivision() {
        assertEquals(5.0, Calculator.calculate(20, '/', 4));
    }

    @Test
    void testDivisionByZero() {
        assertThrows(
                IllegalArgumentException.class,
                () -> Calculator.calculate(10, '/', 0)
        );
    }

    @Test
    void testInvalidOperator() {
        assertThrows(
                IllegalArgumentException.class,
                () -> Calculator.calculate(10, '%', 5)
        );
    }
}
