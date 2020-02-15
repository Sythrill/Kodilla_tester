package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CalculatorTest {
    ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection");
    Calculator bean = context.getBean(Calculator.class);

    @Test
    public void shouldAddTwoValues() {

        String result = bean.add(2.0,2.0);
        assertEquals("Result: 4.0", result);
    }

    @Test
    public void shouldSubtractTwoValues() {
        String result = bean.subtract(5.0, 2.4);
        assertEquals("Result: 2.6", result);
    }

    @Test
    public void shouldMultiplyTwoValues() {
        String result = bean.multiply(3.0, 4.0);
        assertEquals("Result: 12.0", result);
    }

    @Test
    public void shouldDivideTwoValues() {
        String result = bean.divide(12.0, 3.0);
        assertEquals("Result: 4.0", result);
    }

    @Test
    public void shouldReturnWarningMessageWhenDivideByZero() {
        String result = bean.divide(3.0, 0.0);
        assertEquals("Pamietaj cholero nie dziel przez ZERO !", result);
    }

    @Test
    public void shouldReturnNegativeValueFromSubtraction() {
        String result = bean.subtract(4.0, 5.0);
        assertEquals("Result: -1.0", result);
    }

    @Test
    public void shouldReturnNegativeValueFromMultiplication() {
        String result = bean.multiply(5.0, -3.0);
        assertEquals("Result: -15.0", result);
    }

    @Test
    public void shouldReturnZeroFromMultiplication() {
        String result = bean.multiply(5.0, 0.0);
        assertEquals("Result: 0.0", result);
    }

    @Test
    public void shouldReturnFirstValueWhenAddZero() {
        String result = bean.add(5.0, 0.0);
        assertEquals("Result: 5.0", result);
    }
}