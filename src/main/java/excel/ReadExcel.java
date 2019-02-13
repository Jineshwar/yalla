
package excel;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		//Invoking workbook
		XSSFWorkbook wbook = new XSSFWorkbook("F:\\Jinesh\\Workspace\\Exceldata/cl.xlsx");
		//Getting the particular sheet
		XSSFSheet sheet = wbook.getSheetAt(0);
		//Getting last active row number
		int rowcount = sheet.getLastRowNum();
		System.out.println("Row Count "+rowcount);
		//getting last active column
		int columncount = sheet.getRow(0).getLastCellNum();
		System.out.println("Column count "+columncount);
		
		for (int i = 1; i <= rowcount; i++) {
			//getting the particular row
			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j < columncount; j++) {
				//Getting the particular cell
				XSSFCell cell = row.getCell(j);
				//Getting cell value
				String text = cell.getStringCellValue();
				System.out.println(text);
			} 
		}
		wbook.close();
	}

}
