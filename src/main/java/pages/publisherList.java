package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import uitilities.genric;

import java.io.IOException;

/**
 * Created by chanchal.k on 30-07-2018.
 */
public class publisherList extends basePage {

    public publisherList(WebDriver driver, WebDriverWait wait) throws IOException {
        super(driver,wait);
    }
    String baseurl=genric.readExcel(0, 0, 1);
    String addPubBtn = genric.readExcel(0,4,1);
   // WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='btn btn-red btn-main btn-sm']")));

    public void goToPublisherListPage(){

        driver.get(baseurl);
        Reporter.log("Application Lauched successfully | ", true);

    }
    public void goToAddPublisherPage() throws InterruptedException {
        click(By.xpath(addPubBtn));

    }
}
