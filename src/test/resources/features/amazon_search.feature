Feature: Amazon Samsung Phone Search

  Scenario: List all the Samsung phones with specific specifications
    Given I am on the Amazon UK homepage
    When I navigate to Electronics and Computers -> Phones and Accessories -> Mobile Phones
    And I filter phones with Camera Resolution of 20 MP and above, Model Year 2023, and Price Range £50 - £100
    Then I should see a list of Samsung phones matching the criteria
