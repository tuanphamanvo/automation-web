package lesson19Practice.tests;

import lesson19.driver.DriverFactory;
import org.openqa.selenium.WebDriver;

public class helloWorldTest {
    public static void main(String[] args) {
        WebDriver driver = DriverFactory.getChromeDriver();
        driver.get("https://google.com");
    }
}
