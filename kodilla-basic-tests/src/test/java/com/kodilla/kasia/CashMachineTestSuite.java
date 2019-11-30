package com.kodilla.kasia;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTestSuite {
    @Test
    public void shouldHaveZero() {
        CashMachine cashMachine = new CashMachine();
        int [] transactions = cashMachine.getTransactions ();
        assertEquals (0, transactions.length);
    }

    @Test
    public void shouldAddTwoTransactions() {

        CashMachine cashMachine = new CashMachine();
        cashMachine.add(-30);
        cashMachine.add(100);

        int [] transactions = cashMachine.getTransactions();
        assertEquals (2, transactions.length);
        assertEquals(-30, transactions[0]);
        assertEquals(100, transactions[1]);
    }
    @Test
    public void shouldCountBalance() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(-30);
        cashMachine.add(100);
        cashMachine.add(250);

        assertEquals(320, cashMachine.getBalance());
    }
}
