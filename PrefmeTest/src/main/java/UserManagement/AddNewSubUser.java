package UserManagement;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNewSubUser 
{
	WebDriver driver;
	
	
	@FindBy(xpath="//body/app-root[1]/app-landing[1]/app-sidebar[1]/a[1]")
	private WebElement menuTAB;
	
	@FindBy(xpath="//span[contains(text(),'User Management')]")
	private WebElement usermanagementtab;
	
	@FindBy(xpath="//a[contains(text(),'Add New Sub-user')]")
	private WebElement AddNewSubuser; 
	
	@FindBy(xpath="//body/app-root[1]/app-landing[1]/div[1]/div[1]/app-user-management[1]/div[1]/div[1]/app-add-new-sub-user[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/ngx-select[1]/div[1]/div[2]/div[1]")
	private WebElement clickOnDeparment; 
	
	@FindBy(xpath="//body/app-root[1]/app-landing[1]/div[1]/div[1]/app-user-management[1]/div[1]/div[1]/app-add-new-sub-user[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/ngx-select[1]/div[1]/ul[1]/li[6]/a[1]")
	private WebElement SelectDepartment; 
	
	@FindBy(xpath="//input[@formcontrolname='designation']")
	private WebElement SelectDesignation; 
	
	@FindBy(xpath="//input[@formcontrolname='email']")
	private WebElement SelectEmail; 
	
	@FindBy(xpath="//input[@formcontrolname='firstName']")
	private WebElement SelectFirstName; 
	
	@FindBy(xpath="//input[@formcontrolname='lastName']")
	private WebElement SelectLastName; 
	
	@FindBy(xpath="//input[@formcontrolname='mobile']")
	private WebElement SelectMobileNo; 
	
	@FindBy(xpath="//input[@formcontrolname='password']")
	private WebElement SelectPassword; 
	
	@FindBy(xpath="//body/app-root[1]/app-landing[1]/div[1]/div[1]/app-user-management[1]/div[1]/div[1]/app-add-new-sub-user[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[6]/div[2]/div[1]/div[1]/ngx-select[1]/div[1]/div[2]/div[1]")
	private WebElement ClickOnID; 
	
	@FindBy(xpath="//span[text()='59144011']")
	private WebElement SelectID; 
	
	@FindBy(xpath="//body/app-root[1]/app-landing[1]/div[1]/div[1]/app-user-management[1]/div[1]/div[1]/app-add-new-sub-user[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[7]/div[1]/ngx-select[1]/div[1]/div[2]/div[1]/span[2]/i[1]")
	private WebElement ClickAccessRoleGroup; 
	
	@FindBy(xpath="//span[contains(text(),'IT Head')]")
	private WebElement SelectAccessRoleGroup; 
	
	@FindBy(xpath="//button[text()='Create New User']") 
	private WebElement CreateNewUser; 
	
	public AddNewSubUser(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}

	public void addnewsubuser() throws InterruptedException
	{
		menuTAB.click();
		Thread.sleep(2000);
		
		usermanagementtab.click();
		Thread.sleep(2000);
		
		AddNewSubuser.click();
		Thread.sleep(2000);

		clickOnDeparment.click();
		Thread.sleep(2000);
		
		SelectDepartment.click();
		Thread.sleep(2000);
	}
	public void Designation(String data3) throws InterruptedException 
	{

		SelectDesignation.sendKeys(data3);
		Thread.sleep(2000);
	}
		
		public void Email(String data3) throws InterruptedException
		{
			SelectEmail.sendKeys(data3);
			Thread.sleep(2000);
		}
		
		public void FirstName(String data3) throws InterruptedException
		{
			SelectFirstName.sendKeys(data3);
			Thread.sleep(2000);
		}
		
		public void LastName(String data3) throws InterruptedException
		{
			SelectLastName.sendKeys(data3);
			Thread.sleep(2000);
			
		}

		public void MobileNo(String data3) throws InterruptedException
		{
			SelectMobileNo.sendKeys(data3);
			Thread.sleep(2000);
		}
		
		public void Password(String data3) throws InterruptedException
		{
			SelectPassword.sendKeys(data3);
			Thread.sleep(4000);
		}
		
		public void subUserInformation() throws InterruptedException
		{
			
		ClickOnID.click();
		Thread.sleep(2000);
		
		JavascriptExecutor ot= (JavascriptExecutor)driver;
		ot.executeScript("arguments[0].click()", SelectID);
		Thread.sleep(4000);
		
		JavascriptExecutor xpppx= (JavascriptExecutor)driver;
		xpppx.executeScript("arguments[0].click()", ClickAccessRoleGroup);
		Thread.sleep(4000);

		JavascriptExecutor xx= (JavascriptExecutor)driver;
		xx.executeScript("arguments[0].click()", SelectAccessRoleGroup);
		Thread.sleep(4000);

		JavascriptExecutor st= (JavascriptExecutor)driver;
		st.executeScript("arguments[0].click()", CreateNewUser);
		
	}
}
