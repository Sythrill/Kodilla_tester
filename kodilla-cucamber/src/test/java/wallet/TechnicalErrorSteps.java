package wallet;

import io.cucumber.java8.En;
import org.junit.Assert;

public class TechnicalErrorSteps implements En {

    private CashSlot cashSlot = new CashSlot();
    private Wallet wallet = new Wallet(cashSlot);
    private MoneyMachine moneyMachine = new MoneyMachine(wallet);

    public TechnicalErrorSteps() {
        Given("my account is in credit", () -> {
            wallet.deposit(100);
        });

        Given("the cash slot has developed a fault", () -> {
            cashSlot.setFault(true);
        });

        When("I request some of my money", () -> {
            Teller teller = new Teller(cashSlot, moneyMachine);
            teller.withdraw(wallet, 30);
        });

        Then("I should see an out-of-order message", () -> {
            Assert.assertEquals("Technical error", cashSlot.faultMessage());
        });

        Then("$0 should be dispensed", () -> {
            Assert.assertEquals(0, cashSlot.getContents());
        });

        Then("the balance of my account should be unchanged", () -> {
            Assert.assertEquals(100, wallet.getBalance());
        });

    }

}