package lesson21Practice.models.components.global.footer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
public class FooterColumnComponent extends Footer {

    private static final By headerSel = By.tagName("h3");
    private static final By linkSel = By.cssSelector("li a");

    public FooterColumnComponent(WebDriver driver, WebElement component){
        super(driver,component);
    }

    public WebElement headerEle(){
        return component.findElement(headerSel);
    }

    public List<WebElement> linkElements(){
        return component.findElements(linkSel);
    }

}
