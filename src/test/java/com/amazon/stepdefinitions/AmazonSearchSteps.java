package com.amazon.stepdefinitions;

import com.amazon.pages.ElectronicsPage;
import com.amazon.pages.HomePage;
import com.amazon.pages.MobilePhonesPage;
import com.amazon.utils.BaseTest;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazonSearchSteps extends BaseTest {

    HomePage homePage;
    ElectronicsPage electronicsPage;
    MobilePhonesPage mobilePhonesPage;
    @Before
            public void before() {
        setUp();
        homePage = new HomePage(driver);
        electronicsPage= new ElectronicsPage(driver);
        mobilePhonesPage = new MobilePhonesPage(driver);
    }



    @Given("I am on the Amazon UK homepage")
    public void iAmOnTheAmazonUKHomepage() {

        driver.get("https://www.amazon.co.uk");
    }

    @When("I navigate to Electronics and Computers -> Phones and Accessories -> Mobile Phones")
    public void iNavigateToElectronicsAndComputersPhonesAndAccessoriesMobilePhones() {
        homePage.acceptCookies();
        homePage.openHamburgerMenu();
        homePage.navigateToElectronicsAndComputers();
        electronicsPage.navigateToPhonesAndAccessories();
        mobilePhonesPage.navigateToMobilePhones();
    }

    @When("I filter phones with Camera Resolution of 20 MP and above, Model Year 2023, and Price Range £50 - £100")
    public void iFilterPhonesWithSpecifications() {
        mobilePhonesPage.applyFilters();
    }

    @Then("I should see a list of Samsung phones matching the criteria")
    public void iShouldSeeAListOfSamsungPhonesMatchingTheCriteria() {
        mobilePhonesPage.verifySamsungPhones();
    }
}
