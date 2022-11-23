package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility
{
	public static void captureScreenshot(WebDriver driver,String screenshotName) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		File source = ts.getScreenshotAs(OutputType.FILE);
		
		Calendar cal=Calendar.getInstance();
		
		Date time = cal.getTime();
		
		SimpleDateFormat ac = new SimpleDateFormat("dd-MM-YYYY-hh mm ss");
		
		String timestamp=ac.format(cal.getTime());
		
		File destination = new File("test-output\\Screenshot\\image"+"-"+screenshotName+"-"+timestamp+".png");
		
		FileHandler.copy(source, destination);
		
	}
	public static String getDataFromExcelsheet(String sheetname, int row,int column) throws IOException
	{
		String data =null;
		
		String path = "C:\\Users\\Sumit Patil\\Desktop\\prefme1.xlsx";
		//String path="src\\main\\resources\\testData\\prefme1.xlsx";
		
		FileInputStream file = new FileInputStream(path);
		
		Workbook book = WorkbookFactory.create(file);
		
		try
		{
			
			data=book.getSheet(sheetname).getRow(row).getCell(column).getStringCellValue();
		}
		catch(IllegalStateException e)
		{
			double value=book.getSheet(sheetname).getRow(row).getCell(column).getNumericCellValue();
			
			data=Double.toString(value);
		}
		return data;
	
	}
	
	public static String GetDataFromExcelsheet(String sheetname, int row,int column) throws IOException
	{
		String Data =null;
		
		String path = "C:\\Users\\Sumit Patil\\Desktop\\prefme1.xlsx";
		//String path="src\\main\\resources\\testData\\prefme1.xlsx";
		
		FileInputStream file = new FileInputStream(path);
		
		Workbook book = WorkbookFactory.create(file);
		
		try
		{
			
			Data=book.getSheet(sheetname).getRow(row).getCell(column).getStringCellValue();
		}
		catch(IllegalStateException e)
		{
			double value=book.getSheet(sheetname).getRow(row).getCell(column).getNumericCellValue();
			
			Data=Double.toString(value);
		}
		return Data;
	
	}
	
	public static String getdataFromExcelsheetforCheckIn(String sheetname, int row,int column) throws IOException
	{
		String data1=null;
		
		String path = "C:\\Users\\Sumit Patil\\Desktop\\WalkIn&checkIn.xlsx";

		FileInputStream file = new FileInputStream(path);
		
		Workbook book = WorkbookFactory.create(file);
		
		try
		{
			
			data1=book.getSheet(sheetname).getRow(row).getCell(column).getStringCellValue();
		}
		catch(IllegalStateException e)
		{
			double value=book.getSheet(sheetname).getRow(row).getCell(column).getNumericCellValue();
			
			data1=Double.toString(value);
		}
		return data1;
	
	}

	public static String getdataFromExcelsheetforUserManagement(String sheetname, int row,int column) throws IOException
	{
		String data3=null;
		
		String path = "C:\\Users\\Sumit Patil\\Desktop\\User Management.xlsx";

		FileInputStream file = new FileInputStream(path);
		
		Workbook book = WorkbookFactory.create(file);
		
		try
		{
			
			data3=book.getSheet(sheetname).getRow(row).getCell(column).getStringCellValue();
		}
		catch(IllegalStateException e)
		{
			double value=book.getSheet(sheetname).getRow(row).getCell(column).getNumericCellValue();
			
			data3=Double.toString(value);
		}
		return data3;
	
	}
	
	public static String getdataFromExcelsheetforDropRequests(String sheetname, int row,int column) throws IOException
	{
		String data4=null;
		
		String path ="C:\\Users\\Sumit Patil\\Desktop\\Drop off request.xlsx";


		FileInputStream file = new FileInputStream(path);
		
		Workbook book = WorkbookFactory.create(file);
		
		try
		{
			
			data4=book.getSheet(sheetname).getRow(row).getCell(column).getStringCellValue();
		}
		catch(IllegalStateException e)
		{
			double value=book.getSheet(sheetname).getRow(row).getCell(column).getNumericCellValue();
			
			data4=Double.toString(value);
		}
		return data4;
	
	}


	public static String getdataFromExcelsheet(String sheetname, int row,int column) throws IOException
	{
		String dataa=null;
		
		String path ="C:\\Users\\Sumit Patil\\Desktop\\Pick up date.xlsx";


		FileInputStream file = new FileInputStream(path);
		
		Workbook book = WorkbookFactory.create(file);
		
		try
		{
			
			dataa=book.getSheet(sheetname).getRow(row).getCell(column).getStringCellValue();
		}
		catch(IllegalStateException e)
		{
			double value=book.getSheet(sheetname).getRow(row).getCell(column).getNumericCellValue();
			
			dataa=Double.toString(value);
		}
		return dataa;
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
