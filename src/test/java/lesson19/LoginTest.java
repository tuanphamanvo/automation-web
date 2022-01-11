package lesson19;

import lesson18Practice.driver.DriverFactory;
import lesson18Practice.models.pages.LoginPageChain;
import lesson18Practice.models.pages.LoginPageTraditionalDeclare;
import lesson18Practice.url.Urls;
import org.openqa.selenium.WebDriver;

public class LoginTest implements Urls {
    private static final String userName = "0910email@0910email.com";
    private static final String password = "123123123";

    public static void main(String[] args) {
        testLoginPageByTraditionalDeclare();
        testLoginPageByChain();

    }

    private static void testLoginPageByChain() {
        WebDriver driver = DriverFactory.getChromeDriver();
        driver.get(BASE_URL.concat(LOGIN));
        LoginPageChain loginPage = new LoginPageChain(driver);
        try {
            loginPage
                    .inputEmail(userName)
                    .inputPassword(password)
                    .clickLoginBtn();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }

    private static void testLoginPageByTraditionalDeclare(){
        WebDriver driver = DriverFactory.getChromeDriver();
        driver.get(BASE_URL.concat(LOGIN));
        LoginPageTraditionalDeclare loginPage = new LoginPageTraditionalDeclare(driver);
        try {
            loginPage.inputUserName(userName);
            loginPage.inputPassword(password);
            loginPage.clickLoginBtn();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
