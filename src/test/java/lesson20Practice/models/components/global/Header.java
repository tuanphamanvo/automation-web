package lesson20Practice.models.components.global;

import lesson20Practice.models.Component;
import lesson20Practice.models.ComponentCssSelector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@ComponentCssSelector(value = ".header")
public class Header extends Component {
    private static final By searchInputSel = By.id("small-searchterms");
    private static final By searchBtnSel = By.cssSelector("[type='submit'");
    private static final By allLinksSel = By.tagName("a");

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
    public int allLinksNumber(){
        return this.component.findElements(allLinksSel).size();
    }

}
