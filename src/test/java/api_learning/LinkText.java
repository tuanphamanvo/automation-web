package api_learning;

import driver.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LinkText {
    public static void main(String[] args) {
        WebDriver driver = DriverFactory.getChromeDriver();

        try{driver.get("https://the-internet.herokuapp.com/login");
            WebElement powerByLinkText = driver.findElement(By.linkText("Elemental Selenium"));
            System.out.println(powerByLinkText.getText());
            System.out.println(powerByLinkText.getAttribute("href"));

            WebElement textGetByPartialLinkText = driver.findElement(By.partialLinkText("Elem"));
            System.out.println(textGetByPartialLinkText.getText());
            String link = powerByLinkText.getAttribute("href");
            String text = powerByLinkText.getText();
            HyperLink hyperLink = new HyperLink(text,link);
            System.out.println(hyperLink.text);
            System.out.println(hyperLink.link);

        }
        finally {driver.quit();};
    }
    public static class HyperLink{
        private String link;
        private String text;

        public HyperLink(String text, String link) {
        }

        public String getLink() {
            return link;
        }

        public void setLink(String link) {
            this.link = link;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }
    }
}
