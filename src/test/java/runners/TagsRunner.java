package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags="@smoke or @regression", features="src\\test\\resources\\FeatureWithTags", 
glue= {"stepdefinitions"}, plugin = {"pretty", "html:target/htmlreport.html"})
public class TagsRunner extends AbstractTestNGCucumberTests{

}
