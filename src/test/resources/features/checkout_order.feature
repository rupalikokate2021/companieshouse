Feature: Companies House Items Search and checkout Order

  Scenario: Shop an item on saucedemo website
    Given I am able to login to website Successful
    When I click on the first product item
    And I should see single product details page
    And I click on Add to Cart
    And I click on Cart details
    And I should see the Cart Details
    And I click on checkout
    And I fill name and address details
    And I click on continue
    And I click on finish