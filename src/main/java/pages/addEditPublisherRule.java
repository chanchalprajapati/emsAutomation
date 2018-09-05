package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by chanchal.k on 21-08-2018.
 */
public class addEditPublisherRule extends basePage {

    public addEditPublisherRule(WebDriver driver, WebDriverWait wait){

        super(driver, wait);

    }

    String cid = "8CUH971TT";
    String searchpath = "//input[@placeholder='Search']";
    String providermap = "//a[contains(text(),'Provider Mapping')]";
    String addProviderbutton = "//a[@class='pull-right btn btn-red btn-main btn-sm ng-scope']";
    String providerDropdown = "//div[@placeholder='Select Provider']//span[@class='btn btn-default form-control ui-select-toggle']";
    String writeprovider = "//input[@placeholder='Select Provider']";
    String clickmediamath = "//span[contains(text(),'Sonobi*')]";
    String updatebutton = "//a[@class='btn btn-red btn-main btn-sm ng-binding ng-isolate-scope']";


    public void addeditpub() throws InterruptedException {

        click(By.xpath(searchpath));
        writeText(By.xpath(searchpath), cid);
        enterButton(By.xpath(searchpath));
        Thread.sleep(2000);
        click(By.xpath(providermap));
        Thread.sleep(10000);
        click(By.xpath(addProviderbutton));
        click(By.xpath(providerDropdown));
        writeText(By.xpath(writeprovider), "Sonobi");
        click(By.xpath(clickmediamath));
        click(By.xpath(updatebutton));
    }


}
