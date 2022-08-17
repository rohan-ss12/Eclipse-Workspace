package cucumberOptions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "src/test/java/featureFiles/GoogleMapsAPI.feature",
		glue = "stepDefinations\\googleMapsStepDefinations.java")

public class googleMapsTestRunner {
  //...........

}
