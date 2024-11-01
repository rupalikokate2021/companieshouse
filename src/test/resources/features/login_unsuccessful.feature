 Feature: Login unsuccessful 
 

  Scenario: Login Unsuccessfull
    Given I am on the login page
    When I do not enter username and password
    And I click on the login button
    Then I should see an error message