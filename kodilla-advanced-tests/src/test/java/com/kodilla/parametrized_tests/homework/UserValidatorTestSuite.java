package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class UserValidatorTestSuite {
    UserValidator userValidator = new UserValidator();

    @ParameterizedTest
    @ValueSource(strings = {"ala.koza@gmail.com", "koza01@o2.pl", "_1@wp.pl", "ALA@123.commm"})
    public void shouldReturnTrueIfEmailIsCorrected(String email) {
        assertTrue(userValidator.validateEmail(email));
    }

    @ParameterizedTest
    @ValueSource(strings = {"@.com", "alaKowalska", "#$%.@com", "ola@", "ola@.com", "ola@gmail.12", "ola@omail.aaaaaaa"})
    public void shouldReturnFalseIfEmailIsNotCorrected(String email) {
        assertFalse(userValidator.validateEmail(email));
    }

    @ParameterizedTest
    @NullAndEmptySource
    public void  shouldReturnFalseIfEmailIsEmpty(String email) {
        System.out.println("|" + email + "|");
        assertFalse(userValidator.validateEmail(email));
    }

    @ParameterizedTest
    @NullAndEmptySource
    public void shouldReturnFalseIfUserIsEmpty(String name) {
        System.out.println("|" + name + "|");
        assertFalse(userValidator.validateUsername(name));
    }

    @ParameterizedTest
    @ValueSource(strings = {"Tolek", "1234", "als19._-", "ala"})
    public void shouldReturnTrueIfUsernameIsValid(String name) {
        assertTrue(userValidator.validateUsername(name));
    }

    @ParameterizedTest
    @ValueSource(strings = {"#$%", "y", "ala*&"})
    public void shouldReturnFalseIfUsernameIsNotValid(String name) {
        assertFalse(userValidator.validateUsername(name));
    }
}