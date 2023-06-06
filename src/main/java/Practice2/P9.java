package Practice2;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import utils.Constants;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P9 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream(Constants.EXCEL_FILE_PATH);

        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fis);

        Sheet sheet = xssfWorkbook.getSheet("Sheet1");

        List<Map<String,String>> excelData = new ArrayList<>();
        Row headerRow = sheet.getRow(0);
/*        Row row1 = sheet.getRow(3);
        Cell cell = row1.getCell(2);
        System.out.println(cell);*/
/*        Cell c= xssfWorkbook.getSheet("Sheet1").getRow(2).getCell(1);
        System.out.println(xssfWorkbook.getSheet("Sheet1").getRow(2).getCell(1));
        xssfWorkbook.getSheet("Sheet1").getRow(2).getCell(3)*/;
        int rowSize = sheet.getPhysicalNumberOfRows();
        for(int rows = 1; rows< rowSize; rows++){
            Row row = sheet.getRow(rows);
            Map<String,String> rowData = new HashMap<>();
            for (int col = 0 ; col < row.getPhysicalNumberOfCells(); col++) {
                String key = headerRow.getCell(col).toString();
                String value = row.getCell(col).toString();
                rowData.put(key,value);
            }
            excelData.add(rowData);
        }
        System.out.println(excelData);
/*        System.out.println(xssfWorkbook.getSheet("Sheet1").getLastRowNum());
        System.out.println(xssfWorkbook.getSheet("Sheet1").getRow(0).getLastCellNum());*/
    }
}
