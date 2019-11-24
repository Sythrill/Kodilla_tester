package com.kodilla.basic_assertion;

public class Calculator {

    public int add(int firstValue, int secondValue) {
        return firstValue + secondValue;
    }

    public int minus(int firstValue, int secondValue) {
        return firstValue - secondValue;
    }

    public int pow(int base, int toPow) {
        int result = base;
        for(int i =1; i < toPow; i++) {
            result = result * base;
        }
        return result;
    }
}
