package stepdefinitions;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.TreeMap;

import org.assertj.core.api.SoftAssertions;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;

import Utils.TestContextSetup;
import common.Common;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.dummypage;

public class mainPageValidationSteps {

	Properties prop=new Properties();
	public WebDriver driver;
	dummypage obj_dummypage;
	TestContextSetup testContextSetup;
	Common comn=new Common();
	SoftAssertions sa;
	
	
	public void mainPageValidationSteps(TestContextSetup testContextSetup)
	{
		this.testContextSetup=testContextSetup;
		this.obj_dummypage =testContextSetup.pageObjectManager.getLandingPage();
	}

	public void init() throws IOException
	{
		File directory =new File(".");
		String configfilepath=directory.getCanonicalPath();
		FileInputStream fis=new FileInputStream(configfilepath +"/resources/mainPage-config.properties");
		prop.load(fis);
	}



	@Given("I able to launch browser and select Place of service")
	public void i_able_to_launch_browser_and_select_place_of_service() throws IOException {
		init();
		ExtentCucumberAdapter.addTestStepLog("Application URL Launched");
	}

	@When("after launch browser")
	public void after_launch_browser() {
	    System.out.println("done");
	}

	@Then("validate prices for products Main Page Products {string} for {string}")
	public void validate_prices_MainPage(String products,String Section) throws InterruptedException {
		String allproducts=products;
		String[] product=allproducts.split(",");
		TreeMap<String,String> expected=new TreeMap<String,String>();
		for(String p:product)
		{
			String p_org=p;
			
			p=p.replace("_", " ");
			
			expected.put(p, prop.getProperty(p_org));
		}
		System.out.println(expected);
		String str="";

		for(String s:expected.keySet())
		{

			//	str="//*[text()='"+s+"']/parent::div/following-sibling::div/span";
				
				str="//*[text()='"+s+"']/following::div[@class='card-footer'][1]/div[2]";
			
			WebElement ele=testContextSetup.driver.findElement(By.xpath(str));
			Thread.sleep(2000);
			try {
				String actualval=ele.getText().replace("+ ", "");
				System.out.println("###############################################################");
				System.out.println("Actual Price for product:: "+s+" is : "+actualval);
				System.out.println("Expected Price for product:: "+s+" is : "+expected.get(s));

				if(expected.get(s).equals(actualval))
				{
					System.out.println("No Change in price: Where actual price is-"
							+ " "+actualval+" and Expected price is "+expected.get(s)+" for product:: "+s+"");
				}
				else
				{
					ExtentCucumberAdapter.addTestStepLog("<B> Change in price: Where actual price is-"
							+ " "+actualval+" and Expected price is "+expected.get(s)+" for product:: "+s+" </B>");
					System.out.println("Change in price: Where actual price is-"
							+ " "+actualval+" and Expected price is "+expected.get(s)+" for product:: "+s+"");
					comn.moveElement(ele,testContextSetup.driver);
				Assert.fail();
				
				
				}
				System.out.println("###############################################################");

			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
			
		}
	
	}	
	
	
	
}
