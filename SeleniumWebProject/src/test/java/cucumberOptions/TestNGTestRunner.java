package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features= "src/test/java/features",

					glue = "src/test/java/stepDefinations",
					
					monochrome = true
			)


public class TestNGTestRunner extends AbstractTestNGCucumberTests{

}
