package runner;



import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features/comboMeals.feature",glue ={"stepdefinitions"},monochrome = true,tags = "@CMNTest",
		plugin= {"pretty","html:target/cucumber.html"})	
public class runnerOrderflow {

}
