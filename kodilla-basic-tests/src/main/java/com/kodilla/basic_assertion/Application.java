package com.kodilla.basic_assertion;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int addFirstVal = 5;
        int addSecondVal = 8;
        int sumResult = calculator.add(addFirstVal, addSecondVal);
        boolean correct = ResultChecker.assertEquals(13, sumResult);
        if (correct) {
            System.out.println("Metoda add działa poprawnie dla liczb " + addFirstVal + " i " + addSecondVal);
        } else {
            System.out.println("Metoda add nie działa poprawnie dla liczb " + addFirstVal + " i " + addSecondVal);

        }

        Calculator calculator1 = new Calculator();
        int minusFirstVal = 9;
        int minusSecondVal = 5;
        int minusResult = calculator1.minus(minusFirstVal, minusSecondVal);
        boolean isOK = ResultChecker.assertEquals(4, minusResult);
        if (isOK) {
            System.out.println("Metoda minus działa poprawnie dla liczb " + minusFirstVal + " i " + minusSecondVal);
        } else {
            System.out.println("Metoda minus nie działa poprawnie dla liczb " + minusFirstVal + " i " + minusSecondVal);
        }

        Calculator calculator2 = new Calculator();
        int base = 12;
        int toPow = 8;
        int powResult = calculator2.pow(base, toPow);
        boolean isPowOK = ResultChecker.assertEquals(429981696, powResult);
        if (isPowOK) {
            System.out.println("Metoda pow działa poprawnie dla podstawy " + base + " i wykładnika " + toPow);
        } else {
            System.out.println("Metoda pow nie działa poprawnie dla podstawy " + base + " i wykładnika " + toPow);
        }
    }
}
