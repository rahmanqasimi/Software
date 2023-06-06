package Practice2;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import utils.Constants;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class P7 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream(Constants.EXCEL_FILE_PATH);

        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fis);

        Sheet sheet = xssfWorkbook.getSheet("Sheet1");
        Row row1 = sheet.getRow(3);
        Cell cell = row1.getCell(2);
        System.out.println(cell);

/*        Cell c= xssfWorkbook.getSheet("Sheet1").getRow(2).getCell(1);

        System.out.println(xssfWorkbook.getSheet("Sheet1").getRow(2).getCell(1));

        xssfWorkbook.getSheet("Sheet1").getRow(2).getCell(3)*/;

        int rowSize = sheet.getPhysicalNumberOfRows();
        int colSize = row1.getPhysicalNumberOfCells();
        for(int rows = 0; rows< sheet.getPhysicalNumberOfRows(); rows++){
            Row row = sheet.getRow(rows);
            for (int col = 0 ; col < row.getPhysicalNumberOfCells(); col++) {
                System.out.print(row.getCell(col) + "\t");
            }
            System.out.println();
        }
        System.out.println(xssfWorkbook.getSheet("Sheet1").getLastRowNum());
        System.out.println(xssfWorkbook.getSheet("Sheet1").getRow(0).getLastCellNum());
    }
}
