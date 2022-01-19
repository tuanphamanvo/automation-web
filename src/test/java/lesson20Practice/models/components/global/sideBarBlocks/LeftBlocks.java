package lesson20Practice.models.components.global.sideBarBlocks;

import lesson20Practice.models.Component;
import lesson20Practice.models.ComponentCssSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@ComponentCssSelector("div.master-wrapper-main > div")
public class LeftBlocks extends Component {
    public LeftBlocks(WebDriver driver, WebElement component) {
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
