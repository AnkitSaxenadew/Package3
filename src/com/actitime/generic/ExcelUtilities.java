package com.actitime.generic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtilities {
	
	String filepath;
	public ExcelUtilities(String filepath)
	{
		this.filepath=filepath;
	}
     public String readData(String sheetName, int rowNum, int cellNum) {
    	 String value="";
    	 try {
    		 File file = new File(filepath);
			FileInputStream fis=new FileInputStream(filepath);
			Workbook wb = WorkbookFactory.create(fis);
			Cell cell = wb.getSheet(sheetName).getRow(rowNum).getCell(cellNum);
			
		
			switch (cell.getCellType()) {
			
			case STRING;
			value=cell.getStringCellValue();
			break;
			
			case NUMERIC;
			long longValue=(long)cell.getNumericCellValue();
			value=Long.toString(longValue);
			default:
				break;
			
			}
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
	
		}
    	 catch(IOException e) {
    		 e.printStackTrace();
    	 }
    	 return value;
     }
     
	
	
	
	
}
