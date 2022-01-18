package lesson21.models.components.global.footer;

import lesson20Practice.models.ComponentCssSelector;
import lesson20Practice.models.components.global.footer.FooterColumnComponent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@ComponentCssSelector(".column.information")
public class InformationColumnComponent extends FooterColumnComponent {

    public InformationColumnComponent(WebDriver driver, WebElement component) {
        super(driver, component);
    }
}
