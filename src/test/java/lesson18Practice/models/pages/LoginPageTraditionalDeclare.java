package lesson18Practice.models.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageTraditionalDeclare {
    private final WebDriver driver;
    private final By emailInputSel = By.id("Email");
    private final By passwordInputSel = By.id("Password");
    private final By loginBtnSel = By.cssSelector("[type='submit']");

    public LoginPageTraditionalDeclare(WebDriver driver) {
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

    public void inputUserName(String userNameVal){
        this.emailInputEle().sendKeys(userNameVal);
        //0910email@0910email.com
    }

    public void inputPassword(String passwordVal){
        this.passwordInputEle().sendKeys(passwordVal);
        //123123123
    }
    public void clickLoginBtn(){
        this.loginBtnEle().click();
    }

}
