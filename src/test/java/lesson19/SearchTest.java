package lesson19;

import driver.DriverFactory;
import lesson18Practice.models.pages.ContactUs;
import lesson18Practice.models.pages.HomePage;
import lesson18Practice.url.Urls;
import org.openqa.selenium.WebDriver;


public class SearchTest implements Urls {
    public static void main(String[] args) {
        testSearchInHomePage();
        testSearchInContactUsPage();
    }

    private static void testSearchInContactUsPage() {
        WebDriver driver = DriverFactory.getChromeDriver();
        driver.get(BASE_URL.concat(CONTACT_US));
        ContactUs contactUs = new ContactUs(driver);
        try {
            contactUs.headerComponent().inputSearchTerm("computer");
            contactUs.headerComponent().clickSearchBtn();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }

    private static void testSearchInHomePage() {
        WebDriver driver = DriverFactory.getChromeDriver();
        driver.get(BASE_URL);
        HomePage homePage = new HomePage(driver);
        try {
            homePage.headerComponent().inputSearchTerm("laptop");
            homePage.headerComponent().clickSearchBtn();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
