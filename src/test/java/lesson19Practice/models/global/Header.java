package lesson19Practice.models.global;

import lesson19Practice.models.Component;
import lesson19Practice.models.ComponentCssSelector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@ComponentCssSelector(value = ".header")
public class Header extends Component {
    private static final By searchInputSel = By.id("small-searchterms");
    private static final By searchBtnSel = By.cssSelector("[type='submit'");

    public Header(WebDriver driver, WebElement component) {
        super(driver, component);
        this.driver = driver;
    }

    public WebElement searchInputEle() {
        return this.component.findElement(searchInputSel);
    }

    public WebElement searchBtnEle() {
        return this.component.findElement(searchBtnSel);
    }

    public void clickSearchBtn() {
        searchBtnEle().click();
    }

    public void inputSearchKeyword(String keyword) {
        searchInputEle().sendKeys(keyword);
    }
}
