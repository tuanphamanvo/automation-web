package lesson19.models.pages;

import lesson19.models.components.Header;
import lesson19.models.components.NewsLetter;
import models.components.HeaderComponent;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    private final WebDriver driver;

    public HomePage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

//    public Header headerComponent() {
//        return findComponent(HeaderComponent.class,driver);
//    }

//    public NewsLetter newsLetterComponent() {
//        return findComponent(NewsLetter.class,driver);
//
//    }
}
