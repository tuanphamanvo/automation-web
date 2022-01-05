package lesson17.Practice;

import driver.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import url.Urls;

import java.util.List;

public class iFrame implements Urls {

    private static final By mceIFrameSel = By.cssSelector("[id$='ifr']");
    private static final By bodySel = By.tagName("body");
    private static final By pageHeaderSel = By.tagName("h3");

    public static void main(String[] args) {
        WebDriver driver = DriverFactory.getChromeDriver();
        try {
            driver.get(BASE_URl.concat(IFRAME));

            //Identify iframe
            WebElement mceIFrameEle = driver.findElement(mceIFrameSel);

            //Go to iframe then get text and replace text
            driver.switchTo().frame(mceIFrameEle);
            WebElement mceIframeBodyEle = driver.findElement(bodySel);
            System.out.println(mceIframeBodyEle.getText());
            mceIframeBodyEle.clear();
            mceIframeBodyEle.sendKeys("new replaced text");

            //Prove h3 element cannot be found from child iframe
            List<WebElement> h3Elements = driver.findElements(pageHeaderSel);
            System.out.println(h3Elements.isEmpty());

            //Switch back to main frame
            driver.switchTo().parentFrame();
            System.out.println(driver.findElement(pageHeaderSel).getText());

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
