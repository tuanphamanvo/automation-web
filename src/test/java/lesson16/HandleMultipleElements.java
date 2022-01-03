package lesson16;

import driver.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import url.Urls;

import java.util.List;

public class HandleMultipleElements {
    public static void main(String[] args) {
        WebDriver driver = DriverFactory.getChromeDriver();
        try {
            driver.get(Urls.BASE_URl.concat(Urls.TABLES));

            //Handle multiple elements in finding elements
            List<WebElement> tablesElements = driver.findElements(By.tagName("table"));
            WebElement tableExample1Ele = tablesElements.get(0);
            WebElement tableExample2Ele = tablesElements.get(1);

            WebElement table1HeaderRowEle = tableExample1Ele.findElement(By.tagName("tr"));
            List<WebElement> table1ColNameElements = table1HeaderRowEle.findElements(By.tagName("th"));
            for(WebElement colNameEle : table1ColNameElements){
                System.out.println(colNameEle.getText());
            }



        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.close();
        }
    }
}
