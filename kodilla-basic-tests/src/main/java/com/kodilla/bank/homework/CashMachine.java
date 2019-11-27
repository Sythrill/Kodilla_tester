package com.kodilla.bank.homework;

public class CashMachine {
    private int[] operations;
    private int size;

    public CashMachine() {
        this.operations = new int[0];
    }

    public void addOperation(int operation) {
        this.size++;
        int[] newTab = new int[this.size];
        System.arraycopy(operations, 0, newTab, 0, operations.length);
        newTab[this.size - 1] = operation;
        this.operations = newTab;
    }

    public int[] getOperations() {
        return operations;
    }

    public int getBalance() {
        if (this.operations.length == 0) {
            return 0;
        }
        int sum = 0;
        for (int i = 0; i < this.operations.length; i++) {
            sum += this.operations[i];
        }
        return sum;
    }

    public int getNumberOfPayments() {
        int payment = 0;
        if (this.operations.length == 0) {
            return 0;
        } else {
            for (int i = 0; i < this.operations.length; i++) {
                if (this.operations[i] > 0) {
                    payment += 1;
                }
            }
        }
        return payment;
    }

    public int getNumberOfWithdraws() {
        int withdraw = 0;
        if (this.operations.length == 0) {
            return 0;
        } else {
            for (int i = 0; i < this.operations.length; i++) {
                if (this.operations[i] < 0) {
                    withdraw += 1;
                }
            }
        }
        return withdraw;
    }

    public double getAverageOfPayments() {
        if (this.operations.length == 0) {
            return 0;
        } else {
            double avg = 0;
            int operation = 0;
            for (int i = 0; i < this.operations.length; i++) {
                if (this.operations[i] > 0) {
                    avg += this.operations[i];
                    operation += 1;
                }
            }
            return avg / operation;
        }
    }

    public double getAverageOfWithdraws() {
        if (this.operations.length == 0) {
            return 0;
        } else {
            double avg = 0;
            int operation = 0;
            for (int i = 0; i < this.operations.length; i++) {
                if (this.operations[i] < 0) {
                    avg += this.operations[i];
                    operation += 1;
                }
            }
            return avg / operation * -1;
        }
    }

}
