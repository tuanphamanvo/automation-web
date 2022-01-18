package lesson21.models.pages;

import lesson20Practice.models.Component;
import lesson20Practice.models.components.global.Header;
import lesson20Practice.models.components.global.footer.Footer;
import lesson20Practice.models.components.global.leftPanel.LeftPanel;
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
    public LeftPanel leftPanel(){ return findComponent(LeftPanel.class,driver);}

}
