package Room_Inventory;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Room_Inventory 
{
	WebDriver driver ;
	
	@FindBy(xpath="//body/app-root[1]/app-landing[1]/app-sidebar[1]/a[1]/span[2]")
	private WebElement MenuTab1;
	
	@FindBy(xpath="//i[@class='icon-room-inventory']")
	private WebElement Room_Inventory_Tab;
	
	@FindBy(xpath="//body/app-root[1]/app-landing[1]/div[1]/div[1]/app-room-inventory[1]/div[1]/div[1]/app-add-new-room[1]/app-add-update-room[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]")
	private WebElement Display_Room;
	
	@FindBy(xpath="//body/app-root[1]/app-landing[1]/div[1]/div[1]/app-room-inventory[1]/div[1]/div[1]/app-add-new-room[1]/app-add-update-room[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/ngx-select[1]/div[1]/div[2]/div[1]/span[2]/i[1]")
	private WebElement ClickOn_smoking_policy;
	
	@FindBy(xpath="//span[contains(text(),'Non-Smoking')]")
	private WebElement Select_smoking_policy;
	
	@FindBy(xpath="//input[@id='34']")
	private WebElement selected_floor;
	
	@FindBy(xpath="//body/app-root[1]/app-landing[1]/div[1]/div[1]/app-room-inventory[1]/div[1]/div[1]/app-add-new-room[1]/app-add-update-room[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/input[1]")
	private WebElement No_of_Guests;
	
	@FindBy(xpath="//body/app-root[1]/app-landing[1]/div[1]/div[1]/app-room-inventory[1]/div[1]/div[1]/app-add-new-room[1]/app-add-update-room[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/ngx-select[1]/div[1]/div[2]/div[1]")
	private WebElement ClickON_Primary_BedType;
	
	@FindBy(xpath="//span[contains(text(),'King')]") 
	private WebElement Select_Primary_BedType;
	 
	@FindBy(xpath="(//span[@class='ngx-select__toggle-buttons'])[5]")
	private WebElement Click_on_No_Of_Primary_Beds;
	
	@FindBy(xpath="//span[text()='1']")
	private WebElement Select_No_Of_Primary_Beds;
	
	@FindBy(xpath="//body/app-root[1]/app-landing[1]/div[1]/div[1]/app-room-inventory[1]/div[1]/div[1]/app-add-new-room[1]/app-add-update-room[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/ngx-select[1]/div[1]/div[2]/div[1]")
	private WebElement ClickON_Additional_BedTYpe;
	
	@FindBy(xpath="//span[contains(text(),'Queen')]")
	private WebElement Select_Additional_BedTYpe;
	
	@FindBy(xpath="//body/app-root[1]/app-landing[1]/div[1]/div[1]/app-room-inventory[1]/div[1]/div[1]/app-add-new-room[1]/app-add-update-room[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[3]/div[2]/div[1]/div[1]/ngx-select[1]/div[1]/div[2]/div[1]")
	private WebElement Click_ON_Additional_No_Of_Beds;
	
	@FindBy(xpath="//body/app-root[1]/app-landing[1]/div[1]/div[1]/app-room-inventory[1]/div[1]/div[1]/app-add-new-room[1]/app-add-update-room[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[3]/div[2]/div[1]/div[1]/ngx-select[1]/div[1]/ul[1]/li[2]/a[1]/span[1]")
	private WebElement Select_Additional_No_Of_Beds;
	
	@FindBy(xpath="//body/app-root[1]/app-landing[1]/div[1]/div[1]/app-room-inventory[1]/div[1]/div[1]/app-add-new-room[1]/app-add-update-room[1]/form[1]/div[2]/div[1]/div[1]/div[2]/button[1]")
	private WebElement click_On_ADD_Tab;
	
	@FindBy(xpath="//body/app-root[1]/app-landing[1]/div[1]/div[1]/app-room-inventory[1]/div[1]/div[1]/app-add-new-room[1]/app-add-update-room[1]/form[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/input[1]")
	private WebElement Room_Floor_Level;
	
	@FindBy(xpath="//body/app-root[1]/app-landing[1]/div[1]/div[1]/app-room-inventory[1]/div[1]/div[1]/app-add-new-room[1]/app-add-update-room[1]/form[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/ngx-select[1]/div[1]/div[2]/div[1]/span[2]/i[1]")
	private WebElement Click_Room_type;
	
	@FindBy(xpath="//span[contains(text(),'Single Room')]")
	private WebElement Select_Room_type;
	
	@FindBy(xpath="//body/app-root[1]/app-landing[1]/div[1]/div[1]/app-room-inventory[1]/div[1]/div[1]/app-add-new-room[1]/app-add-update-room[1]/form[1]/div[1]/div[2]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/ngx-select[1]/div[1]/div[2]/div[1]/span[2]/i[1]")
	private WebElement Click_Room_Name;
	
	@FindBy(xpath="//body/app-root[1]/app-landing[1]/div[1]/div[1]/app-room-inventory[1]/div[1]/div[1]/app-add-new-room[1]/app-add-update-room[1]/form[1]/div[1]/div[2]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/ngx-select[1]/div[1]/ul[1]/li[1]/a[1]/span[1]")
	private WebElement Select_Room_Name;
	
	@FindBy(xpath="//body/app-root[1]/app-landing[1]/div[1]/div[1]/app-room-inventory[1]/div[1]/div[1]/app-add-new-room[1]/app-add-update-room[1]/form[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/input[1]")
	private WebElement Room_size;
	
	@FindBy(xpath="//body/app-root[1]/app-landing[1]/div[1]/div[1]/app-room-inventory[1]/div[1]/div[1]/app-add-new-room[1]/app-add-update-room[1]/form[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/ngx-select[1]/div[1]/div[2]/div[1]/span[2]/i[1]")
	private WebElement click_ON_SizeUnit;
	
	@FindBy(xpath="//span[contains(text(),'Square Feet')]")
	private WebElement Select_ON_SizeUnit;
	
	@FindBy(xpath="//span[contains(text(),'Room View Facing')]")
	private WebElement click_On_Room_View_Facing;
	
	@FindBy(xpath="//input[@id='11']")
	private WebElement Select_On_roomviewfacing;
	
	@FindBy(xpath="//a[@id='category_12-link']")
	private WebElement click_On_Accessibility_Preference;
	
	@FindBy(xpath="//input[@id='12']")
	private WebElement Select_On_Accessibility_Preference;
	
	@FindBy(xpath="//span[contains(text(),'Mattress Type')]")
	private WebElement Click_ON_Mattress_Type;
	
	@FindBy(xpath="//body/app-root[1]/app-landing[1]/div[1]/div[1]/app-room-inventory[1]/div[1]/div[1]/app-add-new-room[1]/app-add-update-room[1]/form[1]/div[2]/div[2]/div[2]/div[2]/tabset[1]/div[1]/tab[3]/div[1]/div[1]/label[1]")
	private WebElement Select_on_Mattress_Type;
	
	@FindBy(xpath="//span[contains(text(),'Floor Type')]")
	private WebElement Click_On_FloorType;
	
	@FindBy(xpath="//body/app-root[1]/app-landing[1]/div[1]/div[1]/app-room-inventory[1]/div[1]/div[1]/app-add-new-room[1]/app-add-update-room[1]/form[1]/div[2]/div[2]/div[2]/div[2]/tabset[1]/div[1]/tab[4]/div[1]/div[1]/label[1]")
	private WebElement Select_FloorType;
	
	@FindBy(xpath="//span[contains(text(),'Room Amenities')]")  
	private WebElement click_ON_Room_Amenities;
	
	@FindBy(xpath="//label[contains(text(),'Air Conditioning')]")
	private WebElement Select_AirConditioning;
	
	@FindBy(xpath="//label[contains(text(),'Safe')]")
	private WebElement Select_ON_Safe;
	
	@FindBy(xpath="//label[contains(text(),'Outdoor Sitting Area')]")
	private WebElement Select_On_OutsideSittingArea;
	
	@FindBy(xpath="//label[contains(text(),'Fan')]")
	private WebElement Select_Fan;
	
	@FindBy(xpath="//span[contains(text(),'Bathroom Amenities')]")
	private WebElement Click_On_BathroomAmenities;
	
	@FindBy(xpath="//body/app-root[1]/app-landing[1]/div[1]/div[1]/app-room-inventory[1]/div[1]/div[1]/app-add-new-room[1]/app-add-update-room[1]/form[1]/div[2]/div[2]/div[3]/div[2]/tabset[1]/div[1]/tab[2]/div[1]/div[1]/label[1]")
	private WebElement Select_BathroomAmenities;;
	
	@FindBy(xpath="//span[contains(text(),'Media & Technology')]") 
	private WebElement Click_On_MediaAndTechnology;

	@FindBy(xpath="//label[contains(text(),'TV')]")
	private WebElement Select_On_TV;

	@FindBy(xpath="//label[contains(text(),'Telephone')]")
	private WebElement Select_On_Telephone;

	@FindBy(xpath="//span[contains(text(),'Food & Drink')]") 
	private WebElement Click_On_FoodAndDrink;

	@FindBy(xpath="//body/app-root[1]/app-landing[1]/div[1]/div[1]/app-room-inventory[1]/div[1]/div[1]/app-add-new-room[1]/app-add-update-room[1]/form[1]/div[2]/div[2]/div[3]/div[2]/tabset[1]/div[1]/tab[4]/div[1]/div[1]/label[1]")
	private WebElement Select_On_FoodAndDrink;
	
	@FindBy(xpath="//button[contains(text(),'Add New Room')]")
	private WebElement Click_On_AddNewRoom;
	
	public Room_Inventory(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	public void addNewRoom() throws InterruptedException
	{
		Room_Inventory_Tab.click();
		Thread.sleep(2000);
		
		Display_Room.sendKeys("601-610");
		Thread.sleep(2000);
		
		ClickOn_smoking_policy.click();
		Thread.sleep(2000);
		
		Select_smoking_policy.click();
		Thread.sleep(2000);
		
		selected_floor.click();
		Thread.sleep(2000);
	}
	public void RoomType() throws InterruptedException
	{
		No_of_Guests.sendKeys("2");
		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", ClickON_Primary_BedType);
		Thread.sleep(2000);
		
		Select_Primary_BedType.click();
		Thread.sleep(2000);
	
		Click_on_No_Of_Primary_Beds.click();
		Thread.sleep(2000);
		
		Select_No_Of_Primary_Beds.click();
		Thread.sleep(2000);
		
		ClickON_Additional_BedTYpe.click();
		Thread.sleep(2000);
		
		Select_Additional_BedTYpe.click();
		Thread.sleep(2000);
		
		Click_ON_Additional_No_Of_Beds.click();
		Thread.sleep(2000);
		
		Select_Additional_No_Of_Beds.click();
		Thread.sleep(2000);
		
		click_On_ADD_Tab.click();
		Thread.sleep(2000);
	}
	
	public void BasicInformationOfRoom() throws InterruptedException
	{
		Room_Floor_Level.sendKeys("6");
		Thread.sleep(2000);
		
		Click_Room_type.click();
		Thread.sleep(2000);
		
		Select_Room_type.click();
		Thread.sleep(2000);
		
		Click_Room_Name.click();
		Thread.sleep(2000);
		
		Select_Room_Name.click();
		Thread.sleep(5000);
		
		Room_size.sendKeys("180");
		Thread.sleep(2000);
		
		click_ON_SizeUnit.click();
		Thread.sleep(2000);
		
		Select_ON_SizeUnit.click();
		Thread.sleep(4000);
			
	}
	
	public void RoomFeatures() throws InterruptedException
	{
		JavascriptExecutor jd = (JavascriptExecutor)driver;
		jd.executeScript("arguments[0].click()", click_On_Room_View_Facing);
		Thread.sleep(2000);
		
//		click_On_Room_View_Facing.click();
//		Thread.sleep(2000);
		
		Select_On_roomviewfacing.click();
		Thread.sleep(2000);
		
		click_On_Accessibility_Preference.click();
		Thread.sleep(2000);
		
		Select_On_Accessibility_Preference.click();
		Thread.sleep(2000);
		
		Click_ON_Mattress_Type.click();
		Thread.sleep(2000);
		
		Select_on_Mattress_Type.click();
		Thread.sleep(2000);
		
		Click_On_FloorType.click();
		Thread.sleep(2000);
		
		Select_FloorType.click();
		Thread.sleep(2000);
			
	}
	
	public void AmenitiesOfRoomType() throws InterruptedException
	{
		
		JavascriptExecutor jd = (JavascriptExecutor)driver;
		jd.executeScript("arguments[0].click()", click_ON_Room_Amenities);
		Thread.sleep(2000);
	
		
		JavascriptExecutor j1 = (JavascriptExecutor)driver;
		j1.executeScript("arguments[0].click()", Select_AirConditioning);
		Thread.sleep(2000);
		
		Select_ON_Safe.click();
		Thread.sleep(2000);
		
		Select_On_OutsideSittingArea.click();
		Thread.sleep(2000);
		
		Select_Fan.click();
		Thread.sleep(2000);
		
		Click_On_BathroomAmenities.click();
		Thread.sleep(2000);
		
		Select_BathroomAmenities.click();
		Thread.sleep(2000);
		
		Click_On_MediaAndTechnology.click();
		Thread.sleep(2000);
		
		Select_On_TV.click();
		Thread.sleep(2000);
		
		Select_On_Telephone.click();
		Thread.sleep(2000);
		
		Click_On_FoodAndDrink.click();
		Thread.sleep(2000);
		
		Select_On_FoodAndDrink.click();
		Thread.sleep(2000);
		
		JavascriptExecutor jk = (JavascriptExecutor)driver;
		jk.executeScript("arguments[0].click()", Click_On_AddNewRoom);
		Thread.sleep(2000);
	
	}
	
}
