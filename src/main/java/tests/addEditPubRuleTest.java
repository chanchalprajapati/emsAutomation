package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.addEditPublisherRule;
import pages.publisherList;

import java.io.IOException;

/**
 * Created by chanchal.k on 03-09-2018.
 */
public class addEditPubRuleTest extends webdriverInit{

    @Test(priority = 0)
    public void providerMapping() throws InterruptedException, IOException {

        //*************PAGE INSTANTIATIONS*************
        publisherList homePage = new publisherList(driver, wait);


        //*************PAGE METHODS********************
        //Open Publisher List page
        homePage.goToPublisherListPage();
        Thread.sleep(6000);

        pages.addEditPublisherRule pg = new addEditPublisherRule(driver, wait);

        pg.addeditpub();
        Thread.sleep(30000);


        String ActualText = driver.findElement(By.xpath("//span[contains(text(),'Sonobi*')]")).getText();
        String ExpectedText = "Sonobi*1";
        SoftAssert softAssertion = new SoftAssert();



        softAssertion.assertEquals(ExpectedText, ActualText);
        softAssertion.assertAll();
    }
}
