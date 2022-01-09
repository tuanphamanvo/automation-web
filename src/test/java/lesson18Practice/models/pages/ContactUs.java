package lesson18Practice.models.pages;

import lesson18Practice.models.components.Header;
import lesson18Practice.models.components.NewsLetter;
import org.openqa.selenium.WebDriver;

public class ContactUs {
    private final WebDriver driver;

    public ContactUs(WebDriver driver) {
        this.driver = driver;
    }

    public Header headerComponent(){
        return new Header(driver);
    }

    public NewsLetter newsLetterComponent(){
        return new NewsLetter(this.driver);
    }
}
