Feature: No money in ATM Machine
    Scenario: Unsuccessful withdrawal due to insufficient ATM funds
        Given the ATM contains $10
        When I withdraw $20
        Then I should see an ask-for-less-money message
        And $0 should be dispensed from balance
        And the balance of account should be unchanged