package com.amazon.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MobilePhonesPage {
    WebDriver driver;

    By mobilePhones = By.xpath("//span[text()='Mobile Phones']");
    By cameraResolutionFilter = By.xpath("//span[text()='20 MP & above']");
    By modelYearFilter = By.xpath("//span[text()='2023']");
    By minPrice = By.id("low-price");
    By maxPrice = By.id("high-price");
    By goButton = By.xpath("//input[@aria-labelledby='a-autoid-1-announce']");

    public MobilePhonesPage(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToMobilePhones() {
        driver.findElement(mobilePhones).click();
    }

    public void applyFilters() {
        driver.findElement(cameraResolutionFilter).click();
        driver.findElement(modelYearFilter).click();
        driver.findElement(minPrice).sendKeys("50");
        driver.findElement(maxPrice).sendKeys("100");
        driver.findElement(goButton).click();
    }

    public void verifySamsungPhones() {
        // Logic to verify the list of Samsung phones goes here
    }
}
