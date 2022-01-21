package lesson21Practice.tests.testItem;

import lesson21Practice.driver.DriverFactory;
import lesson21Practice.models.components.item.apparelAndShoes.CustomTshirt;
import lesson21Practice.models.components.item.computers.CheapComputer;
import lesson21Practice.models.components.item.computers.StandardComputer;
import lesson21Practice.models.pages.Computers.Desktops.ComputerItemDetailsPage;
import lesson21Practice.models.pages.apparelAndShoes.ItemDetailsPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import static lesson20Practice.url.Urls.BASE_URL;

public class ComputerTest {
    @Test
    private static void testComputerDetailsPage() {
        WebDriver driver = DriverFactory.getChromeDriver();
        driver.get(BASE_URL.concat("build-your-cheap-own-computer"));

        ComputerItemDetailsPage computerItemDetailsPage = new ComputerItemDetailsPage(driver);
        CheapComputer cheapComputer = computerItemDetailsPage.computerEssential(CheapComputer.class);

        cheapComputer.selectProcessorType("abc");
        cheapComputer.selectRAMType("abc");
        StandardComputer standardComputer = computerItemDetailsPage.computerEssential(StandardComputer.class);
        standardComputer.selectRAMType("abc");
        standardComputer.selectProcessorType("abc");

        ItemDetailsPage apparelAndShoesItemDetailsPage = new ItemDetailsPage(driver);
        CustomTshirt customTshirt = apparelAndShoesItemDetailsPage.apparelAndShoes(CustomTshirt.class);
        customTshirt.inputCustomText("abc");
        customTshirt.getItemName();
    }
}
