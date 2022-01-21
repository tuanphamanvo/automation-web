package lesson21Practice.models.pages;

import lesson21Practice.models.Component;
import lesson21Practice.models.components.global.Header;
import lesson21Practice.models.components.global.footer.Footer;
import lesson21Practice.models.components.global.sideBarBlocks.LeftBlocks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage  extends Component {
    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        super(driver, driver.findElement(By.tagName("html")));
    }

    public Header header() {
        return findComponent(Header.class, driver);
    }

    public Footer footer() {
        return findComponent(Footer.class, driver);
    }

    public LeftBlocks leftBlocks() {
        return findComponent(LeftBlocks.class, driver);
    }
}
