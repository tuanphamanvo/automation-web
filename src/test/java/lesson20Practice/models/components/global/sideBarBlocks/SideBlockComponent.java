package lesson20Practice.models.components.global.sideBarBlocks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SideBlockComponent extends LeftBlocks {
    private static final By blockTitleSel = By.className("title");
    private static final By linkSel = By.cssSelector("li a");

    public SideBlockComponent(WebDriver driver, WebElement component) {
        super(driver, component);
    }
    public WebElement headerEle(){
        return component.findElement(blockTitleSel);
    }

    public List<WebElement> linkElements(){
        return component.findElements(linkSel);
    }
    public String getBlockHeaderText(){
        return headerEle().getText();
    }
}
