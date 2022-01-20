package lesson20Practice.models.components.item.apparelAndShoes;

import lesson20Practice.models.components.item.BaseItemDetails;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CustomTshirt extends BaseItemDetails {
    public CustomTshirt(WebDriver driver, WebElement component) {
        super(driver, component);
    }

    public void inputCustomText(String text){
    }
}
