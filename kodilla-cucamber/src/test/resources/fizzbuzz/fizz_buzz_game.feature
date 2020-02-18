Feature: FizzBuzz game

   Scenario Outline: When to fizz-buzz
     Given I am checking <number> for FizzBuzz
     When the number is <number>
     Then I should be told <answer>
     Examples:
     |number|answer|
     |      one     | Nope   |
     |      six     | Fizz   |
     |      ten     | Buzz   |
     |      fifteen |FizzBuzz|