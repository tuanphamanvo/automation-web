package lesson19Practice.models.global;

import lesson19Practice.models.Component;
import lesson19Practice.models.ComponentCssSelector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@ComponentCssSelector(value = ".footer")
public class Footer extends Component {
    private static final By footerMenuWrapperSel = By.className("footer-menu-wrapper");
    private static final By columnInformationSel = By.cssSelector("[class='column information']");
    private static final By footerPoweredBySel = By.className("footer-poweredby");
    private static final By footerDisclaimerSel = By.className("footer-disclaimer");


    public Footer(WebDriver driver, WebElement component) {
        super(driver, component);
        this.driver = driver;
    }

    public WebElement footerMenuWrapperEle(){
        return this.component.findElement(footerMenuWrapperSel);
    }

    public WebElement columnInformationEle(){
        return this.component.findElement(columnInformationSel);
    }
    public WebElement footerPoweredByEle(){
        return this.component.findElement(footerPoweredBySel);
    }
    public WebElement footerDisclaimerEle(){
        return this.component.findElement(footerDisclaimerSel);
    }
}
