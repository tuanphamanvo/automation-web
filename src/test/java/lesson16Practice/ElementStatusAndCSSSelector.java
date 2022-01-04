package lesson16Practice;

import driver.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import url.Urls;

import java.time.Duration;
import java.util.List;

public class ElementStatusAndCSSSelector implements Urls {
    private static final By textInputSel = By.cssSelector("[type='text']");
    private static final By checkBoxSel = By.cssSelector("[type='checkbox']");
    private static final By formExampleSel = By.id("input-example");
    private static final By loadingBarSel = By.id("loading");

    public static void main(String[] args) {
        WebDriver driver = DriverFactory.getChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
            driver.get(BASE_URl.concat(DYNAMIC_CONTROL_PATH));
            List<WebElement> checkboxeElements = driver.findElements(checkBoxSel);
            System.out.println(checkboxeElements.get(0).isSelected());
            checkboxeElements.get(0).click();
            System.out.println(checkboxeElements.get(0).isSelected());

            System.out.println(driver.findElement(textInputSel).isEnabled());
            driver.findElement(formExampleSel).findElement(By.tagName("button")).click();
            wait.until(ExpectedConditions.invisibilityOf(driver.findElement(loadingBarSel)));
            System.out.println(driver.findElement(textInputSel).isEnabled());

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
