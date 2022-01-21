package lesson21Practice.tests.testItem;

import lesson21Practice.driver.DriverFactory;
import lesson21Practice.models.components.item.apparelAndShoes.CustomTshirt;
import lesson21Practice.models.components.item.apparelAndShoes.Shoes;
import lesson21Practice.models.pages.apparelAndShoes.ItemDetailsPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import static lesson20Practice.url.Urls.BASE_URL;

public class ApparelAndShoesTest {
    @Test
    private static void testItemDetailsPage() {
        WebDriver driver = DriverFactory.getChromeDriver();
        driver.get(BASE_URL.concat("blue-and-green-sneaker"));

        ItemDetailsPage apparelAndShoesItemDetailsPage = new ItemDetailsPage(driver);
        CustomTshirt customTshirt = apparelAndShoesItemDetailsPage.apparelAndShoes(CustomTshirt.class);
        customTshirt.inputCustomText("abc");
        customTshirt.getItemName();

        Shoes shoes = apparelAndShoesItemDetailsPage.apparelAndShoes(Shoes.class);
        shoes.selectColor();
        shoes.selectColor();
        shoes.getItemName();
    }
}
