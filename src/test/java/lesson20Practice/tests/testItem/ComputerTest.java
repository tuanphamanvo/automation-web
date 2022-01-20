package lesson20Practice.tests.testItem;

import lesson20Practice.driver.DriverFactory;
import lesson20Practice.models.components.item.computers.CheapComputer;
import lesson20Practice.models.components.item.computers.StandardComputer;
import lesson20Practice.models.pages.Computers.Desktops.ComputerItemDetailsPage;
import org.openqa.selenium.WebDriver;

import static lesson20Practice.url.Urls.BASE_URL;

public class ComputerTest {
    public static void main(String[] args) {
        WebDriver driver = DriverFactory.getChromeDriver();
        driver.get(BASE_URL.concat("build-your-cheap-own-computer"));

        ComputerItemDetailsPage computerItemDetailsPage = new ComputerItemDetailsPage(driver);
        CheapComputer cheapComputer = computerItemDetailsPage.computerEssential(CheapComputer.class);

        cheapComputer.selectProcessorType("abc");
        cheapComputer.selectRAMType("abc");
        StandardComputer standardComputer = computerItemDetailsPage.computerEssential(StandardComputer.class);
        standardComputer.selectRAMType("abc");
        standardComputer.selectProcessorType("abc");
    }
}
