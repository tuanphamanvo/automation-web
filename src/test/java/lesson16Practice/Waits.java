package lesson16Practice;

import driver.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import url.Urls;

import java.time.Duration;

public class Waits implements Urls {
    private static final By startBtnSel = By.tagName("button");
    private static final By loadingBarSel = By.id("loading");

    public static void main(String[] args) {
        WebDriver driver = DriverFactory.getChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try{
            driver.get(BASE_URl.concat(DYNAMIC_LOADING_1));

            //Implicit Wait
            driver.findElement(startBtnSel).click();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            driver.navigate().refresh();

            //Explicit Wait
            driver.findElement(startBtnSel).click();
            wait.until(ExpectedConditions.visibilityOf(driver.findElement(loadingBarSel)));

            driver.navigate().refresh();

            //Fluent wait
            FluentWait fluentWait = new FluentWait(driver);
            wait.withTimeout(Duration.ofSeconds(10));
            wait.pollingEvery(Duration.ofMillis(500));
            wait.ignoring(NoSuchElementException.class);
            driver.findElement(startBtnSel).click();
            fluentWait.until(ExpectedConditions.visibilityOf(driver.findElement(loadingBarSel)));

        }catch (Exception e){ e.printStackTrace();} finally {
            driver.quit();
        }
    }
}
