package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class BMISources {
    static Stream<Arguments> providePersonsForTestingBMI() {
        return Stream.of(
                Arguments.of(new Person(1.74, 74), "Normal (healthy weight)"),
                Arguments.of(new Person(1.80, 45), "Very severely underweight"),
                Arguments.of(new Person(1.80, 50), "Severely underweight"),
                Arguments.of(new Person(1.59, 46.4), "Underweight"),
                Arguments.of(new Person(1.59, 73), "Overweight"),
                Arguments.of(new Person(1.59, 86), "Obese Class I (Moderately obese)"),
                Arguments.of(new Person(1.59, 90), "Obese Class II (Severely obese)"),
                Arguments.of(new Person(1.87, 155), "Obese Class III (Very severely obese)"),
                Arguments.of(new Person(1.87, 170), "Obese Class IV (Morbidly Obese)"),
                Arguments.of(new Person(1.87, 187), "Obese Class V (Super Obese)"),
                Arguments.of(new Person(1.87, 220), "Obese Class VI (Hyper Obese)")
        );
    }
}