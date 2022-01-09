package lesson18;

import driver.DriverFactory;
import models.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import url.Urls;

public class LoginTest implements Urls {

    public static void main(String[] args) {
        testLoginPageWithReturnedSel();
        testLoginPageWithReturnedInteractionMethods();
    }

    public static void testLoginPageWithReturnedSel() {
        WebDriver driver = DriverFactory.getChromeDriver();
        driver.get(BASE_URl.concat(LOGIN_PATH));
        LoginPage loginPage = new LoginPage(driver);
        try {
            loginPage.userNameEle().sendKeys("teo");
            loginPage.passwordEle().sendKeys("passwordTeo");
            Thread.sleep(3000);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }

    public static void testLoginPageWithReturnedInteractionMethods() {
        WebDriver driver = DriverFactory.getChromeDriver();
        driver.get(BASE_URl.concat(LOGIN_PATH));
        LoginPage loginPage = new LoginPage(driver);
        try {
            loginPage.inputUserName("teo");
            loginPage.inputPassword("teoPassword");
            loginPage.clickLoginBtn();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }

}
