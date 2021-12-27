package api_learning;

import driver.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FormHandling {
    public static void main(String[] args) {
        WebDriver driver = DriverFactory.getChromeDriver();

        try{driver.get("https://the-internet.herokuapp.com/login");

        WebElement usernameElem = driver.findElement(By.id("username"));
        WebElement passwordElem = driver.findElement(By.cssSelector("#password"));
        WebElement loginBtnElem = driver.findElement(By.tagName("button"));
        usernameElem.sendKeys("teo");
        passwordElem.sendKeys("123456");
        loginBtnElem.click();
        }
        finally {driver.quit();};
    }
}
