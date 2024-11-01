Feature: Login Successful 

  Scenario Outline: Login Successful
    Given I am on the login page
    When I enter valid "<username>" and "<password>"
    And I click on the login button
    Then I should see the landing page

Examples:
| username                | password      |
| standard_user           | secret_sauce  | 
| problem_user            | secret_sauce  |
| performance_glitch_user | secret_sauce  |