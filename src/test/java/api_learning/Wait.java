package api_learning;

import driver.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static url.Urls.BASE_URl;
import static url.Urls.DYNAMIC_CONTROL_PATH;

public class Wait {
    public static void main(String[] args) {
        WebDriver driver = DriverFactory.getChromeDriver();
        try{
            driver.get(BASE_URl.concat(DYNAMIC_CONTROL_PATH));

            //find the checkbox-example form
            WebElement checkboxExampleFormEle = driver.findElement(By.id("checkbox-example"));

            //find the button in the checkbox-example form
            WebElement checkboxExampleFormBtnEle = checkboxExampleFormEle.findElement(By.tagName("button"));
            checkboxExampleFormBtnEle.click();


            //Explicit wait another element condition then get the text
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//            wait.until(ExpectedConditions.invisibilityOf(checkboxExampleFormEle.findElement(By.tagName("input"))));

            //Find element with wait
            WebElement msgCheckBoxEle = wait.until(ExpectedConditions.visibilityOf(checkboxExampleFormEle.findElement(By.id("message"))));

            //Explicit wait the element condition appear
            WebElement msgEle = checkboxExampleFormEle.findElement(By.id("message"));
            wait.until(ExpectedConditions.visibilityOf(msgEle));

            //Get element contain expectation Text

            System.out.println(msgCheckBoxEle.getText());
            System.out.println(msgEle.getText());


            //find the input-example form
            WebElement inputExampleFormEle = driver.findElement(By.id("input-example"));

            //find the button in the input-example form
            WebElement inputExampleFormBtnEle = inputExampleFormEle.findElement(By.tagName("button"));
            inputExampleFormBtnEle.click();
            WebElement inputTextBox = inputExampleFormEle.findElement(By.tagName("input"));
            System.out.println(inputTextBox.isEnabled());
            inputTextBox.isEnabled();
            wait.until(ExpectedConditions.elementToBeClickable(inputTextBox));
            inputTextBox.sendKeys("Yess");
            System.out.println(inputExampleFormEle.findElement(By.id("message")).getText());
            System.out.println(inputTextBox.isEnabled());



        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
