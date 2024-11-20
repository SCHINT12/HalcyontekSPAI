package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features/DinnerComboMeals.feature",glue ={"stepdefinitions"},monochrome = true,tags = "@DCMtest",
				plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		)	


public class runnerDineerComboMeals {
	

}
