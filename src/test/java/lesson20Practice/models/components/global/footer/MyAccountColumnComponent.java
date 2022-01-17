package lesson20Practice.models.components.global.footer;

import lesson20Practice.models.ComponentCssSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@ComponentCssSelector(".column.my-account")
public class MyAccountColumnComponent extends FooterColumnComponent{
    public MyAccountColumnComponent(WebDriver driver, WebElement component) {
        super(driver, component);
    }
}
