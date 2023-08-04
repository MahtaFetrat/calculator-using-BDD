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

  Scenario Outline: divide two numbers
    Given Two input values, <first> and <second>
    When I divide the two values
    Then I expect the double result <result>

    Examples:
      | first | second | result |
      | 12    | 1      | 12.0   |
      | -6    | 2      | -3.0	|
      | 2     | 2      | 1.0    |
      | 9     | -2     | -4.5	|

  Scenario Outline: power two numbers
    Given Two input values, <first> and <second>
    When I power the two values
    Then I expect the double result <result>

    Examples:
      | first | second | result |
      | 2     | 4      | 16.0   |
      | -6    | 3      | -216.0  |
      | 2     | -2     | 0.25	|
      | 2     | 0      | 1.0	|