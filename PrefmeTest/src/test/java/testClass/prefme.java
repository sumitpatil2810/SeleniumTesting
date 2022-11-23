package testClass;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import Check_In_Check_Out.CheckIn_CheckOut;
import Check_In_Check_Out.Expected_Arrivals;
import Check_In_Check_Out.Expected_Departures;
import Pick_up_and_Dropp.PickUp_Drop;
import Pick_up_and_Dropp.dropp_off_request;
import Room_Inventory.Room_Inventory;
import Walk_in_Check_in.WalkIn_CheckIn;
import browsers.Base;
import pomClass.Homepage;
import pomClass.LoginPage;
import utils.Utility;

@Test
public class prefme 
{
	WebDriver driver;
	LoginPage login;
	
	Homepage homepage;
	CheckIn_CheckOut checkinandout;
	
	Expected_Arrivals expectedarrivals;
	PickUp_Drop pickupdrop;
	dropp_off_request dropprequest;
	
	WalkIn_CheckIn walkin;
	
	Expected_Departures expected_departure;
	Room_Inventory roominventory;
	
	int row=1;
	SoftAssert soft;
	
	static ExtentTest test;
	static ExtentHtmlReporter reporter;
	
	@Parameters("browserName")
	
	@BeforeTest
	public void launchbrowser(String browser)
	{
		
		reporter = new ExtentHtmlReporter("test-output"+File.separator+"ExtendReport"+File.separator+"Extent.html");
		ExtentReports extend = new ExtentReports();
		extend.attachReporter(reporter);
		
		
		System.out.println(browser);
		if(browser.equals("Chrome"))
		{
			driver=Base.openChromeBrowser();
			
		}
		if(browser.equals("Edge"))
		{
			driver = Base.openEdgeBrowser();
		}
		
		if(browser.equals("Firefox"))
		{
			driver=Base.openFirefoxBrowser();
		}
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	}
	
	@BeforeClass
	public void createpomobject()
	{
		login = new LoginPage(driver);
		homepage = new Homepage(driver);
		checkinandout= new CheckIn_CheckOut(driver);
		pickupdrop=new PickUp_Drop(driver);
		dropprequest=new dropp_off_request(driver);
		walkin= new WalkIn_CheckIn(driver);
		expected_departure=new Expected_Departures(driver);
		roominventory= new Room_Inventory(driver);
		expectedarrivals= new Expected_Arrivals(driver);
	}
	
