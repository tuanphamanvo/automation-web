package lesson20Practice.models.components.global.leftPanel;

import lesson20Practice.models.ComponentCssSelector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

@ComponentCssSelector(".block.block-category-navigation")
public class CategoriesBlockComponent extends LeftPanelBlockComponent{
    private static final By categoryLinkSel = By.tagName("li");
    public CategoriesBlockComponent(WebDriver driver, WebElement component) {
        super(driver, component);
    }

    public List<WebElement> getListCategories(){
        return component.findElements(categoryLinkSel);
    }
}
