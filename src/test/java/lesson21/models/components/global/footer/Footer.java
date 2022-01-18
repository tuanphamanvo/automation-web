package lesson21.models.components.global.footer;

import lesson20Practice.models.Component;
import lesson20Practice.models.ComponentCssSelector;
import lesson20Practice.models.components.global.footer.CustomerServiceColumnComponent;
import lesson20Practice.models.components.global.footer.FollowUsColumnComponent;
import lesson20Practice.models.components.global.footer.InformationColumnComponent;
import lesson20Practice.models.components.global.footer.MyAccountColumnComponent;
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