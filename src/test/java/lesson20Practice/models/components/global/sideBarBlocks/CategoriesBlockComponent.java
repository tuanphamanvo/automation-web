package lesson20Practice.models.components.global.sideBarBlocks;

import lesson20Practice.models.ComponentCssSelector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

@ComponentCssSelector(".block.block-category-navigation")
public class CategoriesBlockComponent extends SideBlockComponent {
    private static final By categoryLinkSel = By.cssSelector("li a");

    public CategoriesBlockComponent(WebDriver driver, WebElement component) {
        super(driver, component);
    }

    public List<String> getListCategories() {
        List<WebElement> categoryElements = component.findElements(categoryLinkSel);
        List<String> listCategories = new ArrayList<>();
        if (!categoryElements.isEmpty()) {
            categoryElements.forEach(textEle ->{
                listCategories.add(textEle.getText());
            });
        }
        return listCategories;
    }
}
