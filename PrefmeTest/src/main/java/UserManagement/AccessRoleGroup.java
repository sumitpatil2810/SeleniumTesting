package UserManagement;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccessRoleGroup
{

	WebDriver driver;
	
	@FindBy(xpath="//body/app-root[1]/app-landing[1]/app-sidebar[1]/a[1]")
	private WebElement menuTAB;
	
	@FindBy(xpath="//span[contains(text(),'User Management')]")
	private WebElement usermanagementtab;

	@FindBy(xpath="//a[contains(text(),'Access Role Group')]")
	private WebElement accessroleGroup;
	
	@FindBy(xpath="//input[@formcontrolname='groupName']")
	private WebElement rolegroupname;
	
	@FindBy(xpath="//label[contains(text(),'Check-in & Checkout')]")
	private WebElement Checkin_Checkout;
	
	@FindBy(xpath="//label[contains(text(),'Preferences')]")
	private WebElement Preferences;
	
	@FindBy(xpath="//label[contains(text(),'User Management')]")
	private WebElement UserManagement;
	
	@FindBy(xpath="//label[text()='Hotel Profile']")
	private WebElement HotelProfile;
	
	@FindBy(xpath="//label[contains(text(),'Room Inventory')]")
	private WebElement RoomInventory;
	
	@FindBy(xpath="//body/app-root[1]/app-landing[1]/div[1]/div[1]/app-user-management[1]/div[1]/div[1]/app-access-role-group[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[6]/div[1]/div[1]/label[1]")
	private WebElement services;

	@FindBy(xpath="//label[contains(text(),'Food & Dining')]")
	private WebElement FoodDining;
	
	@FindBy(xpath="//label[contains(text(),'Multilingual Chat')]")
	private WebElement MultilingualChat;
	
	@FindBy(xpath="//label[contains(text(),'Referral Program')]")
	private WebElement ReferralProgram;
	
	@FindBy(xpath="//body/app-root[1]/app-landing[1]/div[1]/div[1]/app-user-management[1]/div[1]/div[1]/app-access-role-group[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[10]/div[1]/div[1]/label[1]")
	private WebElement Billing;
	
	@FindBy(xpath="//label[contains(text(),'Activity Log')]")
	private WebElement AcitivityLog;
	
	@FindBy(xpath="//label[contains(text(),'Notification')]")
	private WebElement Notification;
	
	@FindBy(xpath="//button[contains(text(),'Create New Group')]")
	private WebElement CreateNewGroup;
	
	@FindBy(xpath="//button[contains(text(),'Reset Group')]")
	private WebElement ResetGroup;
	
	
	public AccessRoleGroup(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}

	public void MenuOption() throws InterruptedException
	{
		menuTAB.click();
		Thread.sleep(2000);
		
		usermanagementtab.click();
		Thread.sleep(2000);
		
		accessroleGroup.click();
		Thread.sleep(2000);
	}
	
	public void AddRoleGroup() throws InterruptedException
	{
		rolegroupname.sendKeys("Admin");
		Thread.sleep(2000);
		
		Checkin_Checkout.click();
		Thread.sleep(2000);
		
		Preferences.click();
		Thread.sleep(2000);
		
		JavascriptExecutor jd= (JavascriptExecutor)driver;
		jd.executeScript("arguments[0].click()", UserManagement);
		Thread.sleep(4000);
		
		JavascriptExecutor jt= (JavascriptExecutor)driver;
		jt.executeScript("arguments[0].click()", HotelProfile);
		Thread.sleep(4000);
		
		RoomInventory.click();
		Thread.sleep(2000);
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", services);
		Thread.sleep(4000);
		
		FoodDining.click();
		Thread.sleep(2000);
		
		JavascriptExecutor s= (JavascriptExecutor)driver;
		s.executeScript("arguments[0].click()", MultilingualChat);
		Thread.sleep(4000);
		
		JavascriptExecutor t= (JavascriptExecutor)driver;
		t.executeScript("arguments[0].click()", ReferralProgram);
		
		JavascriptExecutor p= (JavascriptExecutor)driver;
		p.executeScript("arguments[0].click()", Billing);
		Thread.sleep(4000);
		
		AcitivityLog.click();
		Thread.sleep(2000);
		
		Notification.click();
		Thread.sleep(4000);
		
		JavascriptExecutor q= (JavascriptExecutor)driver;
		q.executeScript("arguments[0].click()", CreateNewGroup);
		Thread.sleep(2000);
		
	//	ResetGroup.click();
			
	}
}
