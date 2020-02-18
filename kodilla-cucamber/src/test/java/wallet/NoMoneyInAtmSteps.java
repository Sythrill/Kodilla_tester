package wallet;

import io.cucumber.java8.En;
import org.junit.Assert;

public class NoMoneyInAtmSteps implements En {

    private CashSlot cashSlot = new CashSlot();
    private Wallet wallet = new Wallet(cashSlot);
    private MoneyMachine moneyMachine = new MoneyMachine(wallet);

    public NoMoneyInAtmSteps() {
        Given("the ATM contains $10", () -> {
           moneyMachine.createAtmBalance(10);
            wallet.deposit(20);
        });

        When("I withdraw $20", () -> {
            cashSlot.setFault(false);
            Teller teller = new Teller(cashSlot, moneyMachine);
            teller.withdraw(wallet, 20);
        });

        Then("I should see an ask-for-less-money message", () -> {

            Assert.assertEquals("You can withdraw 10", moneyMachine.creditInfo() );
        });
        Then("$0 should be dispensed from balance", () -> {
            Assert.assertEquals(0, cashSlot.getContents());
        });

        Then("the balance of account should be unchanged", () -> {

            Assert.assertEquals(20, wallet.getBalance());
        });
    }
}
