package lesson20Practice.models.components.global.leftPanel;

import lesson20Practice.models.Component;
import lesson20Practice.models.ComponentCssSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@ComponentCssSelector(".master-wrapper-main")
public class LeftPanel extends Component {
    public LeftPanel(WebDriver driver, WebElement component) {
        super(driver, component);
    }

    public CategoriesBlockComponent categoriesBlockComponent(){
        return findComponent(CategoriesBlockComponent.class,driver);
    }

    public ManufacturersBlockComponent manufacturersBlockComponent(){
        return findComponent(ManufacturersBlockComponent.class,driver);
    }


}
