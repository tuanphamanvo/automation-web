package lesson21.models.components.global.leftPanel;

import lesson20Practice.models.ComponentCssSelector;
import lesson20Practice.models.components.global.leftPanel.LeftPanelBlockComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

@ComponentCssSelector(".block.block-manufacturer-navigation")
public class ManufacturersBlockComponent extends LeftPanelBlockComponent {
    private static final By categoryLinkSel = By.tagName("li");

    public ManufacturersBlockComponent(WebDriver driver, WebElement component) {
        super(driver, component);
    }
    public List<WebElement> getListManufacturers(){
        return component.findElements(categoryLinkSel);
    }

}
