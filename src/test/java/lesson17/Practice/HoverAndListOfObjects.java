package lesson17.Practice;

import driver.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import url.Urls;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Random;

public class HoverAndListOfObjects implements Urls {
    private static final By objectSel = By.className("figure");
    private static final By objectNameSel = By.tagName("h5");
    private static final By objectLinkSel = By.tagName("a");

    public static void main(String[] args) {
        WebDriver driver = DriverFactory.getChromeDriver();
        Actions actions = new Actions(driver);
        List<ObjectData> objectData = new ArrayList<>();

        try {
            driver.get(BASE_URl.concat(HOVER));
            List<WebElement> objectElements = driver.findElements(objectSel);
            if (!objectElements.isEmpty()) {
                for (WebElement object : objectElements) {
                    actions.moveToElement(object).perform();
                    String nameVal = object.findElement(objectNameSel).getText().replace("name: ", "");
                    String linkVal = object.findElement(objectLinkSel).getAttribute("href");
                    if (!linkVal.startsWith(BASE_URl)) {
                        throw new RuntimeException("ERR: The URL is NOT started with BASE_URL");
                    } else {
                        ObjectData user = new ObjectData(nameVal, linkVal);
                        objectData.add(user);
                    }
                }
                System.out.println(objectData);
                Random rand = new Random();
                int randomUser = rand.nextInt(objectElements.size()+1);
                actions.moveToElement(objectElements.get(randomUser)).perform();
                objectElements.get(randomUser).findElement(objectLinkSel).click();
                String a = driver.getCurrentUrl();
                String b = "https://the-internet.herokuapp.com/users/".concat(Integer.toString(randomUser+1));
                if (!a.equals(b)) {
                    throw new RuntimeException("ERR: Incorrect URL format");
                }

            }


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }

    public static class ObjectData {
        private String name;
        private String link;

        public ObjectData(String name, String link) {
            this.name = name;
            this.link = link;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getLink() {
            return link;
        }

        public void setLink(String link) {
            this.link = link;
        }

        @Override
        public String toString() {
            return "ObjectData{" +
                    "name='" + name + '\'' +
                    ", link='" + link + '\'' +
                    '}';
        }
    }
}
