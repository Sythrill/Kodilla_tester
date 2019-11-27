package com.kodilla.bank.homework;

public class Bank {
    private CashMachine cashMachine1;
    private CashMachine cashMachine2;
    private CashMachine cashMachine3;

    public Bank() {
        this.cashMachine1 = new CashMachine();
        this.cashMachine2 = new CashMachine();
        this.cashMachine3 = new CashMachine();
    }

    public void addCashMachine1Operation(int money) {
        if (money % 20 == 0) {
            this.cashMachine1.addOperation(money);
        }
    }

    public void addCashMachine2Operation(int money) {
        if (money % 20 == 0) {
            this.cashMachine2.addOperation(money);
        }
    }

    public void addCashMachine3Operation(int money) {
        if (money % 20 == 0) {
            this.cashMachine3.addOperation(money);
        }
    }

    public int getCashMachine1Incomes() {
        return this.cashMachine1.getBalance();
    }

    public int getCashMachine2Incomes() {
        return this.cashMachine2.getBalance();
    }

    public int getCashMachine3Incomes() {
        return this.cashMachine3.getBalance();
    }

    public int getAllIncomes() {
        int allIncomes = getCashMachine1Incomes() + getCashMachine2Incomes() + getCashMachine3Incomes();
        if (allIncomes == 0) {
            return 0;
        } else {
            return allIncomes;
        }
    }

    public int getAllPayments() {
        int payments = this.cashMachine1.getNumberOfPayments() + this.cashMachine2.getNumberOfPayments() + this.cashMachine3.getNumberOfPayments();
        if (payments == 0) {
            return 0;
        } else {
            return payments;
        }
    }

    public int getAllWithdraws() {
        int withdraws = this.cashMachine1.getNumberOfWithdraws() + this.cashMachine2.getNumberOfWithdraws() + this.cashMachine3.getNumberOfWithdraws();
        if (withdraws == 0) {
            return 0;
        } else {
            return withdraws;
        }

    }

    public double getAverageOfAllPayments() {
        double avgPayments = this.cashMachine1.getAverageOfPayments() + this.cashMachine2.getAverageOfPayments() + this.cashMachine3.getAverageOfPayments();
        if (avgPayments == 0) {
            return 0;
        } else {
            return avgPayments;
        }
    }

    public double getAverageOfAllWithdraws() {
        double avgWithdraw = this.cashMachine1.getAverageOfWithdraws() + this.cashMachine2.getNumberOfWithdraws() + this.cashMachine3.getNumberOfWithdraws();
        if (avgWithdraw == 0) {
            return 0;
        } else {
            return avgWithdraw;
        }
    }
}
