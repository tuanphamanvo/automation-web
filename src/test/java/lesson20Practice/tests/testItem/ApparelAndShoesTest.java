package lesson20Practice.tests.testItem;

import lesson20Practice.driver.DriverFactory;
import lesson20Practice.models.components.item.apparelAndShoes.CustomTshirt;
import lesson20Practice.models.pages.apparelAndShoes.ItemDetailsPage;
import org.openqa.selenium.WebDriver;

import static lesson20Practice.url.Urls.BASE_URL;

public class ApparelAndShoesTest {
    public static void main(String[] args) {
        WebDriver driver = DriverFactory.getChromeDriver();
        driver.get(BASE_URL.concat("blue-and-green-sneaker"));

        ItemDetailsPage itemDetailsPage = new ItemDetailsPage(driver);
        CustomTshirt customTshirt = new CustomTshirt(driver);


    }
}
