package lesson19;

import driver.DriverFactory;
import lesson18Practice.models.pages.ContactUs;
import lesson18Practice.models.pages.HomePage;
import lesson18Practice.url.Urls;
import models.pages.LoginPage;
import org.openqa.selenium.WebDriver;

public class SubscribeTest implements Urls {
    private static final String email = "0910email@0910email.com";

    public static void main(String[] args) {
        //1st test case will be failed because there is NO News Letter component on HomePage UI
        // testSubscribeInHomePage();
        testSubscribeInContactUsPage();
        testSubscribeInLoginPage();
    }

    private static void testSubscribeInHomePage() {
        WebDriver driver = DriverFactory.getChromeDriver();
        driver.get(BASE_URL);
        HomePage homePage = new HomePage(driver);
        try {
            homePage.newsLetterComponent().inputEmail(email);
            homePage.newsLetterComponent().clickSubscribeBtn();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }

    private static void testSubscribeInContactUsPage() {
        WebDriver driver = DriverFactory.getChromeDriver();
        driver.get(BASE_URL.concat(CONTACT_US));
        ContactUs contactUs = new ContactUs(driver);
        try {
            contactUs.newsLetterComponent().inputEmail(email);
            contactUs.newsLetterComponent().clickSubscribeBtn();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }

    private static void testSubscribeInLoginPage() {
        WebDriver driver = DriverFactory.getChromeDriver();
        driver.get(BASE_URL.concat(LOGIN));
        LoginPage loginPage = new LoginPage(driver);
        try {
            loginPage.newsLetterComponent().inputEmail(email);
            loginPage.newsLetterComponent().clickSubscribeBtn();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
