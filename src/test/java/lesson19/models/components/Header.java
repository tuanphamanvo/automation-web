package lesson19.models.components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Header {
    private final WebDriver driver;

    //Declare component scope
    private static final By headerComponentSel = By.className("header");
    private WebElement component;

    private static final By searchInputSel = By.id("small-searchterms");
    private static final By searchBtnSel = By.cssSelector("[type='submit']");

    public Header(WebDriver driver){
        this.driver = driver;
        component = driver.findElement(headerComponentSel);
    }

    public WebElement searchInputEle(){
        return this.component.findElement(searchInputSel);
    }

    public WebElement searchBtnEle(){
        return this.component.findElement(searchBtnSel);
    }

    public void inputSearchTerm(String searchTerm){
        searchInputEle().sendKeys(searchTerm);
    }

    public void clickSearchBtn(){
        searchBtnEle().click();
    }
}
