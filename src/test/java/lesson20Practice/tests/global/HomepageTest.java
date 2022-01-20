package lesson20Practice.tests.global;

import lesson20Practice.driver.DriverFactory;
import lesson20Practice.models.components.global.sideBarBlocks.LeftBlocks;
import lesson20Practice.models.components.global.footer.*;
import lesson20Practice.models.components.global.sideBarBlocks.CategoriesBlockComponent;
import lesson20Practice.models.components.global.sideBarBlocks.ManufacturersBlockComponent;
import lesson20Practice.models.pages.HomePage;
import org.openqa.selenium.WebDriver;

import static lesson20Practice.url.Urls.BASE_URL;

public class HomepageTest {
    public static void main(String[] args) {
        testHomePageSideBlock();
    }
    private static void testHomePageSideBlock() {
        WebDriver driver = DriverFactory.getChromeDriver();
        driver.get(BASE_URL);
        try {
            HomePage homePage = new HomePage(driver);
            InformationColumnComponent informationColumnComponent = homePage.footer().informationColumnComponent();
            FollowUsColumnComponent followUsColumnComponent = homePage.footer().followUsColumnComponent();
            MyAccountColumnComponent myAccountColumnComponent = homePage.footer().myAccountColumnComponent();
            CustomerServiceColumnComponent customerServiceColumnComponent = homePage.footer().customerServiceColumnComponent();
            GenericTestFlow genericTestFlow = new GenericTestFlow(driver);
            genericTestFlow.testFooterColumns(informationColumnComponent);
            genericTestFlow.testFooterColumns(followUsColumnComponent);
            genericTestFlow.testFooterColumns(myAccountColumnComponent);
            genericTestFlow.testFooterColumns(customerServiceColumnComponent);

            LeftBlocks leftBlocks = homePage.leftBlocks();
            CategoriesBlockComponent categoriesBlockComponent = leftBlocks.categoriesBlockComponent();
            ManufacturersBlockComponent manufacturersBlockComponent = leftBlocks.manufacturersBlockComponent();
            GenericTestFlow genericTestFlow1 = new GenericTestFlow(driver);
            genericTestFlow1.testSideBlocks(categoriesBlockComponent);
            genericTestFlow1.testSideBlocks(manufacturersBlockComponent);
        } catch (Exception ignore) {
            ignore.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
