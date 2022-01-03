package lesson17;

import driver.DriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import url.Urls;

import java.time.Duration;

public class HandlingJs implements Urls {
    private static final By jsAlertSel  = By.cssSelector("[onclick='jsAlert()']");
    private static final By jsConfirmSel  = By.cssSelector("[onclick='jsConfirm()']");
    private static final By jsPromptSel  = By.cssSelector("[onclick='jsPrompt()']");
    private static final By resultSel  = By.id("result");

    public static void main(String[] args) {
        WebDriver driver = DriverFactory.getChromeDriver();
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            driver.get(BASE_URl.concat(JAVASCRIPT_ALERT));

            //JS Alert
            driver.findElement(jsAlertSel).click();
            Alert jsAlert = wait.until(ExpectedConditions.alertIsPresent());
            System.out.println(jsAlert.getText());
            jsAlert.accept();
            System.out.println(driver.findElement(resultSel).getText());
            System.out.println("=============================================");

            //JS Confirm
            driver.findElement(jsConfirmSel).click();
            Alert jsConfirm = wait.until(ExpectedConditions.alertIsPresent());
            System.out.println(jsConfirm.getText());
            jsAlert.dismiss();
            System.out.println(driver.findElement(resultSel).getText());
            System.out.println("=============================================");

            driver.findElement(jsConfirmSel).click();
            System.out.println(jsConfirm.getText());
            jsAlert.accept();
            System.out.println(driver.findElement(resultSel).getText());
            System.out.println("=============================================");

            //JS Prompt
            driver.findElement(jsPromptSel).click();
            Alert jsPrompt = wait.until(ExpectedConditions.alertIsPresent());
            System.out.println(jsPrompt.getText());
            jsPrompt.sendKeys("abcdef");
            jsAlert.accept();
            System.out.println(driver.findElement(resultSel).getText());
            System.out.println("=============================================");


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
