package pagesCESL;


import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;



import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import common.Common;
import java.util.*;
public class testPageCESL extends Common{
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://paymentstage.speedlane.ai/device?did=QXV0b21hdGlvbg==");
		Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		plaseOfService pos=new plaseOfService(driver);
		pos.SelectPosPhone();
		
		comboMeals obj_comboMeals=new comboMeals(driver);
		obj_comboMeals.selectComboMealProduct();
		
		Thread.sleep(5000);
		
		obj_comboMeals.breatOptions();
	//	obj_comboMeals.tendersOptions();
		obj_comboMeals.sauceChoicesPick2();
		
		
		Thread.sleep(5000);

		String timestamp = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
		TakesScreenshot ts=(TakesScreenshot)driver;
		File srcfile= ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcfile, new File ("E:\\screenshots\\"+timestamp+".png"));
		
		
		System.out.println("################################################################");
	}

}
