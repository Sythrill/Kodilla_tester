package wallet;

import io.cucumber.java8.En;
import org.junit.Assert;

public class OverdrawnSteps implements En {

    private CashSlot cashSlot = new CashSlot();
    private Wallet wallet = new Wallet(cashSlot);
    private MoneyMachine moneyMachine = new MoneyMachine(wallet);

    public OverdrawnSteps() {
        Given("my wallet has been credited with $100", () -> {
            wallet.deposit(100);
            Assert.assertEquals("Incorrect wallet balance after deposit", 100, wallet.getBalance());
        });

        When("I withdraw $200", () -> {
            Teller teller = new Teller(cashSlot, moneyMachine);
            teller.withdraw(wallet, 200);
        });

        Then("nothing should be dispensed", () -> {
            Assert.assertEquals("Error in cash slot",0, cashSlot.getContents());
            Assert.assertEquals("Error in cash slot",100, wallet.getBalance());
        });

        Then("I should be told that I have insufficient funds in my account", () -> {
            Assert.assertEquals("insufficient funds", wallet.noFunds(200));
        });
    }
}