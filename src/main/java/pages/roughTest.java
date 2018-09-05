package pages;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class roughTest {

    public static void main(String[] args) throws IOException {



        String filepath = "C:\\emsAutomation\\src\\main\\resources\\testData\\data.xlsx";
        File src=new File(filepath);
        FileInputStream fis=new FileInputStream(src);
        XSSFWorkbook wb=new XSSFWorkbook(fis);
        XSSFSheet sh1= wb.getSheetAt(0);
        sh1.createRow(2).createCell(2).setCellValue("2222");
        sh1.createRow(3).createCell(3).setCellValue("3333");
        FileOutputStream fout=new FileOutputStream(src);
        wb.write(fout);
        fout.close();


    }


}







