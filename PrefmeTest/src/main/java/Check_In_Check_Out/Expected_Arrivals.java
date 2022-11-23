package Check_In_Check_Out;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Expected_Arrivals
{
	WebDriver driver;
	
	@FindBy(xpath="//body/app-root[1]/app-landing[1]/app-sidebar[1]/a[1]")
	private WebElement menutab;
	
	@FindBy(xpath="//body/app-root[1]/app-landing[1]/app-sidebar[1]/div[1]/div[1]/ul[1]/li[2]/a[1]/i[1]")
	private WebElement clickOnCheckInandCheckOut;

	@FindBy(xpath="//h6[contains(text(),'Komal patil')]")
	private WebElement clickOnGuestName;
	
	@FindBy(xpath="//body/app-root[1]/app-landing[1]/div[1]/div[1]/app-guest-details[1]/app-guest[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/ngx-select[1]/div[1]/div[2]/div[1]")
	private WebElement clickOnTag;
	
	@FindBy(xpath="//span[text()='VIP']")
	private WebElement SelectTag;

	@FindBy(xpath="//button[contains(text(),'Send Online Check-in Form')]")
	private WebElement sendonlinecheckinform;
	
	@FindBy(xpath="//button[contains(text(),'Resend')]")
	private WebElement ResendTab;
	
	@FindBy(xpath="//button[contains(text(),'Send GRC')]")
	private WebElement sendGRC;
	
	@FindBy(xpath="//button[contains(text(),'Resend')]")
	private WebElement resendGRC;
	
	@FindBy(xpath="//button[contains(text(),'Oneguest app Link')]")
	private WebElement oneguestApplink;
	
	@FindBy(xpath="//body/app-root[1]/app-landing[1]/div[1]/div[1]/app-guest-details[1]/app-guest[1]/form[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/input[1]")
	private WebElement ClickOnArrivalDate;
	
	@FindBy(xpath="//span[contains(text(),'18')]")
	private WebElement SelectArrivalDate;
	
	@FindBy(xpath="//body/app-root[1]/app-landing[1]/div[1]/div[1]/app-guest-details[1]/app-guest[1]/form[1]/div[1]/div[2]/div[1]/div[2]/div[3]/div[1]/input[1]")
	private WebElement ClickOnDepartureDate;
	
	@FindBy(xpath="//span[contains(text(),'19')]")
	private WebElement SelectDepartureDate;
	
	@FindBy(xpath="//body/app-root[1]/app-landing[1]/div[1]/div[1]/app-guest-details[1]/app-guest[1]/form[1]/div[1]/div[2]/div[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/h2[1]/div[1]/button[1]")
	private WebElement ClickOnSelectRoom ;
	
	@FindBy(xpath="//input[@id='No']")
	private WebElement ClickOnsmooking_prefrences ;
	
	@FindBy(xpath="//label[text()=' Economy ']")
	private WebElement ClickOnRoomName ;
	
	@FindBy(xpath="//h3[contains(text(),'601')]")
	private WebElement ClickOnRoomNumber ;
	
	@FindBy(xpath="//button[contains(text(),'Assign Room')]")
	private WebElement ClickOnAssignRoom ;

	@FindBy(xpath="//body/app-root[1]/app-landing[1]/div[1]/div[1]/app-guest-details[1]/app-guest[1]/form[1]/div[1]/div[2]/div[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/h2[1]/div[1]/button[2]/span[1]/span[1]")
	private WebElement deleteroom;
	
	@FindBy(xpath="//body/app-root[1]/app-landing[1]/div[1]/div[1]/app-guest-details[1]/app-guest[1]/form[1]/div[1]/div[2]/div[1]/div[6]/div[1]/div[1]/div[1]/textarea[1]")
	private WebElement ClickOnAdditionalNote;
	
	@FindBy(xpath="//button[text()='Update']")
	private WebElement ClickOnUpdateTab;
	
	@FindBy(xpath="//body/app-root[1]/app-landing[1]/div[1]/div[1]/app-guest-details[1]/app-guest[1]/form[1]/div[1]/div[2]/div[2]/button[3]")
	private WebElement ClickOnCheckIn;
	//body/app-root[1]/app-landing[1]/div[1]/div[1]/app-guest-details[1]/app-guest[1]/form[1]/div[1]/div[2]/div[2]/button[3]
	@FindBy(xpath="//button[contains(text(),'Cancel Booking')]")
	private WebElement cancelbooking;
	
	public Expected_Arrivals(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
		
	}
	public void menuoption() throws InterruptedException
	{
		menutab.click();
		Thread.sleep(2000);
		
		clickOnCheckInandCheckOut.click();
		Thread.sleep(2000);	
		
	}
	
	public void Expected_ArrivalsInfomation() throws InterruptedException
	{
		clickOnGuestName.click();
		Thread.sleep(2000);
		
		clickOnTag.click();
		Thread.sleep(2000);
		
		SelectTag.click();
		Thread.sleep(2000);
		
		sendonlinecheckinform.click();
		Thread.sleep(2000);
		
		ResendTab.click();
		Thread.sleep(2000);
		
		sendGRC.click();
		Thread.sleep(2000);
		
		resendGRC.click();
		Thread.sleep(2000);
		
		ClickOnArrivalDate.click();
		Thread.sleep(2000);
		
		SelectArrivalDate.click();
		Thread.sleep(2000);
		
		ClickOnDepartureDate.click();
		Thread.sleep(2000);
		
		SelectDepartureDate.click();
		Thread.sleep(2000);
	}
	
	public void SelectionOfRoom() throws InterruptedException
	{
		ClickOnSelectRoom.click();
		Thread.sleep(2000);
		
		ClickOnsmooking_prefrences.click();
		Thread.sleep(2000);
		
		ClickOnRoomName.click();
		Thread.sleep(2000);
		
		ClickOnRoomNumber.click();
		Thread.sleep(2000);
		
		ClickOnAssignRoom.click();
		Thread.sleep(5000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", deleteroom);
		Thread.sleep(2000);
		
		ClickOnAdditionalNote.sendKeys("Service is Best");
		Thread.sleep(2000);
		
		ClickOnUpdateTab.click();
		Thread.sleep(4000);
		
		ClickOnCheckIn.click();
		Thread.sleep(4000);
		
	}

}
