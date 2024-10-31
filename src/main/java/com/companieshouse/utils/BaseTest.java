package com.companieshouse.utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    protected WebDriver driver;

    @BeforeClass
    public void setUp() {
        System.out.println("Starting");
      System.setProperty("webdriver.chrome.driver", "C:\\\\code\\\\driver\\test\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        //options.setBrowserVersion("130.0.6723.91");
        //options.setCapability("browserVersion", "130.0.6723.91");
        driver = new ChromeDriver(options);

        System.out.println("Driver Created");
        driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(3));
        driver.manage().window().maximize();

    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
