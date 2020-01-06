package com.kodilla.parametrized_tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class StringValidatorTestSuite {

    private StringValidator stringValidator = new StringValidator();

    @Test
    public void shouldReturnFalseIfStringIsNotEmpty() {
        assertFalse(stringValidator.isBlank("test"));
    }

    @Test
    public void shouldReturnTrueIfStringIsEmpty() {
        assertTrue(stringValidator.isBlank(""));
    }

    @Test
    public void shouldReturnTrueIfStringHasOnlySpaces() {
        assertTrue(stringValidator.isBlank("   "));
    }

    @Test
    public void shouldReturnTrueIfStringIsNull() {
        assertTrue(stringValidator.isBlank(null));
    }

    @ParameterizedTest
    @NullAndEmptySource
    public void shouldReturnTrueIfStringIsEmpty(String text) {
        System.out.println("|" + text + "|");
        assertTrue(stringValidator.isBlank(text));
    }

    @ParameterizedTest
    @ValueSource(strings = {"test", "Ala", "#$%^&"})
    public void shouldReturnFalseIfStringIsNotEmpty(String text) {
        System.out.println("|" + text + "|");
        assertFalse(stringValidator.isBlank(text));
    }
}