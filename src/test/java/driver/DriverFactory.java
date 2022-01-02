package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class DriverFactory {
    public static WebDriver getChromeDriver(){
        String chromeDriverLocation;
        String currentProjectLocation = System.getProperty("user.dir");
        chromeDriverLocation = currentProjectLocation.concat("\\src\\chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--incognito");

        System.setProperty("webdriver.chrome.driver", chromeDriverLocation);

        WebDriver driver = new ChromeDriver(chromeOptions);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  //Khi đi tìm element, tối đa đợi 10s, mỗi 500 milliseconds sẽ kiểm tra 1 lần cho đến khi hết 10s
        //Explicit wait là "chờ đến khi nào"

        return driver;
    }
}
