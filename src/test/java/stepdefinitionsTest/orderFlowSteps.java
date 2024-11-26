package stepdefinitionsTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Properties;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import org.assertj.core.api.SoftAssertions;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;

import Utils.TestContextSetup;
import common.Common;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.dummypage;

public class orderFlowSteps  {
	Properties prop=new Properties();
	public WebDriver driver;
	dummypage obj_dummypage;
	TestContextSetup testContextSetup;
	Common comn=new Common();
	SoftAssertions sa;
	
	public orderFlowSteps(TestContextSetup testContextSetup)
	{
		this.testContextSetup=testContextSetup;
		this.obj_dummypage =testContextSetup.pageObjectManager.getLandingPage();
	}

	public void init(String Product) throws IOException
	{
		File directory =new File(".");
		String configfilepath=directory.getCanonicalPath();
		FileInputStream fis=new FileInputStream(configfilepath +"/resources/"+Product+"_"+"config.properties");
		prop.load(fis);
	}



	@Given("user able to launch browser and select Place of service for {string}")
	public void user_able_to_launch_browser_and_select_place_of_service(String product) throws IOException {
		init(product);
		ExtentCucumberAdapter.addTestStepLog("Application URL Launched");
	}

	@Given("I click on {string} color vehicle model {string} with Lane {string}")
	public void i_click_on_color_vehicle(String col,String model,String lane) throws InterruptedException {
		testContextSetup.driver=testContextSetup.testBase.driver;

		obj_dummypage=new dummypage(testContextSetup.driver);
		comn.click(testContextSetup.driver, obj_dummypage.drivethrough, "driventhrough");
		comn.click(testContextSetup.driver, obj_dummypage.getvehicleColor(col), col);
		comn.click(testContextSetup.driver, obj_dummypage.getVehicleModel(model),model);
		comn.click(testContextSetup.driver, obj_dummypage.getLaneNumber(lane), lane);
		comn.click(testContextSetup.driver, obj_dummypage.menu, "menu");
	}

	@When("I click the product {string} and navigate to {string}")
	public void i_click_the_product_and_navigate_to(String productname, String section) {
		obj_dummypage.formproductNameXpathWithText(productname).click();
		obj_dummypage.formXpathWithText(section).click();
	}
	
	@When("I click the product {string}")
	public void i_click_the_product(String productname) {
		obj_dummypage.formproductNameXpathWithText(productname).click();
		
		
	}
	
	@When("I click Mixed Livers protuct")
	public void i_click_mixed_livers_products()
	{
		obj_dummypage.selectProductMixedLiversCombo();
	}
	
	
	@When("I click Mixed Livers Dinner protuct")
	public void i_click_mixed_livers_dinner_protuct()
	{
		obj_dummypage.selectProductMixedLiversDinner();
	}
	
	@When("I click the product 9 Gizzards")
	public void i_click_the_product_9_gizzards()
	{
		obj_dummypage.selectProduct9Gizzards();
	}
	
	@When("I click the product Kids Meal")
	public void i_click_the_product_kids_meal()
	{
		obj_dummypage.SelectKidsMeal();
	}
	
	@When("I click the product two Piece Chicken Combo in Combo Meals")
	public void i_click_the_product_2_piece_chicken_combo()
	{
		obj_dummypage.selectProduct2PieceChickenCombo();
	}

@When("I click the product twenty Express Tenders Family Meal in Family Meals")
	public void i_click_the_product_20_express_tenders_family_meal()
	{
		obj_dummypage.selectProduct20ExpressTendersFamilyMeal();
	}


@When("I click the product three Fillets Dinner in Fried Fish Fillets")
	public void i_click_the_product_3_fillets_dinner()
	{
		obj_dummypage.selectProduct3FilletsDinner();
	}


@When("I click the product three Express Fish Fillets in Fried Fish Fillets")
	public void i_click_the_product_3_express_fish_fillets()
	{
		obj_dummypage.selectProduct3ExpressFishFillets();
	}
	
	
	
	
	

	@Then("validate prices for products {string} for {string}")
	public void validate_prices(String products,String Section) throws InterruptedException {
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

			if(Section.equals("Sides") || Section.equals("Beverages") || Section.equals("Sauce Extras"))
			{
				str="//*[text()='"+s+"']/parent::div/following-sibling::div/span";
			}
			else if(Section.equals("Drink Choice") || Section.equals("Side Choice"))
			{
				str="//*[text()='"+s+"']/following-sibling::span";	

			}
			else if (Section.equals("Side Choices (Pick 2)"))
			{
				str="//*[text()='"+s+"']/following::span[1]";
			}


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


	@When("user able add to card food items")
	public void user_able_add_to_card_food_items() throws InterruptedException {

		WebElement Tenders7combo=testContextSetup.driver.findElement(By.xpath("(//*[text()='7 Express Tenders Combo'])[1]/following::div[@class='card-footer'][1]/div[1]"));

		String Tenders7combooo=Tenders7combo.getText();

		String rate="$17.39";

		if (rate.equals(Tenders7combooo))
		{
			System.out.println("7 Express Tenders Combo rate is same as per document");
			ExtentCucumberAdapter.addTestStepLog("7 Express Tenders Combo rate is same as per document");
		}
		else {
			System.out.println("7 Express Tenders Combo rate not same as per Aggrement");
			ExtentCucumberAdapter.addTestStepLog("7 Express Tenders Combo rate is same as per document");
		}

	}

	@Then("user able to see total bill amount")
	public void user_able_to_see_total_bill_amount() {

		System.out.println("compare price");
	}

	@When("I navigate to {string}")
	public void i_navigate_to(String section) {

		obj_dummypage.formXpathWithText(section).click();
	}
	
	///////////////////////////////////////// mainpage validation stpes///////////////////////////////////////////////////
	@Given("I able to launch browser and initiate config properties for {string}")
	public void i_able_to_launch_browser_and_select_place_of_service(String product) throws IOException {
		init(product);
//		driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.navigate().to(prop.getProperty("Url"));
//		driver.manage().timeouts().implicitlyWait(10 ,TimeUnit.SECONDS);
//		ExtentCucumberAdapter.addTestStepLog("Application URL Launched");
	}



@Then("validate prices for products Main Page Products {string}")
	public void validate_prices_main_page(String products) throws InterruptedException {
		String allproducts=products;
		String[] product=allproducts.split(",");
		LinkedHashMap<String,String> expected=new LinkedHashMap<String,String>();
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

			////*[text()='Kids Meal']/parent::div/parent::div/following-sibling::div/div[@class='itemPrice']
								
			str="//*[text()='"+s+"']/parent::div/parent::div/following-sibling::div/div[@class='itemPrice']";
			
		WebElement ele=testContextSetup.driver.findElement(By.xpath(str));
		Thread.sleep(2000);
		
		String actualval=ele.getText();
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
	}
	
	
	///////////////////////////////////////// end///////////////////////////////////////////////////


}
