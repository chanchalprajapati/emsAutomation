package pages;

import java.text.SimpleDateFormat;
import java.util.Date;

public class roughTest {
    public static void main(String[] args) {

        System.out.print(getCurrentDateTime()+"test@media.net");
    }
        public static String  getCurrentDateTime ()
        {
            Date dNow = new Date();
            SimpleDateFormat ft = new SimpleDateFormat("ddMMyyhhmmss");
            String datetime = ft.format(dNow);
            return datetime;


        }
    }


       /** String  addPubBtn = "//span[@class='ng-binding ng-scope'][contains(text(),'AAX')]";
        roughTest dd = new roughTest();
        dd.click(addPubBtn);

    }
     public  void click(String xpathString) throws InterruptedException {
       System.setProperty("webdriver.chrome.driver", "C:\\emsAutomation\\src\\main\\resources\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
         driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("http://stage5.hb.reports.mn:83/publishermanagement/#/8PRL4E7N3/Header%20Bidder/add");
        Thread.sleep(7000);
        driver.findElement(By.xpath("//div[@placeholder='Select Partner']")).click();
         WebElement s= driver.findElement(By.xpath(xpathString));
         s.click();
       // driver.findElement(By.xpath(xpathString)).click();**/



 //   }










