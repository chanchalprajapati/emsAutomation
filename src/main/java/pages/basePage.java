package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.Keys;

public class basePage {

    public WebDriver driver;
    public WebDriverWait wait;


    //Constructor
    public basePage (WebDriver driver, WebDriverWait wait){

       this.driver = driver;
       this.wait = wait;


    }

    //Click Method
    public void click (By elementLocation) {
        driver.findElement(elementLocation).click();
    }

    //Write Text
    public void writeText (By elementLocation, String text) {
        driver.findElement(elementLocation).sendKeys(text);
    }

    //Read Text
    public String readText (By elementLocation) {
        return driver.findElement(elementLocation).getText();
    }

    //Enter button press
    public void enterButton (By elementLocation) {
        driver.findElement(elementLocation).sendKeys(Keys.RETURN);
    }

    public void dropdown (By elementLocation, String option) {
        Select dropdownSelect = new Select(driver.findElement(elementLocation));
        dropdownSelect.selectByVisibleText(option);

    }


}
