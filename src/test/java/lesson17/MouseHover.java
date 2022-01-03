package lesson17;

import driver.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import url.Urls;

import java.util.ArrayList;
import java.util.List;

public class MouseHover {

    private static final By figureSel = By.className("figure");
    private static final By imageSel = By.tagName("img");
    private static final By nameSel = By.tagName("h5");
    private static final By ImgLinkSel = By.tagName("a");

    public static void main(String[] args) {
        WebDriver driver = DriverFactory.getChromeDriver();
        try {
            driver.get(Urls.BASE_URl.concat(Urls.HOVER));
            List<WebElement> userElements = driver.findElements(figureSel);
            List<FigureData> figureDataList = new ArrayList<>();
//            WebElement user1FigureEle = userElements.get(0);
//            WebElement user2FigureEle = userElements.get(1);
//            WebElement user3FigureEle = userElements.get(2);


            //Declare Actions
            Actions actions = new Actions(driver);

            //Verification
            if (userElements.isEmpty())
                throw new RuntimeException("[ERR] There is NO user on the page");

            else {
                for(WebElement userEle: userElements){
                    actions.moveToElement(userEle).perform(); //Hover to see image/link/name

                    WebElement userImageEle = userEle.findElement(imageSel);
                    WebElement userNameEle = userEle.findElement(nameSel);
                    WebElement userImgLinkEle = userEle.findElement(ImgLinkSel);

                    String userImgSrc = userImageEle.getAttribute("src");
                    String userNameTxt = userNameEle.getText();
                    String userImgLink = userImgLinkEle.getAttribute("href");
                    FigureData figureData = new FigureData(userImgSrc, userNameTxt, userImgLink);
                    figureDataList.add(figureData);
                }
            }
            figureDataList.forEach(System.out::println);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.close();
        }
    }
    public static class FigureData {
        private String imgSource;
        private String name;
        private String link;

        public FigureData(String imgSource, String name, String link) {
            this.imgSource = imgSource;
            this.name = name;
            this.link = link;
        }

        public String getImgSource() {
            return imgSource;
        }

        public void setImgSource(String imgSource) {
            this.imgSource = imgSource;
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
            return "FigureData{" +
                    "imgSource='" + imgSource + '\'' +
                    ", name='" + name + '\'' +
                    ", link='" + link + '\'' +
                    '}';
        }
    }
}
