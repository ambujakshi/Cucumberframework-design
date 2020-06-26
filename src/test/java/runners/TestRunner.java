package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
 

@RunWith(Cucumber.class) 
@CucumberOptions(
		features= "src/test/resources/functionaltest",
		glue="stepdefinations",dryRun=true
		)

public class TestRunner {
}
