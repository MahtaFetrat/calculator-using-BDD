@tag
Feature: Calculator

  Scenario: operate on two numbers
    Given Two input values, 4 and 2, and operation *
    When I operate on the two values
    Then I expect the result 8

  Scenario: operate on two numbers
    Given Two input values, 7 and 2, and operation /
    When I operate on the two values
    Then I expect the result 3.5

  Scenario: operate on two numbers
    Given Two input values, 4 and 2, and operation ^
    When I operate on the two values
    Then I expect the result 16.0

  Scenario Outline: operate on two numbers
    Given Two input values, <first> and <second>, and operation <operation>
    When I operate on the two values
    Then I expect the result <result>

    Examples:
      | first | second | operation  | result   |
      | 1     | 12     | *          | 12       |
      | -1    | 6      | *  	    | -6       |
      | 2     | 2      | *	        | 4        |
      | 12    | 1      | /          | 12.0     |
      | -6    | 2      | /          | -3.0	   |
      | 2     | 2      | /          | 1.0      |
      | 9     | -2     | /          | -4.5	   |
      | 2     | 4      | ^          | 16.0     |
      | -6    | 3      | ^          | -216.0   |
      | 2     | -2     | ^          | 0.25	   |
      | 2     | 0      | ^          | 1.0	   |
