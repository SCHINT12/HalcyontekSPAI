package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features/DinnerComboMeals.feature",glue ={"stepdefinitions"},monochrome = true,tags = "@DCMMLDTest",
				plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		)	


public class runnerDineerComboMeals {
	

}
