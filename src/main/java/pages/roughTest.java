package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.text.SimpleDateFormat;
import java.util.Date;

public class roughTest {


    private WebDriver driver;
    static String driverPath = "C:\\emsAutomation\\src\\main\\resources\\drivers\\";

    public WebDriver getDriver() {
    return driver;
    }

    String appURL = "www.google.com";
    public void setDriver(int browserType) {
        //driver = this.driver;
        switch (browserType) {
            case 1 :
                driver = initChromeDriver(appURL);
                break;
            case 2 :
                driver = initFirefoxDriver(appURL);
                break;
            default:
                System.out.println("browser : " + browserType
                        + " is invalid, Launching Firefox as browser of choice..");
                driver = initFirefoxDriver(appURL);
        }
    }

    private static WebDriver initChromeDriver(String appURL) {
        System.out.println("Launching google chrome with new profile..");
        System.setProperty("webdriver.chrome.driver", driverPath
                + "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to(appURL);
        return driver;
    }

    private static WebDriver initFirefoxDriver(String appURL) {
        System.out.println("Launching Firefox browser..");
        System.setProperty("webdriver.gecko.driver", driverPath + "geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.navigate().to(appURL);
        return driver;


    }

    public static void main(String[] args) {
roughTest mm = new roughTest();
                mm.setDriver(2);




    }
}