	@BeforeMethod
	public void logintoApplication() throws InterruptedException, IOException
	{
		driver.get("https://prefme.in/partner/#/login");
	    driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		String data=Utility.getDataFromExcelsheet("Sheet1", 1, 0);
		login.username(data);
		
		data=Utility.getDataFromExcelsheet("Sheet1", 1, 1);
		login.pass(data);
		
		login.login();
		
		Thread.sleep(5000);
			
		soft= new SoftAssert();
	}
//
//	@Test
//	public void verifyCheckin() throws InterruptedException, IOException
//	{
//		String url = driver.getCurrentUrl();
//		String title = driver.getTitle();
//		
//		Assert.assertEquals("https://prefme.in/partner/#/dashboard", url);
//		Assert.assertEquals("Oneguest Partner", title);
//		
//        checkinandout.open();
//        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
//        
//        checkinandout.AddNewReservation();
//        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
//       
//        checkinandout.CheckInDate();
//        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
//       
//        checkinandout.CheckOutDate();
//        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
//       
//       
//        String Data=Utility.GetDataFromExcelsheet("Sheet1", 2, 2);
//        checkinandout.FirstName(Data);
//        
//        Data=Utility.GetDataFromExcelsheet("Sheet1", 2, 3);
//        checkinandout.LastName(Data);
//        
//         Data=Utility.GetDataFromExcelsheet("Sheet1", 2, 4);
//        checkinandout.Email(Data);
//        
//        Data=Utility.GetDataFromExcelsheet("Sheet1", 2, 5);
//        checkinandout.MonileNo(Data);
//       
//        checkinandout.rooms();
//        checkinandout.adult();
//      
//        checkinandout.child();
//
//        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
//      
//        checkinandout.BookingStatus();
//     
//        checkinandout.RoomCategory();
//      
//        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
//        checkinandout.FinalStep();
//
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        row++;
//
//	}

//	@Test
//	
//	public void verifyExpectedArrivalsTab() throws InterruptedException
//	{
//		expectedarrivals.menuoption();
//		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//		
//		expectedarrivals.Expected_ArrivalsInfomation();
//		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//		
//		expectedarrivals.SelectionOfRoom();
//		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//	}
//	
	
	
//	@Test

	
//	@Test
//	
//	public void verifyDroppRequest() throws InterruptedException, IOException
//	{
//		
//		dropprequest.MenuOption();
//		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//		
//		
//		String data4=Utility.getdataFromExcelsheetforDropRequests("Sheet1", 1, 0);
//		
//		dropprequest.FirstName(data4);
//		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//		
//		 data4=Utility.getdataFromExcelsheetforDropRequests("Sheet1", 1, 1);
//		 dropprequest.LastName(data4);
//		 driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//		 
//		 data4=Utility.getdataFromExcelsheetforDropRequests("Sheet1", 1, 2);
//		 dropprequest.MobileNumber(data4);
//		 driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//		 
//		 data4=Utility.getdataFromExcelsheetforDropRequests("Sheet1", 1, 3);
//		 dropprequest.Email(data4);
//		 driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//		 
//		 dropprequest.Guest_Details();
//		 driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//		 
//		 dropprequest.clickondroptime();
//		 driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//		 
//		// data4=Utility.getdataFromExcelsheetforDropRequests("Sheet1", 4, 6);
//		 dropprequest.selectdroptime();
//		 driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//		 
//		 dropprequest.finalsetup();
//		 driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//		 
//	}
//	
//	
	
//	
//	
	
	
	public void verify_WalkIn_CheckInTab() throws InterruptedException, IOException
	{
		String url=driver.getCurrentUrl();
		String title=driver.getTitle();
		
		Assert.assertEquals("https://prefme.in/partner/#/dashboard", url);
		Assert.assertEquals("Oneguest Partner", title);
		
		
		walkin.SelectTag();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		String data1=Utility.getdataFromExcelsheetforCheckIn("waikinlist", 2, 0);
		walkin.FirstName(data1);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		data1=Utility.getdataFromExcelsheetforCheckIn("waikinlist", 2, 1);
		walkin.LastName(data1);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		
		data1=Utility.getdataFromExcelsheetforCheckIn("waikinlist", 2, 2);
		walkin.Email(data1);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		data1=Utility.getdataFromExcelsheetforCheckIn("waikinlist", 2, 3);
		walkin.MobileNo(data1);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		walkin.StayDetails();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		walkin.SelectDate();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		
		walkin.RoomAssigning();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

//	@Test
//	public void verifyExpected_Departures_Tab() throws InterruptedException
//	{
//		expected_departure.Menuoption();
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		
//		expected_departure.GuestDetails();
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//	}
//	
//	@Test()
//	public void VerifyRoomInventory() throws InterruptedException
//	{
//		roominventory.addNewRoom();
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		
//		roominventory.RoomType();
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		
//		roominventory.BasicInformationOfRoom();
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		
//		roominventory.RoomFeatures();
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		
//		roominventory.AmenitiesOfRoomType();
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//	}
	
	@AfterMethod
	public void logoutApplication(ITestResult result) throws IOException, InterruptedException
	{
		if(ITestResult.FAILURE==result.getStatus())
		{
			Utility.captureScreenshot(driver,result.getName());
		}
		   
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		checkinandout.LogOutApplication();
	}
	
	@AfterClass
	public void clearObject()
	{
		login=null;
		//homepage=null;
		checkinandout=null;
		pickupdrop=null;
		dropprequest=null; 
		walkin=null;
		expected_departure=null;
		roominventory=null;
		expectedarrivals=null;
	}
	@AfterTest
	public void closeBrowser()
	{
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.close();
		driver=null;
		System.gc();
	}

}



