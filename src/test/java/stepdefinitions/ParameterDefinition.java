//package stepdefinitions;
//
//import java.time.Duration;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class ParameterDefinition {
//	WebDriver driver = null;
//	@Given("the user is on the login page")
//	public void the_user_is_on_the_login_page() {
//	    driver = new ChromeDriver();
//	    driver.get("https://www.saucedemo.com/");
//	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//	}
//
//	@When("^the user entered the valid (.*) and (.*)$")
//	public void the_user_entered_the_valid_standard_user_and_secret_sauce(String username, String password) {
//	    driver.findElement(By.id("user-name")).sendKeys(username);
//	    driver.findElement(By.id("password")).sendKeys(password);
//	}
//
//	@Then("the user clicks login button")
//	public void the_user_clicks_login_button() {
//		driver.findElement(By.id("login-button")).click();
//	}
//
//	@And("the user is navigated to the home page of app")
//	public void the_user_is_navigated_to_the_home_page_of_app() {
//	    driver.findElement(By.tagName("a"));
//	}
//	
//}
