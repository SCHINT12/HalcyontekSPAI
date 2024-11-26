package pagesCESL;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;

import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;

public class createOrderAndRewiteOrderTest {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://paymentstage.speedlane.ai/device?did=QXV0b21hdGlvbg==");
		Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		plaseOfService pos=new plaseOfService(driver);
		pos.SelectPosDriverThrough();
		
		WebElement FourExpressTendersCombo=driver.findElement(By.xpath("//*[text()='4 Express Tenders Combo']/following::div[@class='card-footer'][1]/div[2]"));
		FourExpressTendersCombo.click();
		
		WebElement rollBreadChoice=driver.findElement(By.xpath("//*[text()='roll']"));
		rollBreadChoice.click();

		WebElement Tenderchoice=driver.findElement(By.xpath("//*[text()='Tenders Choice']"));
		Tenderchoice.click();

		WebElement Tenderchoiceall=driver.findElement(By.xpath("//*[text()='all regular']"));
		Tenderchoiceall.click();
		
		
		// select Sauce choice pick2 
		
		driver.findElement(By.xpath("//*[text()='Sauce Choices (Pick 2)']")).click();
		
		driver.findElement(By.xpath("//*[text()='bbq']/parent::div/preceding-sibling::div/child::a[@class='counterAdd']")).click();
		
		String bbqadd="1";
		
		driver.findElement(By.xpath("//*[text()='ranch']/parent::div/preceding-sibling::div/child::a[@class='counterAdd']")).click();
		
		String ranchadd="1";
		
		// add items under "Sauce Extras" 
		
		driver.findElement(By.xpath("//*[text()='Sauce Extras']")).click();
		
		WebElement addextraBBQ=driver.findElement(By.xpath("//*[text()='extra bbq']/parent::div/preceding-sibling::div/child::a[@class='counterAdd']"));
		addextraBBQ.click();
		
		WebElement addextragravy=driver.findElement(By.xpath("//*[text()='extra gravy']/parent::div/preceding-sibling::div/child::a[@class='counterAdd']"));
		addextragravy.click();
		
		// add items under "Sides" 
		
		driver.findElement(By.xpath("//*[text()='Sides']")).click();
		
		WebElement frenchfires=driver.findElement(By.xpath("//*[text()='french fries - sm']/parent::div/preceding-sibling::div/child::a[@class='counterAdd']"));
		frenchfires.click();
	
		WebElement greenbeansm=driver.findElement(By.xpath("//*[text()='green beans - sm']/parent::div/preceding-sibling::div/child::a[@class='counterAdd']"));
		greenbeansm.click();
		
		WebElement Addorder=driver.findElement(By.xpath("//*[@class='btnText lh36']"));
		Addorder.click();
		
		Thread.sleep(5000);
		
		String timestamp = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
		TakesScreenshot ts=(TakesScreenshot)driver;
		File srcfile= ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcfile, new File ("E:\\screenshots\\"+timestamp+"freshorder.png"));
		
		Thread.sleep(5000);
		
		System.out.println("validate order ---------------------------------");
		
		driver.findElement(By.xpath("//*[@onclick='editItem(60001.021124,0)']")).click();
		
		WebElement Rollselected=driver.findElement(By.xpath("//*[@id='edit-subitem-0-roll']"));
		
		if (Rollselected.isSelected())
		{
			System.out.println("Roll selected under bread Choice");
		}
		else
		{
			System.out.println("Roll not selected under bread Choice please recheck");
		}
		
		
		driver.findElement(By.xpath("//*[@class='categoryHeading chz2 tenderschoice']")).click();
		
		WebElement AllRerular=driver.findElement(By.xpath("//*[@id='edit-subitem-1-allregular']"));
		
		if (AllRerular.isSelected())
		{
			System.out.println("All Rerular selected under Tenders Choice");
		}
		else
		{
			System.out.println("AllRerular not selected under Tenders Choice please recheck");
		}
		
		// select Sauce choice pick2 
		
		driver.findElement(By.xpath("//*[@class='categoryHeading chz5 saucechoicespick2']")).click();
		
	
		WebElement bbqsauce2=driver.findElement(By.xpath("//*[@id='edit-subitem-100069.022324']"));
		
		String str = bbqsauce2.getAttribute("value");
		
				
		if (str.equals(bbqadd))
		{
			System.out.println("Sauce Choices pick 2 sub item BBQ selected");
		}
		else
		{
			System.out.println("Sauce Choices pick 2 sub item BBQ not selected --------------");
		}
		
		
		WebElement ranchsauce2=driver.findElement(By.xpath("//*[@id='edit-subitem-100070.022324']"));
	
		String str1 = ranchsauce2.getAttribute("value");
		
		if (str1.equals(ranchadd))
		{
			System.out.println("Sauce Choices pick 2 sub item Ranch selected");
		}
		else
		{
			System.out.println("Sauce Choices pick 2 sub item Ranch not selected --------------");
		}
		
		System.out.println("Mofdified order ---------------------------------");
		
		//remove ranch Sauce Choices pick 2 
		driver.findElement(By.xpath("//*[text()='ranch']/parent::div/preceding-sibling::div/child::a[@class='counterSubtract']")).click();
		
		//add bbQ Sauce Choices pick 2 
		driver.findElement(By.xpath("//*[text()='bbq']/parent::div/preceding-sibling::div/child::a[@class='counterAdd']")).click();
		
		
		// click on Sides 
		
		driver.findElement(By.xpath("//*[@class='categoryHeading chz7 sides']")).click();
		
		// adding more items under Sides 
		driver.findElement(By.xpath("//*[text()='fried okra - sm']/parent::div/preceding-sibling::div/child::a[@class='counterAdd']")).click();
		WebElement corn=driver.findElement(By.xpath("//*[text()='corn nuggets (8)']/parent::div/preceding-sibling::div/child::a[@class='counterAdd']"));
		corn.click();
		corn.click();
		
		System.out.println("added items corn nuggets (8) 2 times ");
		
		// click on Sides 
		
		driver.findElement(By.xpath("//*[@class='categoryHeading chz8 beverages']")).click();
		
		WebElement dietcoke32oz=driver.findElement(By.xpath("//*[text()='diet coke - 32oz']/parent::div/preceding-sibling::div/child::a[@class='counterAdd']"));
		dietcoke32oz.click();
		dietcoke32oz.click();
		
		System.out.println("added items diet coke 32oz 2 times");
		
		
		//click on ADD 
		driver.findElement(By.xpath("//*[@class='floatR totalItemPriceEdit']")).click();
		Thread.sleep(3000);
		
		File src1file= ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src1file, new File ("E:\\screenshots\\"+timestamp+"modifiedorder.png"));

		//click paynow 
		
		driver.findElement(By.xpath("//*[@id='btnPayNow']")).click();
		Thread.sleep(10000);
		File src2file= ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src2file, new File ("E:\\screenshots\\"+timestamp+"paymentscreen.png"));
		
		WebElement orderid=driver.findElement(By.xpath("//*[@class='text-primary font-weight-bold display-4  cardValue']"));
		String OrderId=orderid.getText();
		
		System.out.println("Order id is " + OrderId);
		
		WebElement amount=driver.findElement(By.xpath("//*[@class='text-success font-weight-bold display-4 cardValue']"));
		String Amount=amount.getText();
		
		System.out.println("Order Value is " + Amount);
		
		//cancel the order 
		
		driver.findElement(By.xpath("//*[@class='btn btn-lg btn-outline-danger rounded-pill px-3 py-2 shadow-lg mr-20 cancelBtn']")).click();
		Thread.sleep(10000);
		driver.quit();
		
		
		
	}

}
