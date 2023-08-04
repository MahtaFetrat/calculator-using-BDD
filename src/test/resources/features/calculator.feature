@tag
Feature: Calculator

  Scenario: multiply two numbers
    Given Two input values, 4 and 2
    When I multiply the two values
    Then I expect the integer result 8

  Scenario: divide two numbers
    Given Two input values, 7 and 2
    When I divide the two values
    Then I expect the double result 3.5

  Scenario: power two numbers
    Given Two input values, 4 and 2
    When I power the two values
    Then I expect the double result 16.0

  Scenario Outline: multiply two numbers
    Given Two input values, <first> and <second>
    When I multiply the two values
    Then I expect the integer result <result>

    Examples:
      | first | second | result |
      | 1     | 12     | 12     |
      | -1    | 6      | -6  	|
      | 2     | 2      | 4	    |
