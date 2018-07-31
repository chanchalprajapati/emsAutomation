package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class roughTest {
    public static void main(String[] args) {


        String  addPubBtn = "//a[@class='btn btn-red btn-main btn-sm']";
        roughTest dd = new roughTest();
        dd.click(addPubBtn);

    }
     public  void click(String xpathString) {
        System.setProperty("webdriver.chrome.driver", "C:\\emsAutomation\\src\\main\\resources\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
         driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("http://stage.hb.reports.mn:83/publishermanagement/#/8PRL4E7N3/Header%20Bidder%20/list");
        driver.findElement(By.xpath(xpathString)).click();
    }









}
