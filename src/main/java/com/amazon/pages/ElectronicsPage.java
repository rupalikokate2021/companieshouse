package com.amazon.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ElectronicsPage {
    WebDriver driver;

    By phonesAndAccessories = By.xpath("//a[text()='Phones & Accessories']");

    public ElectronicsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToPhonesAndAccessories() {
        driver.findElement(phonesAndAccessories).click();
    }
}
