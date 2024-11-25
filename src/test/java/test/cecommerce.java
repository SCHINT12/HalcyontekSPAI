package test;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cecommerce {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://chickenev3.speedlane.ai/??kiosk=1&oreset=1&Mode=Dinein&Tent=Tent1&type=5#combo");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	//	driver.findElement(By.xpath("//*[@class='btn btn-lg actionTypeBtn phoneCard']")).click();
		
		Thread.sleep(10000);
		
		List<WebElement> mainpageitems=driver.findElements(By.xpath("//*[@class='card-body']"));
		
		for (WebElement mpi:mainpageitems)
		{
			System.out.println(mpi.getText());
		}
		
	
		
		
		
		
		
		
	}

}
