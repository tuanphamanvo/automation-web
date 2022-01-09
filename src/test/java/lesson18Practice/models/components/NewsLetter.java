package lesson18Practice.models.components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewsLetter {
    private final WebDriver driver;
    private static WebElement component;
    private static final By newsLetterComponentSel = By.cssSelector("[class='block block-newsletter']");
    private static final By titleSel = By.className("title");
    private static final By descriptionSel = By.id("newsletter-subscribe-block");
    private static final By emailInputSel = By.id("newsletter-email");
    private static final By subscribeBtnSel = By.cssSelector("[type='button'");

    public NewsLetter(WebDriver driver) {
        this.driver = driver;
        component = this.driver.findElement(newsLetterComponentSel);
    }

    public WebElement titleEle(){
        return component.findElement(titleSel);
    }

    public WebElement descriptionEle(){
        return component.findElement(descriptionSel);
    }
    public WebElement emailInputEle(){
        return component.findElement(emailInputSel);
    }
    public WebElement subscribeInputEle(){
        return component.findElement(subscribeBtnSel);
    }

    public void inputEmail(String email){
        emailInputEle().sendKeys(email);
    }
    public void clickSubscribeBtn(){
        subscribeInputEle().click();
    }
}
