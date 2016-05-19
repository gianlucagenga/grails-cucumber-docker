Feature: Calculate
  Scenario: Add two numbers
    Given the input "2+2"
    When the calculator is run
    Then the output should be "4"

  Scenario: Subtract two numbers
    Given the input "10-3"
    When the calculator is run
    Then the output should be "7"

  Scenario: Multiply two numbers
    Given the input string "10*3"
    When the calculator is run
    Then the output should be "30"

