package wallet;

public class Teller {

    private CashSlot cashSlot;

    public Teller(CashSlot cashSlot) {
        this.cashSlot = cashSlot;
    }

    public void withdraw(Wallet wallet, int amount) {
        wallet.debit(amount);
        if (wallet.getBalance() > amount) {
            cashSlot.dispense(amount);
        }
    }
}
