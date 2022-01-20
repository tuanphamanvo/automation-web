package lesson20Practice.models.components.item;

import lesson20Practice.models.ComponentCssSelector;
import lesson20Practice.models.Component;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@ComponentCssSelector(".page.product-details-page")
public class BaseItemDetails extends Component {
    private static final By shortDescriptionSel = By.className("short-description");
    private static final By itemNameSel = By.cssSelector("[itemprop='name']");
    public BaseItemDetails(WebDriver driver, WebElement component) {
        super(driver, component);
    }

    public String getItemName(){
        return component.findElement(itemNameSel).getText();
    }

    public String getShortDescription(){
        return component.findElement(shortDescriptionSel).getText();
    }

}
