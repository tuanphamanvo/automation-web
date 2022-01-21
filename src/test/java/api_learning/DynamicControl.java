//package api_learning;
//
//import driver.DriverFactory;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//
//import javax.xml.bind.Element;
//import java.util.List;
//
//import static url.Urls.*;
//
//public class DynamicControl {
//    public static void main(String[] args) {
//        WebDriver driver = DriverFactory.getChromeDriver();
//        try{
//            driver.get(BASE_URl.concat(DYNAMIC_CONTROL_PATH));
//
//            //Get list of buttons on the page
//            List<WebElement> btnElementList = driver.findElements(By.cssSelector("button"));
//            System.out.println(btnElementList.size());
//            final WebElement REMOVE_BTN = btnElementList.get(0);
//            final WebElement ENABLE_BTN = btnElementList.get(1);
//            ENABLE_BTN.click();
//            Thread.sleep(2000);
//
//            //To get status of an "expect to not show" action
//            List<WebElement> taolaoElements = driver.findElements(By.className("taolao"));
//            System.out.println(taolaoElements.isEmpty());
//
//
//            //Don't do as below because there is a case there is NO element in List then always TRUE (due to browser never goes into for loop)
//            for(WebElement ele : btnElementList){
//                //Verification points
//            }
//
//            //When take the action on a List of elements, selenium will do the action on List[0] object
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            driver.quit();
//        }
//    }
//}
