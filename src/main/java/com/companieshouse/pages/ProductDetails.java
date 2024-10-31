package com.companieshouse.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductDetails {
    private WebDriver driver;
    private WebDriverWait wait;

    public ProductDetails(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    public void i_am_on_the_login_page() {
        driver.get("https://www.saucedemo.com/v1/index.html");
    }

    public void i_enter_valid_username_and_password() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user-name"))).sendKeys("standard_user");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password"))).sendKeys("secret_sauce");
    }

    public void i_click_on_the_login_button() {
        driver.findElement(By.id("login-button")).click();
    }

 
    public void i_should_see_the_all_products() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("inventory_container")));
        System.out.println("Login successful: " + driver.findElement(By.id("inventory_container")).getText());
    
    }

    public void i_should_see_the_single_product_details() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("inventory_item_container")));
        System.out.println("Single Product details: " + driver.findElement(By.id("inventory_item_container")).getText());
    
    }

    public void i_click_on_the_product_item() {
        driver.findElement(By.id("item_4_title_link")).click();

    }

    public void i_click_on_the_product_item_to_add_to_cart() {
        driver.findElement(By.className("btn_primary")).click();
    }
}
