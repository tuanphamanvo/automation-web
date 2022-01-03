package lesson17;

import driver.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import url.Urls;

public class iFrame {
    public static void main(String[] args) {
        WebDriver driver = DriverFactory.getChromeDriver();
        try {
            driver.get(Urls.BASE_URl.concat(Urls.IFRAME));

            WebElement mceIframeEle = driver.findElement(By.cssSelector("[id$='ifr']"));

            //Switch to mce iframe
            driver.switchTo().frame(mceIframeEle);

            //Get element in iframe
            WebElement textInputEle = driver.findElement(By.id("tinymce"));
            textInputEle.sendKeys("New Text");
            //Switch back to main DOM
            driver.switchTo().defaultContent();
            Thread.sleep(10000);



        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
