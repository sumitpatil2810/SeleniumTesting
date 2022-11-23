package Walk_in_Check_in;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.Utility;
import utils.date;

public class WalkIn_CheckIn 
{
	WebDriver driver;
	
	@FindBy(xpath="//body[1]/app-root[1]/app-landing[1]/app-sidebar[1]/a[1]/span[2]")
	private WebElement MenuTab;
	
	@FindBy(xpath="//body/app-root[1]/app-landing[1]/app-sidebar[1]/div[1]/div[1]/ul[1]/li[3]/a[1]/i[1]")
	private WebElement WalkIn_CheckIn;
	
	@FindBy(xpath="//body/app-root[1]/app-landing[1]/div[1]/div[1]/app-walk-in-check-in[1]/app-guest[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ngx-select[1]/div[1]/div[2]/div[1]/span[2]/i[1]")
	private WebElement tag;
	
	@FindBy(xpath="//body/app-root[1]/app-landing[1]/div[1]/div[1]/app-walk-in-check-in[1]/app-guest[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ngx-select[1]/div[1]/ul[1]/li[1]/a[1]/span[1]")
	private WebElement SelectTag;
	
	@FindBy(xpath="//body/app-root[1]/app-landing[1]/div[1]/div[1]/app-walk-in-check-in[1]/app-guest[1]/form[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/input[1]")
	private WebElement GuestCode;
	
	@FindBy(xpath="//body/app-root[1]/app-landing[1]/div[1]/div[1]/app-walk-in-check-in[1]/app-guest[1]/form[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/input[1]")
	private WebElement GuestPin;
	
	@FindBy(xpath="//body/app-root[1]/app-landing[1]/div[1]/div[1]/app-walk-in-check-in[1]/app-guest[1]/form[1]/div[1]/div[1]/div[1]/div[3]/div[3]/div[1]/input[1]")
	private WebElement FirstName;
	
	@FindBy(xpath="//body/app-root[1]/app-landing[1]/div[1]/div[1]/app-walk-in-check-in[1]/app-guest[1]/form[1]/div[1]/div[1]/div[1]/div[3]/div[4]/div[1]/input[1]")
	private WebElement LastName;
	
	@FindBy(xpath="//body/app-root[1]/app-landing[1]/div[1]/div[1]/app-walk-in-check-in[1]/app-guest[1]/form[1]/div[1]/div[1]/div[1]/div[3]/div[5]/div[1]/input[1]")
	private WebElement Email;
	
	@FindBy(xpath="//body/app-root[1]/app-landing[1]/div[1]/div[1]/app-walk-in-check-in[1]/app-guest[1]/form[1]/div[1]/div[1]/div[1]/div[3]/div[6]/div[1]/input[1]")
	private WebElement MobileNo;
	
	@FindBy(xpath="//span[contains(text(),'Business')]")
	private WebElement Business;
	
	@FindBy(xpath="//input[@id='2']")
	private WebElement Leisure;
	
	@FindBy(xpath="//input[@id='3']")
	private WebElement Other;
	
	@FindBy(xpath="//body/app-root[1]/app-landing[1]/div[1]/div[1]/app-walk-in-check-in[1]/app-guest[1]/form[1]/div[1]/div[2]/div[1]/div[2]/div[3]/div[1]/input[1]")
	private WebElement checkOutDate;
	
	@FindBy(xpath="//tbody/tr[4]/td[4]")
	private WebElement SelectDate;
	
	@FindBy(xpath="//button[contains(text(),'Select Room')]")
	private WebElement SelectRoom;

	@FindBy(xpath="//input[@id='No']")
	private WebElement SmokingPrefrence;

	@FindBy(xpath="//label[contains(text(),'Room Name')]")
	private WebElement RoomName;
	
	@FindBy(xpath="//body/app-root[1]/app-landing[1]/div[1]/div[1]/app-walk-in-check-in[1]/app-guest[1]/div[2]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[4]/div[2]/div[1]/label[1]")
	private WebElement RoomCategory1;
	
	@FindBy(xpath="//h3[contains(text(),'508')]")
	private WebElement RoomNumber;
	
	@FindBy(xpath="//button[contains(text(),'Assign Room')]")
	private WebElement AssignRoom;
	
	@FindBy(xpath="//body/app-root[1]/app-landing[1]/div[1]/div[1]/app-walk-in-check-in[1]/app-guest[1]/form[1]/div[1]/div[2]/div[1]/div[6]/div[1]/div[1]/div[1]/textarea[1]")
	private WebElement AdditionalNote;
	
	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-landing[1]/div[1]/div[1]/app-walk-in-check-in[1]/app-guest[1]/form[1]/div[1]/div[2]/div[2]/button[1]")
	private WebElement CheckIn;
	
	@FindBy(xpath="//input[@id='GRC']")
	private WebElement GRC;
	
	@FindBy(xpath="//button[contains(text(),'Yes')]")
	private WebElement Yes;
	
	
	@FindBy(xpath="//td[@role='gridcell']")
	private List<WebElement> dates;
	
	public WalkIn_CheckIn(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	public void SelectTag() throws InterruptedException
	{
		WalkIn_CheckIn.click();
		Thread.sleep(2000);
		
		tag.click();
		Thread.sleep(2000);
		
		SelectTag.click();
		Thread.sleep(2000);
	}
	
	public void FirstName(String data1) throws InterruptedException
	{
		FirstName.sendKeys(data1);
		Thread.sleep(2000);
	}
	
	public void LastName(String data1) throws InterruptedException
	{
		LastName.sendKeys(data1);
		Thread.sleep(2000);
	}
	
	public void Email(String data1) throws InterruptedException
	{
		Email.sendKeys(data1);
		Thread.sleep(2000);
	}
	
	public void MobileNo(String data1) throws InterruptedException
	{
		MobileNo.sendKeys(data1);
		Thread.sleep(2000);
	}
	
	public void StayDetails() throws InterruptedException, IOException
	{
		checkOutDate.click();
		
		Thread.sleep(2000);
		
//		SelectDate();
		
	}
	
	public void SelectDate() throws IOException
	{
		
	String s = date.getdatrafromexcelsheet("Sheet1", 1, 0);
	   
		//String s= "27";
		String[] d = s.split(" "); 
	  	
		int a =Integer.valueOf(d[0]);
		String date= String.valueOf(a+1);
		for(int i= 3; i<dates.size(); i++)
		{
			
		if(String.valueOf(i).equals(date)) 
		{
			dates.get(i).click();
		} 
	}
	
	}
	public void RoomAssigning() throws InterruptedException
	{
		SelectRoom.click();
		Thread.sleep(2000);
		SmokingPrefrence.click();
		
		RoomCategory1.click();
		Thread.sleep(4000);
		
		RoomNumber.click();
		Thread.sleep(2000);
		
		AssignRoom.click();
		Thread.sleep(4000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", CheckIn);
		
	//	CheckIn.click();
		Thread.sleep(2000);
		
		GRC.click();
		
		Thread.sleep(4000);
		Yes.click();
	}
	
	
	
	

}
