package utils;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Calender
{ 
	 WebDriver driver;
	
	public void captureCalender(String sheetname, int row,int column) throws IOException
	{
		driver.findElement(By.xpath("//input[@name='checkoutDate']"));
		

		List<WebElement>alldates=driver.findElements(By.xpath("//td[@role='gridcell']"));
		
		for(WebElement ele:alldates)
		{
			String date=ele.getText();
			
			if(date.equalsIgnoreCase("22"))
			{
				ele.click();
				break;
			}
		}
	
	}

}
