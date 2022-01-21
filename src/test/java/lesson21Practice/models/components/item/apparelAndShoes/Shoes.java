package lesson21Practice.models.components.item.apparelAndShoes;

import lesson21Practice.models.ComponentCssSelector;
import lesson21Practice.models.components.item.BaseItemDetails;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
@ComponentCssSelector(".product-essential")
public class Shoes extends BaseItemDetails {
    public Shoes(WebDriver driver, WebElement component) {
        super(driver, component);
    }

    public void selectColor(){
        System.out.println("Shoes | selectColor");
    }
    public void selectSize(){
        System.out.println("Shoes | selectSize");
    }
}
