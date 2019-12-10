package day61_ExcelRead;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelWrite {
	
	public static void main(String[] args) throws Exception {
	    String filePath ="/Users/madin/Desktop/day61.xlsx";
	    String sheetname = "Sheet1";  // Name of the sheet
        
        FileInputStream file = new FileInputStream(filePath); // reads a file
        
        Workbook excelFile = WorkbookFactory.create(file); // specially designed for Excel Files
        //XSSFWorkbook excelfile2 = new XSSFWorkbook(file);   // does the same thing
        
        
        Sheet sheet =  excelFile.getSheet(sheetname);  // gets the specific spread sheet from excelfile
        // XSSFSheet sheet2 =excelfile2.getSheet(sheetname);
        
        
        Cell cell = sheet.getRow(1).getCell(0); // Retrieves specific cell from the spreadsheet
        cell.setCellValue("Suna");// it reads that cell value;   not the file itself
        
        String cellData = cell.getStringCellValue();  // converts the cell' value to STring data type
        
        System.out.println(cellData);
        
}

}
