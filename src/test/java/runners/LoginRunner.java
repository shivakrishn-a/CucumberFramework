package runners;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags="", features="src\\test\\resources\\features\\login.feature", 
glue= {"stepdefinitions"}, plugin = {"pretty", "html:target/htmlreport.html"})

public class LoginRunner extends AbstractTestNGCucumberTests{

}
