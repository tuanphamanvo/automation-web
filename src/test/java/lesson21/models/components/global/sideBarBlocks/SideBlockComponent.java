package lesson21.models.components.global.sideBarBlocks;

import lesson21.models.components.global.MasterContent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SideBlockComponent extends MasterContent {
    private static final By blockTitleSel = By.className("title");
    private static final By linkSel = By.tagName("li");

    public SideBlockComponent(WebDriver driver, WebElement component) {
        super(driver, component);
    }
    public WebElement headerEle(){
        return component.findElement(blockTitleSel);
    }

    public List<WebElement> getLinks(){
        return component.findElements(linkSel);
    }
    public String getBlockHeaderText(){
        return headerEle().getText();
    }
}
