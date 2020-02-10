package fizzbuzz;

import io.cucumber.java8.En;
import org.junit.Assert;

public class FizzBuzzSteps implements En{
    private FizzBuzz fizzBuzz;
    private String answer;
    public FizzBuzzSteps() {
        Given("I am checking one for FizzBuzz", () -> {
            fizzBuzz = new FizzBuzz();
        });

        When("the number is one", () -> {
           answer = fizzBuzz.checkFizzBuzz(1);
        });

        Then("I should be told Nope", () -> {
            Assert.assertEquals("Nope", answer);
        });

        Given("I am checking six for FizzBuzz", () -> {
            fizzBuzz = new FizzBuzz();
        });

        When("the number is six", () -> {
            answer = fizzBuzz.checkFizzBuzz(6);
        });

        Then("I should be told Fizz", () -> {
            Assert.assertEquals("Fizz", answer);
        });

        Given("I am checking ten for FizzBuzz", () -> {
            fizzBuzz = new FizzBuzz();
        });

        When("the number is ten", () -> {
            answer = fizzBuzz.checkFizzBuzz(10);
        });

        Then("I should be told Buzz", () -> {
            Assert.assertEquals("Buzz", answer);
        });

        Given("I am checking fifteen for FizzBuzz", () -> {
            fizzBuzz = new FizzBuzz();
        });

        When("the number is fifteen", () -> {
            answer = fizzBuzz.checkFizzBuzz(15);
        });

        Then("I should be told FizzBuzz", () -> {
            Assert.assertEquals("FizzBuzz", answer);
        });
    }
}