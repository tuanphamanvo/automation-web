package lesson20Practice.models.pages.Computers.Desktops;

import lesson20Practice.models.components.item.computers.ComputerEssential;
import lesson20Practice.models.pages.BasePage;
import org.openqa.selenium.WebDriver;

public class ComputerItemDetailsPage extends BasePage {

    public ComputerItemDetailsPage(WebDriver driver) {
        super(driver);
    }

    public <T extends ComputerEssential> T computerEssential(Class<T> computerEssentialClass){
        return findComponent(computerEssentialClass, driver);
    }
}