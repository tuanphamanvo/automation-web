package lesson21.models.components.global.leftPanel;

import lesson20Practice.models.ComponentCssSelector;
import lesson20Practice.models.components.global.leftPanel.LeftPanel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LeftPanelBlockComponent extends LeftPanel {
    private static final By blockTitleSel = By.className("title");
    private static final By linkSel = By.tagName("li");

    public LeftPanelBlockComponent(WebDriver driver, WebElement component) {
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
