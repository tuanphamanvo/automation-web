package lesson20Practice.models.components.global.sideBarBlocks;

import lesson19.models.ComponentCssSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@ComponentCssSelector(".block.block-newsletter")
public class NewsLetterBlockComponent extends SideBlockComponent {
    public NewsLetterBlockComponent(WebDriver driver, WebElement component) {
        super(driver, component);
    }
}
