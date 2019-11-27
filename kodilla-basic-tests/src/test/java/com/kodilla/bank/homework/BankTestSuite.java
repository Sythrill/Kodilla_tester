package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {
    Bank bank = new Bank();

    @Test
    public void shouldCalculateFullIncomeIfOperationsOutsideRange() {
        bank.addCashMachine1Operation(70);
        bank.addCashMachine1Operation(20);
        bank.addCashMachine1Operation(20);

        bank.addCashMachine2Operation(50);
        bank.addCashMachine2Operation(100);
        bank.addCashMachine2Operation(100);

        bank.addCashMachine3Operation(40);
        bank.addCashMachine3Operation(10);
        bank.addCashMachine3Operation(40);

        int all = bank.getAllIncomes();
        int cm1 = bank.getCashMachine1Incomes();
        int cm2 = bank.getCashMachine2Incomes();
        int cm3 = bank.getCashMachine3Incomes();
        assertEquals(320, all);
        assertEquals(40, cm1, 0.01);
        assertEquals(200, cm2, 0.01);
        assertEquals(80, cm3, 0.01);
    }

    @Test
    public void shouldCalculateNumberOfWithdrawsIfOperationsInRange() {
        bank.addCashMachine1Operation(70);
        bank.addCashMachine1Operation(-20);
        bank.addCashMachine1Operation(-20);

        bank.addCashMachine2Operation(50);
        bank.addCashMachine2Operation(100);
        bank.addCashMachine2Operation(-100);

        bank.addCashMachine3Operation(40);
        bank.addCashMachine3Operation(10);
        bank.addCashMachine3Operation(40);

        int all = bank.getAllWithdraws();
        assertEquals(3, all);
    }

    @Test
    public void shouldReturnZeroIfNoPayments() {
        int all = bank.getAllPayments();
        assertEquals(0, all);
    }
}
