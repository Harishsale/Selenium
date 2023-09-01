package Selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.eventusermodel.XSSFSheetXMLHandler;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exceldata {

	public static void main(String[] args) throws Exception {
		File file=new File("C:\\Users\\Dell\\Desktop\\All Desktop Files\\POOJA STORES TEST DOCUMENT\\POOJA STORE TEST DOCUMENT.xlsx");
		FileInputStream fileinput=new FileInputStream(file);
		XSSFWorkbook workbook=new XSSFWorkbook(fileinput);
		XSSFSheet sheet=workbook.getSheet("Test Scenarios");
		System.out.println(sheet.getPhysicalNumberOfRows());
		int rows=sheet.getPhysicalNumberOfRows();
		int cells=sheet.getRow(10).getLastCellNum();
		for(int i=10;i<rows;i++) {
			for(int j=0;j<cells;j++) {
				DataFormatter dataformat=new DataFormatter();
				System.out.println(dataformat.formatCellValue(sheet.getRow(i).getCell(j)));
			
			}
		}

	}

}
