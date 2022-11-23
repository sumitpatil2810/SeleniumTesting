package Pick_up_and_Dropp;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.Utility;

public class PickUp_Drop
{
	WebDriver Driver;
	
	@FindBy(xpath="//body/app-root[1]/app-landing[1]/app-sidebar[1]/a[1]/span[1]")
	private WebElement Menutab;
	
	@FindBy(xpath="//body/app-root[1]/app-landing[1]/app-sidebar[1]/div[1]/div[1]/ul[1]/li[4]/a[1]/i[1]")
	private WebElement PickUpAndDrop;
	
	@FindBy(xpath="//button[text()='  Add New Pickup ']")
	private WebElement AddNewPickUp;
	
	@FindBy(xpath="//body/modal-container[1]/div[2]/div[1]/add-pickup[1]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]")
	private WebElement FirstName;
	
	@FindBy(xpath="//body/modal-container[1]/div[2]/div[1]/add-pickup[1]/div[2]/form[1]/div[1]/div[2]/div[1]/input[1]")
	private WebElement LastName;
	
	@FindBy(xpath="//body/modal-container[1]/div[2]/div[1]/add-pickup[1]/div[2]/form[1]/div[1]/div[3]/div[1]/div[1]/input[1]")
	private WebElement MobileNo;
	
	@FindBy(xpath="//body/modal-container[1]/div[2]/div[1]/add-pickup[1]/div[2]/form[1]/div[1]/div[4]/div[1]/input[1]")
	private WebElement Email;
	
	@FindBy(xpath="//body/modal-container[1]/div[2]/div[1]/add-pickup[1]/div[2]/form[1]/div[1]/div[5]/div[1]/div[1]/ngx-select[1]/div[1]/div[2]/div[1]/span[2]/i[1]")
	private WebElement NoofGuest;
	
	@FindBy(xpath="//body/modal-container[1]/div[2]/div[1]/add-pickup[1]/div[2]/form[1]/div[1]/div[5]/div[1]/div[1]/ngx-select[1]/div[1]/ul[1]/li[2]/a[1]")
	private WebElement SelectGuest;
	
	@FindBy(xpath="//body/modal-container[1]/div[2]/div[1]/add-pickup[1]/div[2]/form[1]/div[1]/div[6]/div[1]/div[1]/div[1]/div[1]/input[1]")
	private WebElement PickUpDate;
	
//	@FindBy(xpath="//span[contains(text(),'21')]")
//	private WebElement SelectDate;
	
	@FindBy(xpath="//body/bs-datepicker-container[1]/div[1]/div[1]")
	private WebElement SelectDate;
	
	@FindBy(xpath="//body/modal-container[1]/div[2]/div[1]/add-pickup[1]/div[2]/form[1]/div[1]/div[6]/div[1]/div[2]/div[1]/div[1]/ngx-select[1]/div[1]/div[2]/div[1]")
	private WebElement PickUpTime;  
	
	@FindBy(xpath="/html[1]/body[1]/modal-container[1]/div[2]/div[1]/add-pickup[1]/div[2]/form[1]/div[1]/div[6]/div[1]/div[2]/div[1]/div[1]/ngx-select[1]/div[1]/ul[1]/li[8]/a[1]/span[1]")
	private WebElement SelectTime;
	
	@FindBy(xpath="//input[@id='searchLocation']")
	private WebElement PickUpLocation;
	
	@FindBy(xpath="")
	private WebElement SelectLocation;
	
	@FindBy(xpath="//body/modal-container[1]/div[2]/div[1]/add-pickup[1]/div[2]/form[1]/div[1]/div[8]/div[1]/textarea[1]")
	private WebElement Remark;
	
	@FindBy(xpath="//button[contains(text(),'Submit')]")
	private WebElement Submit;
	
	@FindBy(xpath="//tbody/tr[1]/td[6]/div[1]/ngx-select[1]/div[1]/div[2]/div[1]/span[2]/i[1]")
	private WebElement status;
	
	@FindBy(xpath="//span[contains(text(),'Scheduled')]")
	private WebElement selectstatus;
	
	
	public PickUp_Drop(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.Driver=driver;
	}

	public void PickUpAndDrop() throws InterruptedException
	{
		Menutab.click();
		Thread.sleep(2000);
		PickUpAndDrop.click();
		Thread.sleep(2000);
		AddNewPickUp.click();	
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
	
	public void MobileNo(String data1) throws InterruptedException
	{
		MobileNo.sendKeys(data1);
		Thread.sleep(2000);
	}
	
	public void Email(String data1) throws InterruptedException
	{
		Email.sendKeys(data1);
		Thread.sleep(2000);	
	}
	
	public void GuestInfo() throws InterruptedException
	{
		NoofGuest.click();
		Thread.sleep(2000);
		SelectGuest.click();
		
		PickUpDate.click();
		Thread.sleep(2000);
	}
	public void selectdate(String dataa) throws InterruptedException
	{
		SelectDate.sendKeys(dataa);
		Thread.sleep(3000);
	}
		
	public void pickuptime() throws InterruptedException
	{
		PickUpTime.click();
		Thread.sleep(3000);	
		SelectTime.click();
	}

	public void PickUpLOcation(String data1) throws InterruptedException
	{
		PickUpLocation.sendKeys(data1);
		Thread.sleep(2000);	
	}
	public void FinalStep(String data1) throws InterruptedException
	{
		Remark.sendKeys(data1);
		Thread.sleep(2000);
	}
	public void status() throws InterruptedException
	{
		Submit.click();
		Thread.sleep(2000);
		
		status.click();
		Thread.sleep(2000);
		selectstatus.click();
	}	
	
	
	
	
	
	
	
	
	
	
}