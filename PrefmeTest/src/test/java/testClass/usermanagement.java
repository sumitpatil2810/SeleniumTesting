package testClass;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
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
import Check_In_Check_Out.Expected_Departures;
import Room_Inventory.Room_Inventory;
import UserManagement.AccessRoleGroup;
import UserManagement.AddNewSubUser;
import browsers.Base;
import pomClass.Homepage;
import pomClass.LoginPage;
import utils.Utility;

public class usermanagement 
{
	WebDriver driver;
	LoginPage login;
	CheckIn_CheckOut checkinandout;
	AccessRoleGroup accessroleGroup;
	AddNewSubUser addnewsubuser;
	
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
		checkinandout= new CheckIn_CheckOut(driver);
		accessroleGroup=new AccessRoleGroup(driver);
		addnewsubuser = new AddNewSubUser(driver);
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
	
	@Test(priority=1)
	public void verifyUserManagementTab() throws InterruptedException
	{
		accessroleGroup.MenuOption();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		accessroleGroup.AddRoleGroup();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	@Test(priority=2)
	public void verifyAddNewSubUserTab() throws InterruptedException, IOException
	{
		addnewsubuser.addnewsubuser();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		String data3=Utility.getdataFromExcelsheetforUserManagement("Sheet1", 1, 0);
		addnewsubuser.Designation(data3);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		data3=Utility.getdataFromExcelsheetforUserManagement("Sheet1", 1, 1);
		addnewsubuser.Email(data3);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		data3=Utility.getdataFromExcelsheetforUserManagement("Sheet1", 1, 2);
		addnewsubuser.FirstName(data3);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		data3=Utility.getdataFromExcelsheetforUserManagement("Sheet1", 1, 3);
		addnewsubuser.LastName(data3);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		data3=Utility.getdataFromExcelsheetforUserManagement("Sheet1", 1, 4);
		addnewsubuser.MobileNo(data3);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		data3=Utility.getdataFromExcelsheetforUserManagement("Sheet1", 1, 5);
		addnewsubuser.Password(data3);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		addnewsubuser.subUserInformation();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
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
		checkinandout=null;
		accessroleGroup=null;
		addnewsubuser=null;
	
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
