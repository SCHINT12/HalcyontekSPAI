package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import pagesCESL.plaseOfService;

public class testpos{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://paymentstage.speedlane.ai/device?did=QXV0b21hdGlvbg==");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		plaseOfService pos=new plaseOfService(driver);
		pos.SelectPosDriverThrough();
		
		WebElement NineGizzards=driver.findElement(By.xpath("//*[text()='9 Gizzards']"));
		NineGizzards.click();
		
	
		System.out.println("All done ");
	

	}

}
