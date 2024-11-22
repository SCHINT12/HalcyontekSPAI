package pagesCESL;

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

public class alertChecking {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://paymentstage.speedlane.ai/device?did=QXV0b21hdGlvbg==");
		Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		plaseOfService pos=new plaseOfService(driver);
		pos.SelectPosPhone();
		
		comboMeals obj_comboMeals=new comboMeals(driver);
		obj_comboMeals.selectComboMealProduct();
		
		WebElement Chickenchois3=driver.findElement(By.xpath("//*[text()='Chicken Choice (Pick 3)']"));
		Chickenchois3.click();
		
		
		WebElement Chickenchois3Leg=driver.findElement(By.xpath("//*[text()='leg']/parent::div/preceding-sibling::div/child::a[@class='counterAdd']"));
		
		for (int i=1;i<=4;i++)
			
		{
			Chickenchois3Leg.click();
		}
		
		WebElement next=driver.findElement(By.id("nextButton"));
		next.click();
		
		Thread.sleep(5000);
		
		
		String timestamp = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
		TakesScreenshot ts=(TakesScreenshot)driver;
		File srcfile= ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcfile, new File ("E:\\screenshots\\"+timestamp+"alert_checking"+".png"));
		
		//driver.switchTo().activeElement();
		
		WebElement alert=driver.findElement(By.xpath("//*[@id='messageModalBody']"));
	

		System.out.println("Alret comments :- "+ alert.getText());
		
		System.out.println("$$$$$$$$$$$$$$$$$$");

		driver.switchTo().activeElement().getText();
		
	}

}
