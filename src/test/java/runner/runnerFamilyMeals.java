package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features/familyMeals.feature",glue ={"stepdefinitions"},monochrome = true,tags = "@FMtest",
				plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		)	

public class runnerFamilyMeals {

}
