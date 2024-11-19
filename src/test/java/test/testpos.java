package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testpos {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://chickenev3.speedlane.ai/??kiosk=1&oreset=1&Mode=Dinein&Tent=Tent1&type=5");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	
		
		
		List<WebElement> mainpageitems=driver.findElements(By.xpath("//*[@class='card-body']"));
		
		for (WebElement mpi:mainpageitems)
		{
			System.out.print(mpi.getText().replace(" ", "_"));
			System.out.print(",");
			
		}
		
		
	
		
	
	
	

	}

}
