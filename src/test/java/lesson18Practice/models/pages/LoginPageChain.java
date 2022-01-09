package lesson18Practice.models.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageChain {
    private final WebDriver driver;
    private final By emailInputSel = By.id("Email");
    private final By passwordInputSel = By.id("Password");
    private final By loginBtnSel = By.cssSelector("[type='submit']");

    public LoginPageChain(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement emailInputEle(){
        return this.driver.findElement(emailInputSel);
    }

    public WebElement passwordInputEle(){
        return this.driver.findElement(passwordInputSel);
    }

    public WebElement loginBtnEle(){
        return this.driver.findElement(loginBtnSel);
    }

    public LoginPageChain inputEmail(String userName){
        emailInputEle().sendKeys(userName);
        return this;
    }

    public LoginPageChain inputPassword(String password){
        passwordInputEle().sendKeys(password);
        return this;
    }

    public void clickLoginBtn(){
        loginBtnEle().click();
    }
}
