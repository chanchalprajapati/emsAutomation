package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
public class regesterPublisher extends basePage {

    public regesterPublisher(WebDriver driver, WebDriverWait wait){

        super(driver, wait);

    }

    String selectPartner = "//span[@class='ui-select-match-text pull-left']";
    String companyName = "//li[3]//div[1]//input[1]";
    //String companyName= "#bodyContainer > div.ng-scope > div:nth-child(3) > div > div > ul > li:nth-child(3) > div > input";
    String dsplayName = "//ul[@class='formlist']//li[4]//div[1]//input[1]";
    String FirstName = "//ul[@class='formlist']//li[5]//div[1]//input[1]";
    String LastName = "//ul[@class='formlist']//li[6]//div[1]//input[1]";
    String email = "//ul[@class='formlist']//li[7]//div[1]//input[1]";
    String productType = "//div[@placeholder='Select Product Type']//div//input[@type='search']";
    String AccManager = "//span[contains(text(),'Select Account Manager')]";
    String SalesContact = "//span[contains(text(),'Select Sales Contact')]";
    String SubmitBtn = "//a[@class='btn btn-red btn-main btn-sm']";
    String CancelBtn = "//a[@class='btn btn-grey btn-main btn-sm']";


    public void addNewPublisher(String partner, String compname, String DispName, String FstName, String LstName, String emailid, String pt, String Ac, String Sales) throws InterruptedException {
        System.out.print("enters in This page");
        System.out.print("After Sleep");
        writeText(By.xpath(companyName), compname);
        writeText(By.xpath(dsplayName), DispName);
        writeText(By.xpath(FirstName), FstName);
        writeText(By.xpath(LastName), LstName);
        writeText(By.xpath(email), emailid);
        click(By.xpath(productType));
        enterButton(By.xpath(productType));
        click(By.xpath(AccManager));
        writeText(By.xpath(AccManager), "Test User");
        enterButton(By.xpath(AccManager));
        click(By.xpath(SalesContact));
        writeText(By.xpath(SalesContact), "Test User");
        enterButton(By.xpath(SalesContact));
        click(By.xpath(SubmitBtn));



    }

}
