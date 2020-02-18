package wallet;

import io.cucumber.java8.En;
import org.junit.Assert;

public class WalletSteps implements En {
    private CashSlot cashSlot = new CashSlot();
    private Wallet wallet = new Wallet(cashSlot);
    private MoneyMachine moneyMachine = new MoneyMachine(wallet);

    public WalletSteps() {

        Given("I have deposited $200 in my wallet", () -> {
            moneyMachine.createAtmBalance(500);
            wallet.deposit(200);
            Assert.assertEquals("Incorrect wallet balance", 200, wallet.getBalance());
        });

        When("I request $30", () -> {
            Teller teller = new Teller(cashSlot,moneyMachine);
            cashSlot.setFault(false);
            teller.withdraw(wallet, 30);
        });

        Then("$30 should be dispensed", () -> {
            Assert.assertEquals(30, cashSlot.getContents());
        });

        Then("the balance of my wallet should be $170", () -> {
            Assert.assertEquals("Incorrect wallet balance after withdraw", 170, wallet.getBalance());
        });

    }
}