package lesson21Practice.models.components.item.computers;

import lesson21Practice.models.ComponentCssSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@ComponentCssSelector(".product-essential")
public class CheapComputer extends ComputerEssential {
    public CheapComputer(WebDriver driver, WebElement component) {
        super(driver, component);
    }

    @Override
    public void selectProcessorType(String processor) {
        System.out.println("selectProcessorType | CheapComputer");
    }

    @Override
    public void selectRAMType(String RAM) {
        System.out.println("selectRAMType | CheapComputer");
    }
}
