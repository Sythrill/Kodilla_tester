package wallet;

public class MoneyMachine {

    private int atm_balance = 0;
    private Wallet wallet;

    public MoneyMachine(Wallet wallet) {
        this.wallet = wallet;
    }
    public void createAtmBalance(int money)
    {
        this.atm_balance += money;
    }

    public int getAtmBalance() {
        return atm_balance;
    }


    public String creditInfo() {
        if (wallet.getBalance() > this.getAtmBalance()) {
            return "You can withdraw " + this.getAtmBalance();
        }
        return "You can withdraw " + this.getAtmBalance();
    }
}