package lesson20Practice.tests.global;

import lesson20Practice.driver.DriverFactory;
import lesson20Practice.models.pages.HomePage;
import org.openqa.selenium.WebDriver;

import static lesson20Practice.url.Urls.BASE_URL;

public class HomepageTest {
    public static void main(String[] args) {
        testHomePageFooter();
    }
    private static void testHomePageFooter() {
        WebDriver driver = DriverFactory.getChromeDriver();
        driver.get(BASE_URL);
        try {
            HomePage homePage = new HomePage(driver);
            System.out.println(homePage.footer().informationColumnComponent().headerEle().getText());
            System.out.println(homePage.footer().customerServiceColumnComponent().headerEle().getText());
            System.out.println(homePage.footer().myAccountColumnComponent().headerEle().getText());
            System.out.println(homePage.footer().followUsColumnComponent().headerEle().getText());
            Thread.sleep(3000);
        } catch (Exception ignore) {
            ignore.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
