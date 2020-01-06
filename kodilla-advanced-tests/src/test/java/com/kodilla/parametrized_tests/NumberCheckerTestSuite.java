package com.kodilla.parametrized_tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class NumberCheckerTestSuite {
    private NumberChecker numberChecker = new NumberChecker();

    @Test
    public void shouldReturnTrueIfNumberEqualsThree() {
        boolean result = numberChecker.isDividedByThree(3);
        assertTrue(result);
    }

    @Test
    public void shouldReturnTrueIfNumberIsMultipleOfThree() {
        boolean result = numberChecker.isDividedByThree(12);
        assertTrue(result);
    }

    @Test
    public void shouldReturnTrueIfNumberIsEqualZero() {
        boolean result = numberChecker.isDividedByThree(0);
        assertTrue(result);
    }

    @Test
    public void shouldReturnTrueIfNumberIsNegativeMultipleOfThree() {
        boolean result = numberChecker.isDividedByThree(-6);
        assertTrue(result);
    }

    @Test
    public void shouldReturnFalseIfNumberIsNotDivisibleByThree() {
        boolean result = numberChecker.isDividedByThree(2);
        assertFalse(result);
    }

    @ParameterizedTest
    @ValueSource(ints = {0, 3, 6, -3, -12, 15})
    public void shouldReturnTrueForNumberDivisibleByThree(int number) {
        boolean result = numberChecker.isDividedByThree(number);
        assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(ints = {-2, -1, 1, 2, 4, 5})
    public void shouldReturnFalseForNumberNotDivisibleByThree(int number) {
        boolean result = numberChecker.isDividedByThree(number);
        assertFalse(result);
    }
}