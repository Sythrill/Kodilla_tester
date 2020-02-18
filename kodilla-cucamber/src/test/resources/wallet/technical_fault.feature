Feature: Technical error
    Scenario: Unsuccessful withdrawal due to technical fault
        Given my account is in credit
        But the cash slot has developed a fault
        When I request some of my money
        Then I should see an out-of-order message
        And $0 should be dispensed
        And the balance of my account should be unchanged