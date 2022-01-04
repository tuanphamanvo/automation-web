package lesson16Practice;

import driver.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import url.Urls;

public class HandlingElementIsNotExisting implements Urls {
    private static final By delBtnSel = By.className("added-manually");
    public static void main(String[] args) {
        WebDriver driver = DriverFactory.getChromeDriver();
        try {
            driver.get(BASE_URl.concat(ADD_REMOVE_ELEMENT));
            System.out.println(driver.findElements(delBtnSel).isEmpty());
            driver.findElement(By.cssSelector("[onclick='addElement()']")).click();
            Thread.sleep(1000);
            System.out.println(driver.findElements(delBtnSel).isEmpty());
            driver.findElements(delBtnSel).get(0).click();
            Thread.sleep(1000);
            System.out.println(driver.findElements(delBtnSel).isEmpty());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
