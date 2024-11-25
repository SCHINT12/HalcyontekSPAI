package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features",glue ={"stepdefinitions"},monochrome = true,tags = "@EE-12L",
				plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		)	

public class runnerMainPageValidation {

	// @KidsMealTest :- kids meal ( Beverages , Sides , Side choice ) 
	//
	// Combo meals ( Side choice , Beverages , Sides , Sauce Extra , Drink Choice)
	// @4ETC   :- 4 Express Tenders Combo ( Side choice , Beverages , Sides , Sauce Extra , Drink Choice) 
	// @
	
}
