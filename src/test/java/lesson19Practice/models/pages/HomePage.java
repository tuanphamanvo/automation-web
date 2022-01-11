package lesson19Practice.models.pages;

import lesson19Practice.models.global.Footer;
import lesson19Practice.models.global.Header;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    private final WebDriver driver;

    public HomePage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public Header header() {
        return findComponent(Header.class, driver);
    }

    public Footer footer() {
        return findComponent(Footer.class, driver);
    }
}
