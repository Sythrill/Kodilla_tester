package com.kodilla.basic_assertion;

public class PrimeChecker {

    public boolean isPrime(int number) {
        int x = 0;
        if (number <= 1) {
            return false;
        } else {
            for (int i = 2; i <= number; i++) {
                if (number % i == 0) {
                    x += 1;
                }
            }
            if (number % 1 == 0 && x == 1) {
                return true;
            } else {
                return false;
            }
        }

    }
}

