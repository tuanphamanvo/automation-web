package lesson18Practice.models.pages;

import lesson18Practice.models.components.Header;
import lesson18Practice.models.components.NewsLetter;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private final WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public Header headerComponent(){
        return new Header(driver);
    }

    public NewsLetter newsLetterComponent(){
        return new NewsLetter(driver);
    }
}
