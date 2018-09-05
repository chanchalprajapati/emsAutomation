package tests;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.*;
import uitilities.genric;

import java.io.File;
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
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        return driver;
    }

    private static WebDriver initFirefoxDriver() {
        System.out.println("Launching Firefox browser..");
        System.setProperty("webdriver.gecko.driver", driverPath + "geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        return driver;


    }


    @BeforeMethod
        public void setup () {

        setDriver(1);




    }




   @AfterMethod
    public void teardown (ITestResult result) {


            if (ITestResult.FAILURE == result.getStatus()){
                try {
                    TakesScreenshot screenshot = (TakesScreenshot)driver;
                    File src = screenshot.getScreenshotAs(OutputType.FILE);
                    FileUtils.copyFile(src, new File("C:\\emsAutomation\\src\\main\\resources\\Screenshoots\\"+ genric.getCurrentDateTime()+".png"));
                    System.out.println("Successfully captured the screenshot");
                }
                catch (Exception e){
                    System.out.println("Exception while taking screenshot "+e.getMessage());
                }
            }
        driver.quit();
        }


    }

