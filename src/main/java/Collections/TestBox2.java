package Collections;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class TestBox2 {

  private static XSSFWorkbook ExcelWorkBook;
  private static XSSFSheet ExcelWSheet;
  private static XSSFRow Row;
  private static XSSFCell Cell;


  public static void main(String[] args) throws Exception {

    String filepath = "D:\\ReversalTestCases.xlsx";
    InputStream fileInputStream = new FileInputStream(filepath);
    ExcelWorkBook = new XSSFWorkbook(fileInputStream);
    ExcelWSheet = ExcelWorkBook.getSheet("Sheet1");
    Cell = ExcelWSheet.getRow(0).getCell(0);

      String cellValue = Row.iterator().next().getStringCellValue();
      System.out.println(cellValue);




  }
}
