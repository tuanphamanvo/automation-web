package lesson17.Practice;

import driver.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import url.Urls;

import java.util.List;

public class DropDownList implements Urls {
    private static final By dropDownListSel = By.id("dropdown");
    private static final String tobeSelectedOption = "Option 2";

    public static void main(String[] args) {
        WebDriver driver = DriverFactory.getChromeDriver();
        try {
            driver.get(BASE_URl.concat(DROPDOWN));
            Select select = new Select(driver.findElement(dropDownListSel));


            //Get options list
            if(!select.getOptions().isEmpty()){
                List<WebElement> allOptions = select.getOptions();
                for(WebElement option:allOptions){
                    System.out.println(option.getText());
                }
            }

            //Select an option
            select.selectByVisibleText(tobeSelectedOption);

            //Verify selected option
            if(!select.getFirstSelectedOption().getText().equals(tobeSelectedOption)){
                throw new RuntimeException("[ERR] Selected option is NOT as expected");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
