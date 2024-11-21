package pagesCESL;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import common.Common;

public class comboMeals extends Common {
	
	 static WebDriver driver;
	 
	 @FindBy (xpath="//*[text()='4 Express Tenders Combo']/following::div[@class='card-footer'][1]/div[1]")
	 public static WebElement ComboProduct;
	 
	 public comboMeals(WebDriver rdriver)
		{
			this.driver=rdriver;
			PageFactory.initElements(driver, this);
		}
		
	
	public static void selectComboMealProduct() throws InterruptedException

	{
		Thread.sleep(5000);
		WebElement Boneless8=driver.findElement(By.xpath("//*[text()='4 Express Tenders Combo']/following::div[@class='card-footer'][1]/div[2]"));
		Boneless8.click();
	}
	
	public static void breatOptions() throws InterruptedException

	{
		Thread.sleep(5000);
		WebElement breadChoice=driver.findElement(By.xpath("//*[@class='categoryHeading active chz1 breadchoice']"));
		breadChoice.click();
		
		List<WebElement> elements  = driver.findElements(By.xpath("//*[@data-subchoicename='Bread Choice:']/parent::label"));
		
		for (WebElement ele :elements)
		{
			System.out.println(ele.getText());
		}
	}
	
	public static void tendersOptions() throws InterruptedException

	{
		WebElement tendersChoice=driver.findElement(By.xpath("//*[@class='categoryHeading chz2 tenderschoice']"));
		tendersChoice.click();
		
		List<WebElement> elements  = driver.findElements(By.xpath("//*[@data-subchoicename='Tenders Choice:']/parent::label"));
		
		for (WebElement ele :elements)
		{
			System.out.println(ele.getText());
		}	
	
	}
	
}
