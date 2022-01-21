package lesson21Practice.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverFactory {
    public static WebDriver getChromeDriver(){
        String chromeDriverPath = System.getProperty("user.dir").concat("\\src\\test\\java\\lesson19Practice\\driver\\chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--incognito");
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        WebDriver driver = new ChromeDriver(chromeOptions);
        return driver;
    }
}
