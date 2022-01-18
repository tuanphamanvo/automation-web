package lesson21.models.components.global.leftPanel;

import lesson20Practice.models.ComponentCssSelector;
import lesson20Practice.models.components.global.leftPanel.LeftPanelBlockComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

@ComponentCssSelector(".block.block-category-navigation")
public class CategoriesBlockComponent extends LeftPanelBlockComponent {
    private static final By categoryLinkSel = By.tagName("li");

    public CategoriesBlockComponent(WebDriver driver, WebElement component) {
        super(driver, component);
    }

    public List<String> getListCategories() {
        List<WebElement> categoryElements = component.findElements(categoryLinkSel);
        List<String> listCategories = new ArrayList<>();
        if (!categoryElements.isEmpty()) {
            for (WebElement ele : categoryElements) {
                listCategories.add(ele.getText());
            }
        }
        return listCategories;
    }
}
