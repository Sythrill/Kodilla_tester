package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class GamblingMachineTestSuite {
    GamblingMachine machine = new GamblingMachine();

    @ParameterizedTest
    @CsvFileSource(resources = "/numbersForGamblingMachineForException.csv", numLinesToSkip = 1, delimiter=';')
    public void shouldReturnException(String input) throws InvalidNumbersException {
        String[] values = input.split(",");
        Set<String> nums = new HashSet<>(Arrays.asList(values));
        Set<Integer> userNumbers = nums.stream()
                .map(Integer::valueOf)
                .collect(Collectors.toSet());
        assertThrows(InvalidNumbersException.class,() -> machine.howManyWins(userNumbers));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/validNumbersForGamblingMachine.csv", numLinesToSkip = 1, delimiter=';')
    public void shouldNotReturnException(String input) throws InvalidNumbersException {
        String[] values = input.split(",");
        Set<String> nums = new HashSet<>(Arrays.asList(values));
        Set<Integer> userNumbers = nums.stream()
                .map(Integer::valueOf)
                .collect(Collectors.toSet());
        assertAll(() -> machine.howManyWins(userNumbers));
    }
}