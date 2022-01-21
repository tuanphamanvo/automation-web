package lesson21Practice.models.components.item;

import lesson21Practice.models.Component;
import lesson21Practice.models.ComponentCssSelector;
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

    public void getItemName(){
        System.out.println(component.findElement(itemNameSel).getText());
    }

    public String getShortDescription(){
        return component.findElement(shortDescriptionSel).getText();
    }

}
