package lesson21Practice.models.components.global.footer;

import lesson21Practice.models.ComponentCssSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@ComponentCssSelector(".column.customer-service")
public class CustomerServiceColumnComponent extends FooterColumnComponent {
    public CustomerServiceColumnComponent(WebDriver driver, WebElement component) {
        super(driver, component);
    }
}
