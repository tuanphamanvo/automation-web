package lesson20Practice.models.components.item.computers;

import lesson20Practice.models.components.item.BaseItemDetails;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public abstract class ComputerEssential extends BaseItemDetails {

    public ComputerEssential(WebDriver driver, WebElement component) {
        super(driver, component);
    }

    public abstract void selectProcessorType(String type);
    public abstract void selectRAMType(String type);
}
