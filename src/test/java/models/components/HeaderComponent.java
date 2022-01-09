package models.components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HeaderComponent {
    private final WebDriver driver;
    private WebElement component;
    private static final By componentSel = By.className("header");
    private static final By searchpInputSel = By.cssSelector("form input");
    private static final By searchpBtnSel = By.cssSelector(".search-box-button");


    public HeaderComponent(WebDriver driver) {
        this.driver = driver;
        component = driver.findElement(componentSel);
    }

    public WebElement searchInputEle(){
        return this.driver.findElement(searchpInputSel);
    }
    public WebElement searchBtnEle(){
        return this.driver.findElement(searchpBtnSel);
    }
}
