package Testng;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class Dataexample1 {
	
	 
	  @DataProvider //(name ="LoginTestData")
	 
	  public String [] []  getdata () throws Throwable {
		  File file = new File("C:\\Users\\Dell\\Desktop\\Dataprovider.xlsx");
		  System.out.println(file.exists());
		  FileInputStream stream = new FileInputStream(file);
			XSSFWorkbook workbook = new XSSFWorkbook(stream);
	
			XSSFSheet sheet = workbook.getSheetAt(0);
			int rows = sheet.getPhysicalNumberOfRows();
			int cells= sheet.getRow(1).getLastCellNum();
			
			String [] [] data1 = new String [rows-1] [cells];
			for ( int i=0; i<rows-1; i++) {
				for (int j=0; j< cells; j++) {
					
					DataFormatter dataformat = new DataFormatter();
					data1 [i][j]= dataformat.formatCellValue(sheet.getRow(i+1).getCell(j));
					
					//System.out.println(dataformat.formatCellValue(sheet.getRow(i).getCell(j)));
					
					
				}
			
			}
			workbook.close();
			stream.close();
		
			return data1;
	  }
}
