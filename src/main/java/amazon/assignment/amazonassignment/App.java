package amazon.assignment.amazonassignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Samael Bate (singingbush)
 * created on 10/10/18
 */
public class App {

    private static final Logger log = LoggerFactory.getLogger(App.class);

    public static void main(final String[] args) {
        WebDriver driver;

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");


//Setting system properties of ChromeDriver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rupali\\chromedriver\\chromedriver.exe");

//Creating an object of ChromeDriver
        driver = new ChromeDriver(options);

//launching the specified URL
        driver.get("https://www.lokmat.com/");
        log.info("Hello World!");
    }
}
