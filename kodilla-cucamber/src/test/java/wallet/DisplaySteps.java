package wallet;

import io.cucumber.java8.En;
import org.junit.Assert;

public class DisplaySteps implements En {
    private Wallet wallet = new Wallet();

    public DisplaySteps() {
        Given("my account has been credited with $100", () -> {
            wallet.deposit(100);
            Assert.assertEquals("Incorrect wallet balance after deposit", 100, wallet.getBalance());

        });

        When("I check my balance", () -> {
            wallet.getBalance();
        });

        Then("I should see that my balance is $100", () -> {
            Assert.assertEquals("Wallet balance= " + wallet.getBalance(), wallet.toString());
        });
    }
}