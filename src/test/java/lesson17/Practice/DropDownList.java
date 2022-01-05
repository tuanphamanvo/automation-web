package lesson17.Practice;

import driver.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import url.Urls;

public class DropDownList implements Urls {
    private static final By dropDownListSel = By.id("dropdown");

    public static void main(String[] args) {
        WebDriver driver = DriverFactory.getChromeDriver();
        try {
            driver.get(BASE_URl.concat(DROPDOWN));
            Select select = new Select(driver.findElement(dropDownListSel));
            System.out.println(select.getOptions().size());

            //Get options list
            if(!select.getOptions().isEmpty()){
                for (){
                    select.getOptions().get(0).getText();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
