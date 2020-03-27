package com.ExcelUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_data 
{
	//code for username
	public  String excel_username(int i) throws IOException 
	{	  
		FileInputStream fil = new FileInputStream(new File("src\\test\\resources\\TestData\\exceldata.xlsx"));//excel data path
		XSSFWorkbook workbook = new XSSFWorkbook(fil);//get the excel file from the workbook
		XSSFSheet sheet=workbook.getSheet("Sheet1");//get data from the sheet1
		XSSFRow row =sheet.getRow(i);// getting data from the row that is 'i'
		XSSFCell cell =row.getCell(0);//'i' is replace as zero
		cell.setCellType(CellType.STRING);//set the cell type value as string
		String uname =cell.getStringCellValue();//get value form the cell and stored in uname
		return uname;// return uname
	}
	//code for email
	public  String Email(int i) throws IOException
	{	  
		FileInputStream fil = new FileInputStream(new File("src\\test\\resources\\TestData\\exceldata.xlsx"));//excel data path
		XSSFWorkbook workbook = new XSSFWorkbook(fil);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		XSSFRow row =sheet.getRow(i);
		XSSFCell cell1 =row.getCell(1);
		cell1.setCellType(CellType.STRING);
		String Email =cell1.getStringCellValue();//get value form the cell and stored in email
		return Email;// return email
	}
	//code for password
	public  String excel_password(int i) throws IOException 
	{ 
		FileInputStream fil = new FileInputStream(new File("src\\test\\resources\\TestData\\exceldata.xlsx"));
		XSSFWorkbook workbook = new XSSFWorkbook(fil);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		XSSFRow row =sheet.getRow(i);
		XSSFCell cell2 =row.getCell(2);
		cell2.setCellType(CellType.STRING);
		String pwd =cell2.getStringCellValue();//get value form the cell and stored in pwd
		return pwd;//return pwd
		
	}
	//code for retype password
	public  String excel_repassword(int i) throws IOException 
	{ 
		FileInputStream fil = new FileInputStream(new File("src\\test\\resources\\TestData\\exceldata.xlsx"));
		XSSFWorkbook workbook = new XSSFWorkbook(fil);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		XSSFRow row =sheet.getRow(i);
		XSSFCell cell3 =row.getCell(3);
		cell3.setCellType(CellType.STRING);
		String re_pwd =cell3.getStringCellValue();//get value form the cell and stored in uname
		return re_pwd;//return re_pwd
		
	}
}
