package pagesCESL;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import common.Common;
import pages.dummypage;

public class plaseOfService extends Common {
	
	static WebDriver driver;
	
	@FindBy(xpath="//*[text()='Here']")
	public static WebElement PosHere;
		
	@FindBy(xpath="//*[text()='Togo']")
	public static WebElement PosTogo;
		
	@FindBy(xpath="//*[@class='btn btn-lg actionTypeBtn phoneCard']")
	public static WebElement PosPhone;
	
////// Select driveThrough
	
	@FindBy(id="driveThroughBtn")
	public static WebElement PosDrivernThrough;
	
	@FindBy(xpath="//*[@class='vehicleColor rippleEffect redColor']")
	public static WebElement vehiclecolour;
	
	@FindBy(xpath="//*[@class='vehicleInfo rippleEffect carModel']")
	public static WebElement vehicleModels;
	
	@FindBy(xpath="//*[text()='Lane1']")
	public static WebElement Lane;
	
	@FindBy(xpath="//*[@class='menuBtn']")
	public static WebElement menu;
	
	public void SelectPosDriverThrough()
	{
		WebElement SelectPOS=driver.findElement(By.xpath("//*[@class='btn btn-lg actionTypeBtn driveThroughCard']"));
		SelectPOS.click();
		
		WebElement vehiclecolour=driver.findElement(By.xpath("//*[@class='vehicleColor rippleEffect redColor']"));
		vehiclecolour.click();
	
		WebElement vehicleModels=driver.findElement(By.xpath("//*[@class='vehicleInfo rippleEffect carModel']"));
		vehicleModels.click();
		
		WebElement Lane=driver.findElement(By.xpath("//*[text()='Lane1']"));
		Lane.click();
	
		WebElement GotoMenu=driver.findElement(By.xpath("//*[@class='menuBtn']"));
		GotoMenu.click();
			
	}
	
	
	public plaseOfService(WebDriver rdriver)
	{
		this.driver=rdriver;
		PageFactory.initElements(driver, this);
	}
	
	public static void SelectPosHere()
	{
		WebElement Here=driver.findElement(By.xpath("//*[@class='btn btn-lg actionTypeBtn frontDeskCard']"));
		Here.click();
		WebElement heretent1=driver.findElement(By.xpath("//*[text()='1 ']"));
		heretent1.click();	
		WebElement Herecontiune=driver.findElement(By.xpath("//*[text()='Continue']"));
		Herecontiune.click();	
			
	}
	
	public static void SelectPosTogo() throws InterruptedException
	
	{	
		WebElement Togo=driver.findElement(By.xpath("//*[@class='btn btn-lg actionTypeBtn togoCard']"));
		Togo.click();
		WebElement Togotent1=driver.findElement(By.xpath("//*[text()='1 ']"));
		Togotent1.click();	
		Thread.sleep(5000);
		WebElement Togocontiune=driver.findElement(By.xpath("//*[text()='Continue']"));
		Togocontiune.click();
	}
	
	
	public static void SelectPosPhone()
	{
		WebElement Phone=driver.findElement(By.xpath("//*[@class='btn btn-lg actionTypeBtn phoneCard']"));
		Phone.click();
		
	}
	

	

	
	
	
	
	
	
	

}
