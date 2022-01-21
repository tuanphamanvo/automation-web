package lesson21Practice.models.components.global.sideBarBlocks;

import lesson21Practice.models.ComponentCssSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@ComponentCssSelector(".block.block-newsletter")
public class NewsLetterBlockComponent extends SideBlockComponent {
    public NewsLetterBlockComponent(WebDriver driver, WebElement component) {
        super(driver, component);
    }
}
