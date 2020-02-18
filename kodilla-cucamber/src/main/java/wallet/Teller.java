package wallet;

public class Teller {

    private CashSlot cashSlot;
    private MoneyMachine moneyMachine;

    public Teller(CashSlot cashSlot, MoneyMachine moneyMachine) {

        this.cashSlot = cashSlot;
        this.moneyMachine = moneyMachine;
    }


    public void withdraw(Wallet wallet, int amount) {
        wallet.debit(amount);
        if (wallet.getBalance() > amount && moneyMachine.getAtmBalance() > amount) {
            cashSlot.dispense(amount);
        }
    }
}