package lesson21Practice.models.pages.apparelAndShoes;

import lesson21Practice.models.components.item.BaseItemDetails;
import lesson21Practice.models.pages.BasePage;
import org.openqa.selenium.WebDriver;

public class ItemDetailsPage extends BasePage {
    public ItemDetailsPage(WebDriver driver) {
        super(driver);
    }

    public <T extends BaseItemDetails> T apparelAndShoes(Class<T> apparelAndShoesClass){
        return findComponent(apparelAndShoesClass,driver);
    }
}
