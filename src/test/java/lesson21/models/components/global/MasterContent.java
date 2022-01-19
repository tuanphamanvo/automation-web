package lesson21.models.components.global;

import lesson21.models.Component;
import lesson21.models.ComponentCssSelector;
import lesson21.models.components.global.sideBarBlocks.CategoriesBlockComponent;
import lesson21.models.components.global.sideBarBlocks.ManufacturersBlockComponent;
import lesson21.models.components.global.sideBarBlocks.NewsLetterBlockComponent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@ComponentCssSelector(".master-wrapper-main")
public class MasterContent extends Component {
    public MasterContent(WebDriver driver, WebElement component) {
        super(driver, component);
    }

    public CategoriesBlockComponent categoriesBlockComponent(){
        return findComponent(CategoriesBlockComponent.class,driver);
    }

    public ManufacturersBlockComponent manufacturersBlockComponent(){
        return findComponent(ManufacturersBlockComponent.class,driver);
    }

    public NewsLetterBlockComponent newsLetterBlockComponent(){
        return findComponent(NewsLetterBlockComponent.class,driver);
    }


}
