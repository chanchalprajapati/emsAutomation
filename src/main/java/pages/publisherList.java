package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

/**
 * Created by chanchal.k on 30-07-2018.
 */
public class publisherList extends basePage {

    public publisherList(WebDriver driver, WebDriverWait wait){
        super(driver,wait);
    }
    String baseurl="http://stage.hb.reports.mn:83/publishermanagement/#/8PRL4E7N3/Header%20Bidder/list";
    String addPubBtn = "//a[@class='btn btn-red btn-main btn-sm']";
   // WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='btn btn-red btn-main btn-sm']")));

    public void goToPublisherListPage(){

        driver.get(baseurl);
        Reporter.log("Application Lauched successfully | ");

    }
    public void goToAddPublisherPage() throws InterruptedException {
        click(By.xpath(addPubBtn));

    }
}
