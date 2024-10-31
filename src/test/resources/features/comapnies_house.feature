Feature: Companies House Items Search

  Scenario: Shop an item on saucedemo website
    Given I am able to login to website Successful
    When I click on the first product item
    And I should see single product details page
    And I click on Add to Cart
    And I click on Cart details
    Then I should see the Cart Details