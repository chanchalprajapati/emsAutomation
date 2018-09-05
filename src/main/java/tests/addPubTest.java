package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;
import pages.addEditPublisherRule;
import pages.regesterPublisher;
import pages.publisherList;
import uitilities.genric;

import java.io.IOException;

import static org.testng.Assert.*;

public class addPubTest extends webdriverInit {


    @Test (priority = 0)
    public void RegisterNewPublisher () throws InterruptedException, IOException {

        //*************PAGE INSTANTIATIONS*************
        publisherList homePage = new publisherList(driver,wait);



        //*************PAGE METHODS********************
        //Open Publisher List page
        homePage.goToPublisherListPage();
        Thread.sleep(6000);


        //Go to Register Pub page

        homePage.goToAddPublisherPage();
        Thread.sleep(6000);

        //Add New Pub
        regesterPublisher newUser = new regesterPublisher(driver,wait);


        newUser.addNewPublisher();

        //*************ASSERTIONS***********************
        Thread.sleep(20000);
        String ActualText = driver.findElement(By.xpath("//h4[contains(text(),'Configuration')]")).getText();
        String ExpectedText = "Configuration";
        SoftAssert softAssertion = new SoftAssert();

        softAssertion.assertEquals(ExpectedText, ActualText);
        Reporter.log("Application Lauched successfully | ");
           System.out.print("done...............");

        addEditPublisherRule addpro = new addEditPublisherRule(driver, wait);
        Thread.sleep(40000);

        addpro.addeditpub();






    }



}
