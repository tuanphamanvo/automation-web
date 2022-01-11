package models.components;

import lesson19.models.Component;
import lesson19.models.ComponentCssSelector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@ComponentCssSelector(value = ".header")
public class HeaderComponent extends Component {
    private final WebDriver driver;
    private static final By searchInputSel = By.cssSelector("form input");
    private static final By searchBtnSel = By.cssSelector(".search-box-button");


    public HeaderComponent(WebDriver driver, WebElement element) {
        super(driver, element);
        this.driver = driver;
    }

    public WebElement searchInputEle(){
        return this.component.findElement(searchInputSel);
    }
    public WebElement searchBtnEle(){
        return this.component.findElement(searchBtnSel);
    }
}
