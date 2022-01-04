package lesson16Practice;

import driver.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import url.Urls;

public class FindingElement {
    public static void main(String[] args) {
        WebDriver driver = DriverFactory.getChromeDriver();
        try{
            driver.get(Urls.BASE_URl.concat(Urls.DYNAMIC_CONTROL_PATH));

            //Finding element in scope
            WebElement formCheckBoxEle = driver.findElement(By.id("checkbox-example"));
            WebElement checkBoxInCheckBoxFormEle = formCheckBoxEle.findElement(By.tagName("input"));

            WebElement formInputEle = driver.findElement(By.id("input-example"));
            WebElement inputInInputFormEle = formInputEle.findElement(By.tagName("input"));

            ///Click on correct ele even same locator definition but different scope
            inputInInputFormEle.sendKeys("ABC");
            checkBoxInCheckBoxFormEle.click();

        } catch (Exception e){e.printStackTrace();}
        finally {
            driver.close();
        }
    }
}
