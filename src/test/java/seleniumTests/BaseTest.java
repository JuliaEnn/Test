package seleniumTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.Remote;

public class BaseTest {

    WebDriver driver;

    @BeforeTest
    public void  beforeT() {
        System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
        ChromeOptions op = new ChromeOptions();
        //op.addArguments("user-agent=\"Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/99.0.4844.51 Safari/537.36\"");
//        DesiredCapabilities dc = DesiredCapabilities.chrome();
//        dc.setCapability(ChromeOptions.CAPABILITY, op);
//        driver = new ChromeDriver();

        URL hub = null;

        try {
            hub = new URL("http://localhost:4444/wd/hub");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        driver = new RemoteWebDriver(hub, op);

    }

    @AfterTest
    public void afterTest() {
        driver.quit();
        if(driver != null) {
            driver.quit();
        }
    }

    public WebDriver getDriver() {
        return driver;
    }

}
