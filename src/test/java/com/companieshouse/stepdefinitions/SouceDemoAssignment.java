package com.companieshouse.stepdefinitions;

import com.companieshouse.pages.CartDetails;
import com.companieshouse.pages.LoginSteps;
import com.companieshouse.pages.ProductDetails;
import com.companieshouse.utils.BaseTest;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SouceDemoAssignment extends BaseTest {

    LoginSteps loginSteps;
    ProductDetails productDetails;
    CartDetails cartDetails;

    @Before
    public void before() {
        setUp();
        loginSteps = new LoginSteps(driver);
        productDetails = new ProductDetails(driver);
        cartDetails = new CartDetails(driver);
    }

    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        loginSteps.i_am_on_the_login_page();
    }

    @When("I enter valid username and password")
    public void i_enter_valid_username_and_password() {
        loginSteps.i_enter_valid_username_and_password();
    }

    @When("I enter invalid username and password")
    public void i_enter_invalid_username_and_password() {
        loginSteps.i_enter_invalid_username_and_password();
    }

    @When("I click on the login button")
    public void i_click_on_the_login_button() {
        loginSteps.i_click_on_the_login_button();
    }

    @Then("I should see the welcome message")
    public void i_should_see_the_welcome_message() {
        loginSteps.i_should_see_the_welcome_message();
    }

    @Then("I should see an error message")
    public void i_should_see_an_error_message() {
       loginSteps.i_should_see_an_error_message();
    }

    @Given("I am able to login to website Successful")
    public void i_am_able_to_login_to_website_Successful() {
        loginSteps.i_am_on_the_login_page();
        loginSteps.i_enter_valid_username_and_password();
        loginSteps.i_click_on_the_login_button();
        productDetails.i_should_see_the_all_products();
    }

    @When("I click on the first product item")
    public void i_click_on_the_first_product_item() {
        productDetails.i_click_on_the_product_item();
    }

    @When("I click on Add to Cart")
    public void i_click_on_the_product_item_to_add_to_cart() {
        productDetails.i_click_on_the_product_item_to_add_to_cart();
    }

    @When("I should see single product details page")
    public void i_should_see_the_product_details_page() {
        productDetails.i_should_see_the_single_product_details();;
    }

    @When("I click on Cart details")
    public void i_click_on_cart_details() {
        cartDetails.i_click_on_cart_details();
    }

    @Then("I should see the Cart Details")
    public void i_should_see_the_cart_Details() {
        cartDetails.i_should_see_cart_details();
    }  
    
}
