package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import uitilities.genric;

public class regesterPublisher extends basePage {

    public regesterPublisher(WebDriver driver, WebDriverWait wait){

        super(driver, wait);

    }

    String selectPartner = "//span[@class='ng-binding ng-scope'][contains(text(),'AAX')]";
    String Par = "//div[@placeholder='Select Partner']";
    String companyName = "//li[3]//div[1]//input[1]";
    //String companyName= "#bodyContainer > div.ng-scope > div:nth-child(3) > div > div > ul > li:nth-child(3) > div > input";
    String dsplayName = "//ul[@class='formlist']//li[4]//div[1]//input[1]";
    String FirstName = "//ul[@class='formlist']//li[5]//div[1]//input[1]";
    String LastName = "//ul[@class='formlist']//li[6]//div[1]//input[1]";
    String email = "//ul[@class='formlist']//li[7]//div[1]//input[1]";
    String productType = "//div[@placeholder='Select Product Type']//div//input[@type='search']";
    String pro = "//span[contains(text(),'In-App')]";
    String AccManager = "//span[contains(text(),'Select Account Manager')]";
    String Accmgtxt = "//input[@placeholder='Select Account Manager']";
    String SalesContact = "//span[contains(text(),'Select Sales Contact')]";
    String Salesc = "//input[@placeholder='Select Sales Contact']";
    String SubmitBtn = "//a[@class='btn btn-red btn-main btn-sm']";
    String CancelBtn = "//a[@class='btn btn-grey btn-main btn-sm']";
    String testuser = "//span[@class='ng-binding ng-scope'][contains(text(),'Test User')]";
    String testuser2 = "(//span[@class='ng-binding ng-scope'][contains(text(),'Test User')])[1]";


    String compname = "Autotest1";
    String Actxt =  "test user";
    String DispName = "AutotestdisName";
    String FstName = "Aj";
    String LstName = "kk";
    String emailid = genric.email_id();




    public void addNewPublisher() throws InterruptedException {
        System.out.print("enters in This page");
        System.out.print("After Sleep");
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
