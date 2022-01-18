package lesson21.models.pages;

import lesson20Practice.models.pages.BasePage;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    private final WebDriver driver;

    public HomePage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }
}
