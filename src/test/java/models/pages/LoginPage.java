package models.pages;

import lesson18Practice.models.components.NewsLetter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private final WebDriver driver;
    private static final By userNameSel = By.id("username");
    private static final By passwordSel = By.cssSelector("#password");
    private static final By logInBtnSel = By.tagName("button");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    public NewsLetter newsLetterComponent(){
        return new NewsLetter(this.driver);
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

    public void inputUserName(String userNameVal) {
        userNameEle().sendKeys(userNameVal);
    }

    public void inputPassword(String passwordVal) {
        passwordEle().sendKeys(passwordVal);
    }

    public void clickLoginBtn() {
        loginBtnEle().click();
    }


}
