package com.ReadData;

import static org.testng.Assert.assertFalse;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadFromExcel {
	 
	@Test(priority=1)
public void readData() throws IOException
{
	FileInputStream file=new FileInputStream("E:\\PracticeWorkspace\\ReadAndWriteData\\ExcelData\\Test.xlsx");	
	XSSFWorkbook book=new XSSFWorkbook(file);
	XSSFSheet sheet=book.getSheet("TestData");
	//Row row=sheet.getRow(1);
	XSSFRow row=null;
	//Cell cell=row.getCell(5);
	XSSFCell cell=null;
	String stg=sheet.getRow(1).getCell(1).getStringCellValue();
	System.out.println(stg);
	//System.out.println(sheet.getRow(1).getCell(1));
	
}
	
	@Test(priority=2,enabled=false)
	public void writeData() throws IOException
	{
		FileInputStream file=new FileInputStream("E:\\PracticeWorkspace\\ReadAndWriteData\\ExcelData\\Test.xlsx");	
		XSSFWorkbook book=new XSSFWorkbook(file);
		XSSFSheet sheet=book.getSheet("TestData");
		Row row=sheet.createRow(0);
		Cell cell=row.createCell(0);
		//cell.setCellType(cell.CELL_TYPE_STRING);
		
		//cell.setCellValue("gender");
		FileOutputStream out=new FileOutputStream("E:\\PracticeWorkspace\\ReadAndWriteData\\ExcelData\\Test.xlsx");
		book.write(out);
		out.close();
		System.out.println(cell);
		System.out.println(sheet.getRow(1).getCell(1));
		}
	
	
}
