package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(tags="", features="src/test/resources/features", glue= {"stepdefinitions"}, 
plugin = {"pretty", "html:target/htmlreport.html"})
public class ParameterRunner extends AbstractTestNGCucumberTests{
	
}
