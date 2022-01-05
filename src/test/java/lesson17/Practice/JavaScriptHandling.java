package lesson17.Practice;

import api_learning.Wait;
import driver.DriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import url.Urls;

import java.time.Duration;

public class JavaScriptHandling implements Urls {

    private static final By jsAlertBtnSel = By.cssSelector("[onclick='jsAlert()']");
    private static final By jsConfirmBtnSel = By.cssSelector("[onclick='jsConfirm()']");
    private static final By jsPromptBtnSel = By.cssSelector("[onclick='jsPrompt()']");
    private static final By resultTxtSel = By.id("result");

    public static void main(String[] args) {
        WebDriver driver = DriverFactory.getChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        try {
            driver.get(BASE_URl.concat(JAVASCRIPT_ALERT));

            //jsAlert
            driver.findElement(jsAlertBtnSel).click();
            Alert alert = wait.until(ExpectedConditions.alertIsPresent());
            alert.accept();
            System.out.println(driver.findElement(resultTxtSel).getText());

            //jsConfirm
            driver.findElement(jsConfirmBtnSel).click();
            Alert confirmDismiss = wait.until(ExpectedConditions.alertIsPresent());
            confirmDismiss.dismiss();
            System.out.println(driver.findElement(resultTxtSel).getText());
            driver.findElement(jsConfirmBtnSel).click();
            Alert confirmAccept = wait.until(ExpectedConditions.alertIsPresent());
            confirmAccept.accept();
            System.out.println(driver.findElement(resultTxtSel).getText());

            //jsPrompt
            driver.findElement(jsPromptBtnSel).click();
            Alert promptCancel = wait.until(ExpectedConditions.alertIsPresent());
            System.out.println(promptCancel.getText());
            promptCancel.sendKeys("abc");
            promptCancel.dismiss();
            System.out.println(driver.findElement(resultTxtSel).getText());

            driver.findElement(jsPromptBtnSel).click();
            Alert promptOkNull = wait.until(ExpectedConditions.alertIsPresent());
            System.out.println(promptOkNull.getText());
            promptOkNull.accept();
            System.out.println(driver.findElement(resultTxtSel).getText());

            driver.findElement(jsPromptBtnSel).click();
            Alert promptOkVal = wait.until(ExpectedConditions.alertIsPresent());
            System.out.println(promptOkVal.getText());
            promptCancel.sendKeys("abc");
            promptOkVal.accept();
            System.out.println(driver.findElement(resultTxtSel).getText());

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
