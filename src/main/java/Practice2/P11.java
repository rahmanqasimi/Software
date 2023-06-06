package Practice2;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class P11 {
    public static void main(String[] args) throws IOException {
        String path = "Files/Employees.xlsx";
        FileInputStream fileInput = new FileInputStream(path);
        XSSFWorkbook xss = new XSSFWorkbook(fileInput);
        Sheet sheet = xss.getSheet("Sheet1");
        Row row = sheet.createRow(5);
        Cell cell1 = row.createCell(0);
        cell1.setCellValue("Hola");
        row.createCell(1).setCellValue("Mola");
        row.createCell(2).setCellValue("Dola");
        row.createCell(3).setCellValue("Pola");
        row.createCell(4).setCellValue("Lola");
        row.createCell(5).setCellValue("Jola");
        FileOutputStream fileOutput = new FileOutputStream(path);
        xss.write(fileOutput);





    }
}
