package uitilities;

import com.sun.rowset.internal.Row;
import javafx.scene.control.Cell;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by chanchal.k on 31-07-2018.
 */
public class genric {
    public  static String  email_id()
    {
       String email_id  = getCurrentDateTime()+"test@testmail.mm";
       return email_id;
    }

    public static String  getCurrentDateTime ()
    {
        Date dNow = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("ddMMyyhhmmss");
        String datetime = ft.format(dNow);
        return datetime;


    }


    public static String readExcel(int sheet, int row, int coulmn) throws IOException {
        String filepath = "C:\\emsAutomation\\src\\main\\resources\\testData\\data.xlsx";
        File src=new File(filepath);
        FileInputStream fis=new FileInputStream(src);
        XSSFWorkbook wb=new XSSFWorkbook(fis);
        XSSFSheet sh1= wb.getSheetAt(sheet);
        String cellValue = sh1.getRow(row).getCell(coulmn).getStringCellValue();
        return cellValue;
    }



    public static void writeExcel(int sheet, int row, int column, int columnContent) throws IOException {
        String filepath = "C:\\emsAutomation\\src\\main\\resources\\testData\\data.xlsx";
        File src=new File(filepath);
        FileInputStream fis=new FileInputStream(src);
        XSSFWorkbook wb=new XSSFWorkbook(fis);
        XSSFSheet sh1= wb.getSheetAt(sheet);
        sh1.createRow(row).createCell(column).setCellValue(columnContent);
        FileOutputStream fout=new FileOutputStream(src);
        wb.write(fout);
        fout.close();

    }
}
