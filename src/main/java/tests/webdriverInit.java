package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class webdriverInit {





    WebDriver driver;
    static String driverPath = "C:\\emsAutomation\\src\\main\\resources\\drivers\\";

    public WebDriver getDriver() {
        return driver;
    }
    WebDriverWait wait;



    public void setDriver(int browserType) {

        switch (browserType) {
            case 1 :
                driver = initChromeDriver();
                break;
            case 2 :
                driver = initFirefoxDriver();
                break;
            default:
                System.out.println("browser : " + browserType
                        + " is invalid, Launching Firefox as browser of choice..");
                driver = initFirefoxDriver();
        }
    }

    private static WebDriver initChromeDriver() {
        System.out.println("Launching google chrome with new profile..");
        System.setProperty("webdriver.chrome.driver", driverPath
                + "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        return driver;
    }

    private static WebDriver initFirefoxDriver() {
        System.out.println("Launching Firefox browser..");
        System.setProperty("webdriver.gecko.driver", driverPath + "geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();

        return driver;


    }


    @BeforeTest
        public void setup () {

        setDriver(1);



    }




    @AfterTest
    public void teardown () {
        driver.quit();
    }
}
