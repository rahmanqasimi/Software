package Practice2;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class P12 {
    public static void main(String[] args) throws IOException {
//1)Software 2) Path 3) Store the file
        String path = System.getProperty("user.dir")+"\\Files\\TestExcelFIle.xlsx";
        FileInputStream input = new FileInputStream(path);
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook();
        Sheet sheet = xssfWorkbook.getSheet("Sheet1");
        Row row = sheet.createRow(0);
        Cell cell = row.createCell(0);
        Cell cell1=row.createCell(1);
        Cell cell2=row.createCell(2);
        cell.setCellValue("Wael");
        cell1.setCellValue("Jacob");
        cell2.setCellValue("Yah");
        // used when we have to create a new file or we write data to a file
        FileOutputStream output=new
                FileOutputStream(path);
        xssfWorkbook.write(output);
    }
}
