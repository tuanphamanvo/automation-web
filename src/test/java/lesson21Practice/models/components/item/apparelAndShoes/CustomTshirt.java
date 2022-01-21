package lesson21Practice.models.components.item.apparelAndShoes;

import lesson21Practice.models.ComponentCssSelector;
import lesson21Practice.models.components.item.BaseItemDetails;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@ComponentCssSelector(".product-essential")
public class CustomTshirt extends BaseItemDetails {
    public CustomTshirt(WebDriver driver, WebElement component) {
        super(driver, component);
    }

    public void inputCustomText(String text){
        System.out.println("CustomTshirt | inputCustomText");
    }
}
