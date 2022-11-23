package utils;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class date 
{
	public static String getdatrafromexcelsheet(String sheetname,int row,int column) throws EncryptedDocumentException, IOException
	{


		String data=null;
		
		String path = "C:\\Users\\Sumit Patil\\Desktop\\slectdate.xlsx";

		FileInputStream file = new FileInputStream(path);
		
		Workbook book = WorkbookFactory.create(file);
		
		try
		{
			
			data=book.getSheet(sheetname).getRow(row).getCell(column).getStringCellValue();
		}
		catch(IllegalStateException e)
		{
			int  value=(int) book.getSheet(sheetname).getRow(row).getCell(column).getNumericCellValue();
			
			data=Double.toString(value);
		}
		return data;
		
	}

}
