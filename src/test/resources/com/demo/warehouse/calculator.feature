Feature:
  As someone who wants to learn arithmetic
  I want to use the basic functions
  To make sure I know how to add, subtract, multiply and divide numbers

  Scenario: Adding 2 numbers
    Given I have 2 and 2
    When I run the calculator
    Then I see 4

  Scenario Outline: Adding 2 numbers
    Given I have <first_number> and <second_number>
    When I run the calculator
    Then I see <result>

    Examples:
      | first_number  | second_number | result  |
      |  2            |  2            |  4      |
      |  4            |  4            |  8      |

