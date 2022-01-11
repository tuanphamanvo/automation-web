package lesson19Practice.models.pages;

import lesson19Practice.models.Component;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage  extends Component {
    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        super(driver, driver.findElement(By.tagName("html")));
    }
}
