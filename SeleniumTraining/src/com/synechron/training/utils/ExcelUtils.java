package com.synechron.training.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtils
{

//	public static void main(String[] args) throws EncryptedDocumentException, IOException
//	{
//		File file =  new File("data\\testdata.xls");
//		FileInputStream fis  = new FileInputStream(file);
//		Workbook wb = WorkbookFactory.create(fis);
//		
//		System.out.println(" TOTAL SHEETS PRESENT IN EXCEL -> " + wb.getNumberOfSheets());
//		for(int i =0 ; i< wb.getNumberOfSheets() ; i++)
//		{
//			System.out.println("Sheet Name : " + wb.getSheetName(i));
//		}
//		
//		Sheet sh = wb.getSheet("customerdata");
//		
//		System.out.println("NUMBER OF ROWS --> " + sh.getLastRowNum()+1);
//		Row row  =null;
//		Cell cell1,cell2=null;
//		for(int i = 0; i<=sh.getLastRowNum();i++)
//		{
//			row = sh.getRow(i);
//			cell1 = row.getCell(0);
//			cell2 = row.getCell(1);
//			
//			System.out.println(cell1.getStringCellValue() + " || " + cell2.getStringCellValue());
//			
//		}
//		
//		
//		fis.close();
//	
//	}
//	
	public static int getRowCount(String sheetName) throws EncryptedDocumentException, IOException 
	{
		File file =  new File("data\\testdata.xls");
		FileInputStream fis  = new FileInputStream(file);
		Workbook wb = WorkbookFactory.create(fis);
			
		Sheet sh = wb.getSheet(sheetName);
		
		System.out.println("NUMBER OF ROWS --> " + sh.getLastRowNum()+1);
		
		return sh.getLastRowNum()+1;
	
	}
	
	public static String getMyCellValue(String sheetName,int rowNum,int colNum) throws EncryptedDocumentException, IOException
	{
		File file =  new File("data\\testdata.xls");
		FileInputStream fis  = new FileInputStream(file);
		Workbook wb = WorkbookFactory.create(fis);
			
		Sheet sh = wb.getSheet(sheetName);
		
		Row row = sh.getRow(rowNum);
		
		Cell cell = row.getCell(colNum);
		
		return cell.getStringCellValue();
		
		
	}
	
	
	
	
	
	
	
	
	
}
