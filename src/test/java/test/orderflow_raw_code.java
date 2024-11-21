package test;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class orderflow_raw_code {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://paymentstage.speedlane.ai/device?did=QXV0b21hdGlvbg==");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
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
		
		WebElement Boneless8=driver.findElement(By.xpath("//*[text()='8 Boneless Hot Wings Combo']/following::div[@class='card-footer'][1]/div[2]"));
		Boneless8.click();
		
		// add items under "Sauce Extras" 
		
		driver.findElement(By.xpath("//*[text()='Sauce Extras']")).click();
		
		WebElement extrabbq=driver.findElement(By.xpath("//*[text()='extra bbq']/following::div[1]"));
		
		String extrabbqrate=extrabbq.getText();
		
		System.out.println(extrabbqrate);
		
		WebElement addextraBBQ=driver.findElement(By.xpath("//*[text()='extra bbq']/parent::div/preceding-sibling::div/child::a[@class='counterAdd']"));
		addextraBBQ.click();
		
		WebElement addextragravy=driver.findElement(By.xpath("//*[text()='extra bbq']/parent::div/preceding-sibling::div/child::a[@class='counterAdd']"));
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
		FileUtils.copyFile(srcfile, new File ("E:\\screenshots\\"+timestamp+".png"));
		
		
		System.out.println("done");

	}

}
