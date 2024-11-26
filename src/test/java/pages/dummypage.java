package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class dummypage {
	
	
	
WebDriver driver;

	@FindBy(xpath = "//*[@class='btn btn-lg actionTypeBtn driveThroughCard']")
	public static WebElement drivethrough;
	
	@FindBy(xpath="//*[@class='vehicleColor rippleEffect redColor']")
	public static WebElement vehiclecolour;
	
	@FindBy(xpath="//*[@class='vehicleInfo rippleEffect carModel']")
	public static WebElement vehicleModels;
	
	@FindBy(xpath="//*[text()='Lane1']")
	public static WebElement Lane;
	
	@FindBy(xpath="//*[@class='menuBtn']")
	public static WebElement menu;
	
	
	
	public dummypage(WebDriver rdriver)
	{
		this.driver=rdriver;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getvehicleColor(String color)
	{
		String vehcolor="//*[text()='"+color+"']";
		WebElement vehcolor_ele=driver.findElement(By.xpath(vehcolor));
		return vehcolor_ele;
	}
	
	public WebElement getVehicleModel(String model)
	{
		String vehmodel="//*[text()='"+model+"']";
		WebElement vehmodel_ele=driver.findElement(By.xpath(vehmodel));
		return vehmodel_ele;
	}
	
	public WebElement getLaneNumber(String lanenum)
	{
		String vlanenum="//*[text()='"+lanenum+"']";
		WebElement vlanenum_ele=driver.findElement(By.xpath(vlanenum));
		return vlanenum_ele;
	}
	
	public WebElement formproductNameXpathWithText(String text)
	{
	
		WebElement ele=driver.findElement(By.xpath("//*[text()='"+text+"']/following::div[@class='card-footer'][1]/div[2]"));
		
		
		// By.xpath("//*[text()='8 Boneless Hot Wings Combo']/following::div[@class='card-footer'][1]/div[2]
		return ele;
	}
	
	public WebElement SelectKidsMeal()
	{
	
		WebElement ele=driver.findElement(By.xpath("(//*[text()='Kids Meal']/following::div[@class='card-footer'][1]/div[2])[2]"));
		
		ele.click();
		return ele;
		
	
	}
	
	public void  selectProductMixedLiversCombo()
	{
	
		WebElement ele=driver.findElement(By.xpath("//*[text()='Mixed Livers & Gizzards Combo']"));
		
	//	(//*[contains(text(),'"+text+"')]/following::div[@class='card-footer'][1]/div[2])[1]
		
		// By.xpath("//*[text()='8 Boneless Hot Wings Combo']/following::div[@class='card-footer'][1]/div[2]
		ele.click();
	}
	
	
	public void  selectProduct2PieceChickenDinner()
	{
	
		WebElement ele=driver.findElement(By.xpath("//*[text()='2 Piece Chicken Dinner']"));
		
	//	(//*[contains(text(),'"+text+"')]/following::div[@class='card-footer'][1]/div[2])[1]
		
		// By.xpath("//*[text()='8 Boneless Hot Wings Combo']/following::div[@class='card-footer'][1]/div[2]
		ele.click();
	}
	
	public void  selectProductMixedLiversDinner()
	{
	
		WebElement ele=driver.findElement(By.xpath("//*[text()='Mixed Livers & Gizzards Dinner']"));
		
	//	(//*[contains(text(),'"+text+"')]/following::div[@class='card-footer'][1]/div[2])[1]
		
		// By.xpath("//*[text()='8 Boneless Hot Wings Combo']/following::div[@class='card-footer'][1]/div[2]
		ele.click();
	}
	
	public void  selectProduct9Gizzards()
	{
	
		WebElement NineGizzards=driver.findElement(By.xpath("//*[text()='9 Gizzards']"));
		NineGizzards.click();
		
	}
	
	public void  selectProduct2PieceChickenCombo()
	{
	
		WebElement NineGizzards=driver.findElement(By.xpath("//*[text()='2 Piece Chicken Combo']"));
		NineGizzards.click();
		
	}
	
	public void  selectProduct20ExpressTendersFamilyMeal()
	{
	
		WebElement NineGizzards=driver.findElement(By.xpath("//*[text()='20 Express Tenders Family Meal']"));
		NineGizzards.click();
		
	}
	
	public void  selectProduct3FilletsDinner()
	{
	
		WebElement NineGizzards=driver.findElement(By.xpath("//*[text()='3 Fillets Dinner']"));
		NineGizzards.click();
		
	}
	
	public void  selectProduct3ExpressFishFillets()
	{
	
		WebElement NineGizzards=driver.findElement(By.xpath("//*[text()='3 Express Fish Fillets']"));
		NineGizzards.click();
		
	}
	
	
	public void OnePieceChickenSnackPack() {
		WebElement OnePieceChickenSnackPack=driver.findElement(By.xpath("//*[text()='1 Piece Chicken Snack Pack']"));
		OnePieceChickenSnackPack.click();	
	}
	
	public void EightPieceBonelessHotWings() {
		WebElement ele=driver.findElement(By.xpath("//*[text()='8 Piece Boneless Hot Wings']"));
		ele.click();	
	}
	
	
	public WebElement formXpathWithText(String text)
	{
		
		WebElement ele=driver.findElement(By.xpath("//*[text()='"+text+"']"));
		return ele;
	}

	

	
	
	

}
