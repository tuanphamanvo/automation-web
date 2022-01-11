package lesson19Practice.tests;

import lesson19Practice.driver.DriverFactory;
import lesson19Practice.models.global.Footer;
import lesson19Practice.models.global.Header;
import lesson19Practice.models.pages.HomePage;
import org.openqa.selenium.WebDriver;

import static lesson19Practice.url.Urls.BASE_URL;

public class HomePageTest {
    private static final String searchTerm = "ABCD";
    public static void main(String[] args) {
        WebDriver driver = DriverFactory.getChromeDriver();
        driver.get(BASE_URL);
        try {
            HomePage homePage = new HomePage(driver);
            Header header = homePage.header();
            Footer footer = homePage.footer();
            System.out.println(footer.footerDisclaimerEle().getText());
            header.inputSearchKeyword(searchTerm);


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
