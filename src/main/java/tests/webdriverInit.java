package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class webdriverInit {

    public WebDriver driver;
    public WebDriverWait wait;


    @BeforeTest
        public void setup () {
        System.setProperty("webdriver.chrome.driver", "C:\\emsAutomation\\src\\main\\resources\\drivers\\chromedriver.exe");

        //Create a Chrome driver. All test and page classes use this driver.
        driver = new ChromeDriver();

        //Create a wait. All test and page classes use this wait.
        wait = new WebDriverWait(driver,20);

        //Maximize Window
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
    }

   // @AfterTest
    public void teardown () {
        driver.quit();
    }
}
