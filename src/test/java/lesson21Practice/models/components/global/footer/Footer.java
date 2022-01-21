package lesson21Practice.models.components.global.footer;

import lesson21Practice.models.Component;
import lesson21Practice.models.ComponentCssSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@ComponentCssSelector(".footer")
public class Footer extends Component {

    public Footer(WebDriver driver, WebElement component) {
        super(driver, component);
    }

    public InformationColumnComponent informationColumnComponent(){
        return findComponent(InformationColumnComponent.class,driver);
    }

    public CustomerServiceColumnComponent customerServiceColumnComponent(){
        return findComponent(CustomerServiceColumnComponent.class, driver);
    }
    public MyAccountColumnComponent myAccountColumnComponent(){
        return findComponent(MyAccountColumnComponent.class, driver);
    }
    public FollowUsColumnComponent followUsColumnComponent(){
        return findComponent(FollowUsColumnComponent.class,driver);
    }
}
