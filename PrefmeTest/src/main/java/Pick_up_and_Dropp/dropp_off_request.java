package Pick_up_and_Dropp;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utils.Utility;

public class dropp_off_request 
{
	WebDriver driver;

	@FindBy(xpath="//body/app-root[1]/app-landing[1]/app-sidebar[1]/a[1]")
	private WebElement menutab;
	
	@FindBy(xpath="//body/app-root[1]/app-landing[1]/app-sidebar[1]/div[1]/div[1]/ul[1]/li[4]/a[1]/i[1]")
	private WebElement pickup_Drop;
	
	@FindBy(xpath="//a[contains(text(),'Drop Off Requests (0)')]")  //a[contains(text(),'Drop Off Requests (0)')]
	private WebElement ClickOn_Drop_Request;
	
	@FindBy(xpath="//body/app-root[1]/app-landing[1]/div[1]/div[1]/app-pickup-dropoff[1]/div[2]/app-drop-requests[1]/div[1]/div[1]/div[2]/button[1]")
	private WebElement Add_New_DropRequest;
	
	@FindBy(xpath="//input[@formcontrolname='firstName']")
	private WebElement FirstName;
	
	@FindBy(xpath="//input[@formcontrolname='lastName']")
	private WebElement LastName;
	
	@FindBy(xpath="//input[@formcontrolname='mobile']")
	private WebElement MobileNo;
	
	@FindBy(xpath="//input[@formcontrolname='email']")
	private WebElement Email;
	
	@FindBy(xpath="//body/modal-container[1]/div[2]/div[1]/add-dropoff[1]/div[2]/form[1]/div[1]/div[5]/div[1]/div[1]/div[1]/div[1]/ngx-select[1]/div[1]/div[2]/div[1]")
	private WebElement Clickon_No_of_Guest;
	
	@FindBy(xpath="//body/modal-container[1]/div[2]/div[1]/add-dropoff[1]/div[2]/form[1]/div[1]/div[5]/div[1]/div[1]/div[1]/div[1]/ngx-select[1]/div[1]/ul[1]/li[2]/a[1]/span[1]")
	private WebElement Select_No_Guest;
	
	@FindBy(xpath="//body/modal-container[1]/div[2]/div[1]/add-dropoff[1]/div[2]/form[1]/div[1]/div[5]/div[1]/div[2]/div[1]/div[1]/ngx-select[1]/div[1]/div[2]/div[1]/span[2]/i[1]")
	private WebElement Clickon_Room_No;
	
	@FindBy(xpath="//span[contains(text(),'506')]")
	private WebElement Select_Room_No;
	
	@FindBy(xpath="//body/modal-container[1]/div[2]/div[1]/add-dropoff[1]/div[2]/form[1]/div[1]/div[6]/div[1]/div[1]/div[1]/div[1]/input[1]")
	private WebElement Click_ON_Dropp_Date;
	
	@FindBy(xpath="//tbody/tr[4]/td[3]")
	private WebElement Select_Dropp_Date;
	
	@FindBy(xpath="//body/modal-container[1]/div[2]/div[1]/add-dropoff[1]/div[2]/form[1]/div[1]/div[6]/div[1]/div[2]/div[1]/div[1]/ngx-select[1]/div[1]/div[2]/div[1]")
	private WebElement Click_ON_Dropp_time;
	
	@FindBy(xpath="//span[contains(text(),'14:00')]")
	private WebElement Select_ON_Dropp_time;
	
	@FindBy(xpath="//body/modal-container[1]/div[2]/div[1]/add-dropoff[1]/div[2]/form[1]/div[1]/div[7]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]")
	private WebElement flight_Or_train_details;
	
	@FindBy(xpath="//textarea[@formcontrolname='remark']")
	private WebElement remark;
	
	@FindBy(xpath="//input[@id='searchLocation']")
	private WebElement dropp_off_location;
	
	@FindBy(xpath="//button[contains(text(),'Submit')]")
	private WebElement submit;
	
	@FindBy(xpath="//tbody/tr[1]/td[7]/div[1]/ngx-select[1]/div[1]/div[2]/div[1]")
	private WebElement ClickonStatus;
	
	@FindBy(xpath="(//span[contains(text(),'Scheduled')])[2]")
	private WebElement SelectStatus;
	
	@FindBy(xpath="//td[@role='gridcell']")
	private List<WebElement> x;
	
	public dropp_off_request(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		this.driver=driver;
		
	}
	
	public void MenuOption() throws InterruptedException
	{
		menutab.click();
		Thread.sleep(2000);
		
		pickup_Drop.click();
		Thread.sleep(4000);
		
		ClickOn_Drop_Request.click();
		Thread.sleep(2000);
		
		Add_New_DropRequest.click();
		Thread.sleep(3000);
	}
	
	public void FirstName(String data4) throws InterruptedException
	{
		FirstName.sendKeys(data4);
		Thread.sleep(2000);
	}
	
	public void LastName(String data4) throws InterruptedException
	{
		LastName.sendKeys(data4);
		Thread.sleep(2000);
	}
	
	public void MobileNumber(String data4) throws InterruptedException
	{
		MobileNo.sendKeys(data4);
		Thread.sleep(2000);
	}
	
	public void Email(String data4) throws InterruptedException
	{
		Email.sendKeys(data4);
		Thread.sleep(2000);
	}
	public void Guest_Details() throws InterruptedException
	{
		Clickon_No_of_Guest.click();
		Thread.sleep(2000);
		
		Select_No_Guest.click();
		Thread.sleep(2000);
		
		Clickon_Room_No.click();
		Thread.sleep(2000);
		
		Select_Room_No.click();
		Thread.sleep(2000);
		
		Click_ON_Dropp_Date.click();
		Thread.sleep(2000);
		
		Select_Dropp_Date.click();
	
		Thread.sleep(2000);
	
	}
	public void clickondroptime() throws InterruptedException
	{
		Click_ON_Dropp_time.click();
		Thread.sleep(2000);
		
	}
	public void selectdroptime() throws InterruptedException
	{
		Select_ON_Dropp_time.click();
		Thread.sleep(2000);
	}
	public void finalsetup() throws InterruptedException
	{
//		flight_Or_train_details.sendKeys("103");
//		Thread.sleep(2000);
		
		remark.sendKeys("Service is very nice.");
		Thread.sleep(2000);
		
		dropp_off_location.sendKeys("Indore Junction, Chhoti Gwaltoli, Indore, Madhya Pradesh, India");
		Thread.sleep(2000);
		
		submit.click();
		Thread.sleep(4000);
		
		ClickonStatus.click();
		Thread.sleep(2000);
		
		SelectStatus.click();
		
	}
	
	
	
}


