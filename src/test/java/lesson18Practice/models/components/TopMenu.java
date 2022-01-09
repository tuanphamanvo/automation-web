package lesson18Practice.models.components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TopMenu {
    private final WebDriver driver;
    private WebElement component;
    private static final By topMenuSel = By.className("header-menu");
    private static final By topMenuParentSel = By.tagName("ul");
    private static final By topMenuChildSel = By.linkText("$s");

    public TopMenu(WebDriver driver) {
        this.driver = driver;
        component = this.driver.findElement(topMenuSel);
    }

    public WebElement topMenuParentEle(){
        return this.component.findElement(topMenuParentSel);
    }

}
