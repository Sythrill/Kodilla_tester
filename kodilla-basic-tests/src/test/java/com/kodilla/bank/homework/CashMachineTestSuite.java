package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTestSuite {
    CashMachine cashMachine = new CashMachine();

    @Test
    public void shouldHaveZeroLength() {
        int[] operations = cashMachine.getOperations();
        assertEquals(0, operations.length);
    }

    @Test
    public void shouldAddTwoOperations() {
        cashMachine.addOperation(20);
        cashMachine.addOperation(100);

        int[] operations = cashMachine.getOperations();
        assertEquals(2, operations.length);
        assertEquals(20, operations[0]);
        assertEquals(100, operations[1]);
    }

    @Test
    public void shouldCalculateBalance() {
        cashMachine.addOperation(20);
        cashMachine.addOperation(100);
        cashMachine.addOperation(-20);
        int balance = cashMachine.getBalance();
        assertEquals(100, balance);
    }

    @Test
    public void shouldReturnZeroPaymentsWhenArrayIsEmpty() {
        int numberOfPayments = cashMachine.getNumberOfPayments();
        assertEquals(0, numberOfPayments);
    }

    @Test
    void shouldReturnZeroPaymentsWhenOnlyWithdrawsInArray() {
        cashMachine.addOperation(-20);
        cashMachine.addOperation(-100);
        cashMachine.addOperation(-20);
        int numberOfPayments = cashMachine.getNumberOfPayments();
        assertEquals(0, numberOfPayments);
    }

    @Test
    void shouldReturnTwoPayments() {
        cashMachine.addOperation(20);
        cashMachine.addOperation(100);
        cashMachine.addOperation(-20);
        int numberOfPayments = cashMachine.getNumberOfPayments();
        assertEquals(2, numberOfPayments,0.01);
    }
    @Test
    public void shouldReturnZeroWithdrawsWhenArrayIsEmpty() {
        int numberOfWithdraws = cashMachine.getNumberOfWithdraws();
        assertEquals(0, numberOfWithdraws,0.01);
    }

    @Test
    void shouldReturnZeroWithdrawsWhenOnlyPaymentsInArray() {
        cashMachine.addOperation(20);
        cashMachine.addOperation(100);
        cashMachine.addOperation(20);
        int numberOfWithdraws = cashMachine.getNumberOfWithdraws();
        assertEquals(0, numberOfWithdraws,0.01);
    }

    @Test
    void shouldReturnTwoWithdraws() {
        cashMachine.addOperation(-20);
        cashMachine.addOperation(100);
        cashMachine.addOperation(-20);
        int numberOfWithdraws = cashMachine.getNumberOfWithdraws();
        assertEquals(2, numberOfWithdraws,0.01);
    }

    @Test
    void shouldCalculateAverageOfPayments() {
        cashMachine.addOperation(-20);
        cashMachine.addOperation(40);
        cashMachine.addOperation(-20);
        cashMachine.addOperation(160);
        cashMachine.addOperation(100);
        cashMachine.addOperation(-80);
        double paymentsAvg = cashMachine.getAverageOfPayments();
        assertEquals(100,paymentsAvg,0.01);
    }

    @Test
    void shouldCalculateAverageOfWithdraws() {
        cashMachine.addOperation(-20);
        cashMachine.addOperation(40);
        cashMachine.addOperation(-20);
        cashMachine.addOperation(160);
        cashMachine.addOperation(100);
        cashMachine.addOperation(-80);
        double paymentsAvg = cashMachine.getAverageOfWithdraws();
        assertEquals(40,paymentsAvg,0.01);
    }

}
