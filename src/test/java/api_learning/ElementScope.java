package api_learning;

import driver.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static url.Urls.BASE_URl;
import static url.Urls.DYNAMIC_CONTROL_PATH;

public class ElementScope {
    public static void main(String[] args) {
        WebDriver driver = DriverFactory.getChromeDriver();
        try{
            driver.get(BASE_URl.concat(DYNAMIC_CONTROL_PATH));

            //find the checkbox-example form
            WebElement checkboxExampleFormEle = driver.findElement(By.id("checkbox-example"));

            //find the button in the checkbox-example form
            WebElement checkboxExampleFormBtnEle = checkboxExampleFormEle.findElement(By.tagName("button"));


            //input the input-example form
            WebElement inputExampleFormEle = driver.findElement(By.id("input-example"));

            //find the button in the input-example form
            WebElement inputExampleFormBtnEle = inputExampleFormEle.findElement(By.tagName("button"));

            //Click on those buttons
            checkboxExampleFormBtnEle.click();
            inputExampleFormBtnEle.click();

            Thread.sleep(2000);


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
