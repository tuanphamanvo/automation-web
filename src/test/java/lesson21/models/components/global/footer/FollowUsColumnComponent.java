package lesson21.models.components.global.footer;

import lesson20Practice.models.ComponentCssSelector;
import lesson20Practice.models.components.global.footer.FooterColumnComponent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@ComponentCssSelector(".column.follow-us")
public class FollowUsColumnComponent extends FooterColumnComponent {
    public FollowUsColumnComponent(WebDriver driver, WebElement component) {
        super(driver, component);
    }
}
