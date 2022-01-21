package lesson21Practice.tests.global;

import lesson21Practice.driver.DriverFactory;
import lesson21Practice.models.components.global.footer.CustomerServiceColumnComponent;
import lesson21Practice.models.components.global.footer.FollowUsColumnComponent;
import lesson21Practice.models.components.global.footer.InformationColumnComponent;
import lesson21Practice.models.components.global.footer.MyAccountColumnComponent;
import lesson21Practice.models.components.global.sideBarBlocks.CategoriesBlockComponent;
import lesson21Practice.models.components.global.sideBarBlocks.LeftBlocks;
import lesson21Practice.models.components.global.sideBarBlocks.ManufacturersBlockComponent;
import lesson21Practice.models.pages.HomePage;
import lesson21Practice.tests.global.GenericTestFlow;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import static lesson20Practice.url.Urls.BASE_URL;

public class HomepageTest02 {

    @Test
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
