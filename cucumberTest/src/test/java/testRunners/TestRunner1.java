package testRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/featureFiles",
		glue = "stepDefinations",
		tags = "@RegressionTest",
		stepNotifications = true
		)
public class TestRunner1 {

}
