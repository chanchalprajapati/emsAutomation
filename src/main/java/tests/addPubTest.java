package tests;

import org.testng.annotations.Test;
import pages.regesterPublisher;
import pages.publisherList;
public class addPubTest extends webdriverInit {


    @Test (priority = 0)
    public void RegisterNewPublisher () throws InterruptedException {

        //*************PAGE INSTANTIATIONS*************
        publisherList homePage = new publisherList(driver,wait);



        //*************PAGE METHODS********************
        //Open Publisher List page
        homePage.goToPublisherListPage();
        Thread.sleep(6000);


        //Go to Register Pub page

        homePage.goToAddPublisherPage();

        //Add New Pub
        regesterPublisher newUser = new regesterPublisher(driver,wait);

        newUser.addNewPublisher("HB", "Autotest1", "AutotestdisName", "Aj", "kk", "autotest1@autotest.mm", "Header Bidder", "Test User", "Test User" );

        //*************ASSERTIONS***********************
       // Thread.sleep(500);
        //loginPage.verifyLoginPassword(("E-posta adresiniz veya şifreniz hatalı"));
    }

}
