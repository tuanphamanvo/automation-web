package lesson20Practice.tests.global;

import lesson20Practice.models.components.global.footer.FooterColumnComponent;
import lesson20Practice.models.components.global.sideBarBlocks.SideBlockComponent;
import org.openqa.selenium.WebDriver;

public class GenericTestFlow {
    private WebDriver driver;

    public GenericTestFlow(WebDriver driver) {
        this.driver = driver;
    }

    public void testFooterColumns(FooterColumnComponent footerColumnComponent){
        if(!footerColumnComponent.linkElements().isEmpty()){
            footerColumnComponent.linkElements().forEach(link -> {
                System.out.print(link.getText() + "|");
                System.out.println(link.getAttribute("href"));
            });
        }
    }
    public void testSideBlocks(SideBlockComponent sideBlockComponent){
        if(!sideBlockComponent.linkElements().isEmpty()){
            sideBlockComponent.linkElements().forEach(link -> {
            System.out.print(link.getText() + "|");
            System.out.println(link.getAttribute("href"));
        });}
    }
}
