package lesson19.models.pages;

import lesson18Practice.models.components.Header;
import lesson18Practice.models.components.NewsLetter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactUs extends BasePage{
    private final WebDriver driver;

    public ContactUs(WebDriver driver, WebElement element) {
        super(driver);
        this.driver = driver;
    }

    public Header headerComponent(){
        return new Header(driver);
    }


}
