package Check_In_Check_Out;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckIn_CheckOut 
{

	WebDriver driver;
	WebDriverWait wait;
	
	@FindBy(xpath="//body/app-root[1]/app-landing[1]/app-sidebar[1]/a[1]")  //body/app-root[1]/app-landing[1]/app-sidebar[1]/a[1]
	private WebElement menutab;
	
	@FindBy(xpath="//body/app-root[1]/app-landing[1]/app-sidebar[1]/div[1]/div[1]/ul[1]/li[2]/a[1]/i[1]")
	private WebElement CheckinAndCheckout;
	
	@FindBy(xpath="(//a[@routerlinkactive='active-link'])[1]")
	private WebElement ExpectedArrivals;
	
	@FindBy(xpath="//button[@class='btn table-filter filter-on']")
	private WebElement TodayTab;
	
	@FindBy(xpath="(//button[@class=\"btn table-filter\"])[1]")
	private WebElement TomorrowTtab;
	
	@FindBy(xpath="(//button[@class='btn table-filter'])[2]")
	private WebElement AllGuestsTab;
	
	@FindBy(xpath="//body/app-root[1]/app-landing[1]/div[1]/div[1]/app-checkin-checkout[1]/div[2]/app-expected-arrivals[1]/div[1]/div[1]/div[2]/button[1]")
	private WebElement AddNewReservationtab;
	
	@FindBy(xpath="//body/modal-container[1]/div[2]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]")
	private WebElement CheckInDate;
	
	//body/modal-container[1]/div[2]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]
	
	@FindBy(xpath="//span[text()='22']")
	private WebElement SelectDate;
	
	@FindBy(xpath="//body/modal-container[1]/div[2]/div[1]/form[1]/div[2]/div[1]/div[2]/div[1]/div[1]/input[1]")
	private WebElement CheckOutDate;
	
	
	//body/modal-container[1]/div[2]/div[1]/form[1]/div[2]/div[1]/div[2]/div[1]/div[1]/input[1]
	
	
	@FindBy(xpath="//tbody/tr[4]/td[4]")
	private WebElement selectdate;
	
	@FindBy(xpath="//input[@name='firstName']")
	private WebElement FirstName;
	
	@FindBy(xpath="//input[@name='lastName']")
	private WebElement LastName;
	
	@FindBy(xpath="//input[@formcontrolname='email']")
	private WebElement Email;
	
	@FindBy(xpath="//input[@name='mobNo']")
	private WebElement MobileNo;
	
	@FindBy(xpath="//body/modal-container[1]/div[2]/div[1]/form[1]/div[2]/div[1]/div[7]/div[1]/div[1]/ngx-select[1]/div[1]/div[2]/div[1]/span[2]/i[1]")
	private WebElement NoOfRooms;
	
	@FindBy(xpath="//span[text()='1']")
	private WebElement room;
	
	@FindBy(xpath="//body/modal-container[1]/div[2]/div[1]/form[1]/div[2]/div[1]/div[8]/div[1]/div[1]/div[1]/div[1]/ngx-select[1]/div[1]/div[2]/div[1]")
	private WebElement Adult;
	
	@FindBy(xpath="//body/modal-container[1]/div[2]/div[1]/form[1]/div[2]/div[1]/div[8]/div[1]/div[1]/div[1]/div[1]/ngx-select[1]/div[1]/ul[1]/li[1]/a[1]/span[1]")
	private WebElement selectadult;
	
	@FindBy(xpath="//body/modal-container[1]/div[2]/div[1]/form[1]/div[2]/div[1]/div[8]/div[1]/div[2]/div[1]/div[1]/ngx-select[1]/div[1]/div[2]/div[1]/span[2]/i[1]")
	private WebElement child;
	
	@FindBy(xpath="//body/modal-container[1]/div[2]/div[1]/form[1]/div[2]/div[1]/div[8]/div[1]/div[2]/div[1]/div[1]/ngx-select[1]/div[1]/ul[1]/li[1]/a[1]/span[1]")
	private WebElement selectchild;
	
	@FindBy(xpath="//body/modal-container[1]/div[2]/div[1]/form[1]/div[2]/div[1]/div[9]/div[1]/div[1]/ngx-select[1]/div[1]/div[2]/div[1]/span[2]/i[1] ")
	private WebElement BookingStatus;
	
	@FindBy(xpath="//body/modal-container[1]/div[2]/div[1]/form[1]/div[2]/div[1]/div[9]/div[1]/div[1]/ngx-select[1]/div[1]/ul[1]/li[1]/a[1]/span[1]/span[1]")
	private WebElement SelectbookingStatus;
	
	@FindBy(xpath="//body/modal-container[1]/div[2]/div[1]/form[1]/div[2]/div[1]/div[10]/div[1]/div[1]/ngx-select[1]/div[1]/div[2]/div[1]")
	private WebElement RoomCategory;
	
	@FindBy(xpath="//span[contains(text(),'Murphy')]")
	private WebElement selectroomcategory;
	
	@FindBy(xpath="//label[text()=' Send Online Check-in Form ']")
	private WebElement SendOnlinecheckInForm;
	
	@FindBy(xpath="//button[text()='Submit']")
	private WebElement Submit;
	
	@FindBy(xpath="//h4[contains(text(),'Sumit')]")  //h4[contains(text(),'Sumit')]///h4[contains(text(),'Sumit')]
	private WebElement sumittab;
	
	@FindBy(xpath="//a[contains(text(),'Logout')]")   //a[contains(text(),'Logout')]
	private WebElement logout;
	
	@FindBy(xpath="//button[contains(text(),'Yes')]")  //button[contains(text(),'Yes')]
	private WebElement yestab;
	
	public CheckIn_CheckOut(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	public void open() 
	{
	     
		Actions act = new Actions(driver);
		act.moveToElement(menutab).click();
		act.moveToElement(CheckinAndCheckout).click().perform();
	}
	public void AddNewReservation()
	{
		AddNewReservationtab.click();	
		
	}
	public void CheckInDate () throws InterruptedException
	{
		CheckInDate.click();
		Thread.sleep(2000);
		SelectDate.click();
	}

	public void CheckOutDate() throws InterruptedException
	{
		CheckOutDate.click();
		Thread.sleep(2000);
		
		selectdate.click();
		Thread.sleep(2000);
	}
	public void FirstName(String Data) throws InterruptedException
	{
		FirstName.sendKeys(Data);
		Thread.sleep(2000);	
	}
	
	public void LastName(String Data) throws InterruptedException
	{
		LastName.sendKeys(Data);
		Thread.sleep(2000);
	}
	public void Email(String Data) throws InterruptedException
	{
		Email.sendKeys(Data);
		Thread.sleep(2000);
	}
	public void MonileNo(String Data ) throws InterruptedException
	{
		MobileNo.sendKeys(Data);
		Thread.sleep(2000);
	}
	public void rooms() throws InterruptedException
	{
		NoOfRooms.click();
		Thread.sleep(2000);
		room.click();
	}
	
	public void adult() throws InterruptedException
	{
		Adult.click();
		Thread.sleep(2000);
		selectadult.click();
		
	}
	public void child() throws InterruptedException
	{
		child.click();
		Thread.sleep(2000);
		selectchild.click();
	
	}
	public void BookingStatus() throws InterruptedException
	{
		BookingStatus.click();
		Thread.sleep(2000);
		SelectbookingStatus.click();
		
	}
	public void RoomCategory() throws InterruptedException
	{
		RoomCategory.click();
		Thread.sleep(2000);
		selectroomcategory.click();
	
	}
	public void FinalStep() throws InterruptedException
	{
		SendOnlinecheckInForm.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		Submit.click();
		Thread.sleep(2000);
	}
	
	public void LogOutApplication() throws InterruptedException
	{
		
		sumittab.click();
		Thread.sleep(2000);
		
		logout.click();
		Thread.sleep(2000);
	
		yestab.click();
		Thread.sleep(2000);
	
	}


}

