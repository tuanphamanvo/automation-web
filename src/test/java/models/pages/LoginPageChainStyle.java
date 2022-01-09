package models.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageChainStyle {

    private final WebDriver driver;
    private static final By userNameSel = By.id("username");
    private static final By passwordSel = By.cssSelector("#password");
    private static final By logInBtnSel = By.tagName("button");

    public LoginPageChainStyle(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement userNameEle() {
        return this.driver.findElement(userNameSel);
    }

    public WebElement passwordEle() {
        return this.driver.findElement(passwordSel);
    }

    public WebElement loginBtnEle() {
        return this.driver.findElement(logInBtnSel);
    }

    public  void inputUserName(String userNameVal){
        userNameEle().sendKeys(userNameVal);
    }

    public void inputPassword(String passwordVal){
        passwordEle().sendKeys(passwordVal);
    }
    public void clickLoginBtn(){
        loginBtnEle().click();
    }

}
