package com.kodilla.basic_assertion;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        int addFirstVal = 5;
        int addSecondVal = 8;
        int addResult = calculator.add(addFirstVal, addSecondVal);
        assertEquals(13, addResult);
    }

    @Test
    public void testMinus() {
        Calculator calculator = new Calculator();
        int minusFirstVal = 29;
        int minusSecondVal = 11;
        int minusResult = calculator.minus(minusFirstVal, minusSecondVal);
        assertEquals(18, minusResult);
    }

    @Test
    public void testPow() {
        Calculator calculator = new Calculator();
        int base = 5;
        int toPow = 5;
        int powResult = calculator.pow(base, toPow);
        assertEquals(3125, powResult);
    }

}
