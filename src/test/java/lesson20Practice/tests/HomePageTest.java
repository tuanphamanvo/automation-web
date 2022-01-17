//package lesson20Practice.tests;
//
//import lesson20Practice.driver.DriverFactory;
//import lesson20Practice.models.components.global.DeletedFooter;
//import lesson20Practice.models.components.global.Header;
//import lesson20Practice.models.pages.HomePage;
//import org.openqa.selenium.WebDriver;
//
//import static lesson19Practice.url.Urls.BASE_URL;
//
//public class HomePageTest {
//    private static final String searchTerm = "ABCD";
//    public static void main(String[] args) {
//        WebDriver driver = DriverFactory.getChromeDriver();
//        driver.get(BASE_URL);
//        try {
//            HomePage homePage = new HomePage(driver);
//            Header header = homePage.header();
//            DeletedFooter footer = homePage.footer();
//            System.out.println(footer.footerDisclaimerEle().getText());
//            header.inputSearchKeyword(searchTerm);
//
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            driver.quit();
//        }
//    }
//}
