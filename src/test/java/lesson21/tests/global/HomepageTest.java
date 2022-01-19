package lesson21.tests.global;

import lesson21.driver.DriverFactory;
import lesson21.models.pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import static lesson20Practice.url.Urls.BASE_URL;

public class HomepageTest {

//    @BeforeClass
//    private void beforeSuite(){
//        System.out.println("Before suite");
//    }
//
//    @AfterClass
//    private void afterSuite(){
//        System.out.println("After suite");
//    }
//
//    @BeforeMethod
//    private void beforeMethod(){
//        System.out.println("Before Method");
//    }
//
//    @AfterMethod
//    private void afterMethod(){
//        System.out.println("After Method");
//    }
@BeforeTest
private void beforeTest(){
    System.out.println("BeforeTest");
}

    @Test
    private void testHomePageFooter1() {
        WebDriver driver = DriverFactory.getChromeDriver();
        driver.get(BASE_URL);
        try {
            HomePage homePage = new HomePage(driver);
//            System.out.println(homePage.footer().informationColumnComponent().headerEle().getText());
//            System.out.println(homePage.footer().customerServiceColumnComponent().headerEle().getText());
//            System.out.println(homePage.footer().myAccountColumnComponent().headerEle().getText());
//            System.out.println(homePage.footer().followUsColumnComponent().headerEle().getText());
//            System.out.println(homePage.sideBlocks().categoriesBlockComponent().getListCategories());
            Thread.sleep(3000);
        } catch (Exception ignore) {
            ignore.printStackTrace();
        } finally {
            driver.quit();
        }
    }


    @Test
    private void testHomePageFooter2() {
        WebDriver driver = DriverFactory.getChromeDriver();
        driver.get(BASE_URL);
        try {
            HomePage homePage = new HomePage(driver);
            System.out.println(homePage.footer().informationColumnComponent().headerEle().getText());
            Thread.sleep(3000);
        } catch (Exception ignore) {
            ignore.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
