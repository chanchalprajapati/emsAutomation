package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import uitilities.genric;

import java.io.IOException;

public class regesterPublisher extends basePage {

    public regesterPublisher(WebDriver driver, WebDriverWait wait) throws IOException {

        super(driver, wait);

    }

    String selectPartner = genric.readExcel(0,12,1);
    String Par = genric.readExcel(0,13,1);
    String companyName = genric.readExcel(0,14,1);
    //String companyName= "#bodyContainer > div.ng-scope > div:nth-child(3) > div > div > ul > li:nth-child(3) > div > input";
    String dsplayName = genric.readExcel(0,15,1);
    String FirstName = genric.readExcel(0,16,1);
    String LastName = genric.readExcel(0,17,1);
    String email = genric.readExcel(0,18,1);
    String productType = genric.readExcel(0,19,1);
    String pro = genric.readExcel(0,20,1);
    String AccManager = genric.readExcel(0,21,1);
    String Accmgtxt = genric.readExcel(0,22,1);
    String SalesContact = genric.readExcel(0,23,1);
    String Salesc = genric.readExcel(0,24,1);
    String SubmitBtn = genric.readExcel(0,25,1);
    String CancelBtn = genric.readExcel(0,26,1);
    String testuser = genric.readExcel(0,27,1);
    //String testuser2 = "(//span[@class='ng-binding ng-scope'][contains(text(),'Test User')])[1]";


    String compname = "Autotest1";
    String Actxt =  "test user";
    String DispName = "AutotestdisName";
    String FstName = "Aj";
    String LstName = "kk";
    String emailid = genric.email_id();




    public void addNewPublisher() throws InterruptedException {


        click(By.xpath(Par));
        click(By.xpath(selectPartner));
        writeText(By.xpath(companyName), compname);
        writeText(By.xpath(dsplayName), DispName);
        writeText(By.xpath(FirstName), FstName);
        writeText(By.xpath(LastName), LstName);
        writeText(By.xpath(email), emailid);
        click(By.xpath(productType));
        click(By.xpath(pro));
        Thread.sleep(2000);

        click(By.xpath(AccManager));
        writeText(By.xpath(Accmgtxt), Actxt);
        Thread.sleep(2000);
        click(By.xpath(testuser));

        click(By.xpath(SalesContact));
        writeText(By.xpath(Salesc), Actxt);
        Thread.sleep(5000);
        enterButton(By.xpath(Salesc));

        click(By.xpath(SubmitBtn));



    }

}
