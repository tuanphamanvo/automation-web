package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverFactory {
    public static WebDriver getChromeDriver(){
        String chromeDriverLocation;
        String currentProjectLocation = System.getProperty("user.dir");
        chromeDriverLocation = currentProjectLocation.concat("\\src\\chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--incognito");

        System.setProperty("webdriver.chrome.driver", chromeDriverLocation);

        WebDriver driver = new ChromeDriver(chromeOptions);

        return driver;
    }
}
