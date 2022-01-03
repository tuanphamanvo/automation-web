package lesson17;

import driver.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import url.Urls;

public class DropDownList {
    public static void main(String[] args) {
        WebDriver driver = DriverFactory.getChromeDriver();
        try {
            driver.get(Urls.BASE_URl.concat(Urls.DROPDOWN));


            //Target dropdown
            WebElement dropdownEle = driver.findElement(By.id("dropdown"));
            Select select = new Select(dropdownEle);
            select.selectByVisibleText("Option 1");
            Thread.sleep(2000);
            select.selectByIndex(2);
            Thread.sleep(2000);
            select.selectByValue("1");
            Thread.sleep(2000);



        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
