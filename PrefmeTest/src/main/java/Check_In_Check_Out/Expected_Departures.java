package Check_In_Check_Out;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Expected_Departures 
{
	WebDriver driver;
	
	@FindBy(xpath="//body/app-root[1]/app-landing[1]/app-sidebar[1]/a[1]/span[1]")
	private WebElement MenuTab;
	
	@FindBy(xpath="//body/app-root[1]/app-landing[1]/app-sidebar[1]/div[1]/div[1]/ul[1]/li[2]/a[1]/i[1]")
	private WebElement Check_In_And_CheckOut ;
	
	@FindBy(xpath="//a[contains(text(),'Expected Arrivals (1)')]")  
	private WebElement Expected_Departures;
	
	@FindBy(xpath="//tbody/tr[1]/td[1]/div[1]/div[2]")
	private WebElement Guest;
	
	@FindBy(xpath="//button[contains(text(),'Send GRC')]")
	private WebElement GRCTab;
	
	@FindBy(xpath="//button[text()='Resend']")
	private WebElement Resend;
	
	@FindBy(xpath="//button[contains(text(),'Send Checkout Form')]")
	private WebElement SendCheckOutFrom;
	
	@FindBy(xpath="//button[text()='Resend']")
	private WebElement resendCheckOutFromHistory;
	
	@FindBy(xpath="//body/app-root[1]/app-landing[1]/div[1]/div[1]/app-guest-details[1]/app-guest[1]/form[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/input[1]")
	private WebElement CheckOutDate;
	
	@FindBy(xpath="//tbody/tr[3]/td[5]")
	private WebElement Selectdate;

	@FindBy(xpath="//button[contains(text(),'Invoice/Payment Mode')]")
	private WebElement PaymentTab;
	
	@FindBy(xpath="//body/app-root[1]/app-landing[1]/div[1]/div[1]/app-guest-details[1]/app-guest[1]/form[1]/div[1]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/ngx-select[1]/div[1]/div[2]/div[1]/span[2]/i[1]")
	private WebElement ClickOnBillStatus;

	@FindBy(xpath="//span[contains(text(),'Paid')]")
	private WebElement SelectBillStatus;

	@FindBy(xpath="//body/app-root[1]/app-landing[1]/div[1]/div[1]/app-guest-details[1]/app-guest[1]/form[1]/div[1]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/select[1]")
	private WebElement ClickOnPaymentTab;

	@FindBy(xpath="//option[contains(text(),'Already Paid')]")
	private WebElement SelectPaymentoption;

	@FindBy(xpath="//body/app-root[1]/app-landing[1]/div[1]/div[1]/app-guest-details[1]/app-guest[1]/form[1]/div[1]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/input[1]")
	private WebElement Amount;

	@FindBy(xpath="//body/app-root[1]/app-landing[1]/div[1]/div[1]/app-guest-details[1]/app-guest[1]/form[1]/div[1]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/textarea[1]")
	private WebElement Remarks;

	@FindBy(xpath="//button[text()='Resend']")
	private WebElement resend1;
	
	@FindBy(xpath="//button[contains(text(),'Checkout')]")
	private WebElement CheckOut;

	@FindBy(xpath="//button[text()='Resend']")
	private WebElement resend;
	
	@FindBy(xpath="//button[contains(text(),'Yes')]")
	private WebElement Yesbutton;
	
	public Expected_Departures(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	public void Menuoption() throws InterruptedException
	{
		MenuTab.click();
		Thread.sleep(2000);
		Check_In_And_CheckOut.click();
		Thread.sleep(2000);
		Expected_Departures.click();
		Thread.sleep(5000);
		
	}
	public void GuestDetails() throws InterruptedException
	{
		Thread.sleep(4000);
		Guest.click();
		Thread.sleep(2000);
		
		GRCTab.click();
		Thread.sleep(2000);

		Resend.click();
	    Thread.sleep(2000);
	
		SendCheckOutFrom.click();
		Thread.sleep(2000);
		
		//resendCheckOutFromHistory.click();
		Thread.sleep(2000);
		
		CheckOutDate.click();
		Thread.sleep(2000);
		
		Selectdate.click();
		Thread.sleep(2000);
		
		PaymentTab.click();
		Thread.sleep(2000);
		
		ClickOnBillStatus.click();
		Thread.sleep(2000);
		
		SelectBillStatus.click();
		Thread.sleep(2000);
		
		ClickOnPaymentTab.click();
		Thread.sleep(2000);
		
		SelectPaymentoption.click();
		Thread.sleep(2000);
		
		Amount.sendKeys("10000");
		Thread.sleep(2000);
		
		Remarks.sendKeys("Service is Good.");
		Thread.sleep(2000);
		
		resend1.click();
		Thread.sleep(2000);
		
		CheckOut.click();
		Thread.sleep(2000);
		
		resend.click();
		Thread.sleep(2000);
		
		Yesbutton.click();

		
	}
	
}