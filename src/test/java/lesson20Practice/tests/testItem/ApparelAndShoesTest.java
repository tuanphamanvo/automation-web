package lesson20Practice.tests.testItem;

import lesson20Practice.driver.DriverFactory;
import lesson20Practice.models.components.item.apparelAndShoes.CustomTshirt;
import lesson20Practice.models.components.item.apparelAndShoes.Shoes;
import lesson20Practice.models.components.item.computers.CheapComputer;
import lesson20Practice.models.components.item.computers.StandardComputer;
import lesson20Practice.models.pages.Computers.Desktops.ComputerItemDetailsPage;
import lesson20Practice.models.pages.apparelAndShoes.ItemDetailsPage;
import org.openqa.selenium.WebDriver;

import static lesson20Practice.url.Urls.BASE_URL;

public class ApparelAndShoesTest {
    public static void main(String[] args) {
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
