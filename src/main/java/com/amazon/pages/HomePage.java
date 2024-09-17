package com.amazon.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
    WebDriver driver;

    By hamburgerMenu = By.id("nav-hamburger-menu");
    By electronicsAndComputers = By.xpath("//a[text()='Electronics & Computers']");


    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void acceptCookies(){
        By cookies_accept = By.xpath("//*[@name='accept']");
        driver.findElement(cookies_accept).click();
    }


    public void openHamburgerMenu() {
        driver.findElement(hamburgerMenu).click();
    }

    public void navigateToElectronicsAndComputers() {
        JavascriptExecutor jse = ((JavascriptExecutor) driver);
        jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        driver.findElement(electronicsAndComputers).click();
    }
}
