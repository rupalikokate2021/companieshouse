Feature: Successful Login

  Scenario: Login Successful
    Given I am on the login page
    When I enter valid username and password
    And I click on the login button
    Then I should see the landing page