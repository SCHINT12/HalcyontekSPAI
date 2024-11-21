package common;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.FileHandler;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import com.google.common.primitives.Bytes;

import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
public class Common {
	public static WebDriver driver;
	public Common()
	{
		this.driver=driver;
	}

	public static boolean click(WebDriver driver,WebElement ele,String elementName)
	{
		boolean flag=false;
		try
		{
			if(ele.isDisplayed())
			{
				JavascriptExecutor js =(JavascriptExecutor)driver;
				js.executeScript("arguments[0].style.border='2px solid red'", ele);
				js.executeScript("arguments[0].style.background='yellow'", ele);
				ele.click();
				flag=true;
				ExtentCucumberAdapter.addTestStepLog("user clicked the "+elementName+"");
			}
		}
		
		catch(Exception e)
		{
			ExtentCucumberAdapter.addTestStepLog("user is not able to click the "+elementName+"");

		}
		return flag;
	}
	
	
//	public static String takeScreenshot(WebDriver driver) throws IOException
//	{
//		String timestamp = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
//
//		TakesScreenshot ts = (TakesScreenshot) driver;
//		File srcFile = ts.getScreenshotAs(OutputType.FILE);
//		String path="C:\\Users\\shiva\\Desktop\\pricechange_"+timestamp+".png";
//        File destFile = new File(path);
//        FileUtils.copyFile(srcFile, destFile);
//        return path;
//        
//		
//	}
	
	public void moveElement(WebElement ele,WebDriver driver)
	{
		Actions act=new Actions(driver);
		act.moveToElement(ele).perform();
	}

//	public void captureAndAttachScreenshot(WebDriver driver) throws IOException
//	{
//		try {
//            // Take screenshot and store it in a temporary file
//            Path tempFile = Files.createTempFile("screenshot", "test-output/Report.png");
//            Files.write(tempFile, ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES));
//            
//            // Attach screenshot to Extent report
//            ExtentCucumberAdapter.getCurrentStep().addScreenCaptureFromPath(tempFile.toString());
//            
//            // Optionally, delete the temporary file after attaching to the report (uncomment if needed)
//            // Files.deleteIfExists(tempFile);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//		 
//	
//	}

	
}

