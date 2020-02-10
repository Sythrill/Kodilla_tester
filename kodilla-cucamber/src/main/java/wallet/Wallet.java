package wallet;

public class Wallet {
    private int balance = 0;

    public Wallet() {

    }

    public void deposit(int money) {
        this.balance += money;
    }

    public int getBalance() {
        return balance;
    }

    public void debit(int money) {
        if (this.balance > money) {
            this.balance -= money;
        }
    }

    public String noFunds(int money) {
        if (this.balance < money) {
            return "insufficient funds";
        }
        return "Wallet balance= " + balance;
    }

    @Override
    public String toString() {
        return "Wallet balance= " + balance;
    }
}