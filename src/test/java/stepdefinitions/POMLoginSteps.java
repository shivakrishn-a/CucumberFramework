//package stepdefinitions;
//
//import java.time.Duration;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import pageObjects.POMLoginPage;
//
//public class POMLoginSteps {
//	WebDriver driver = null;
//	POMLoginPage login;
//
//	@Given("the user is on the login page")
//	public void the_user_is_on_the_login_page() {
//		driver = new ChromeDriver();
//		driver.get("https://www.saucedemo.com/");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//	}
//
//	@When("^the user entered the valid (.*) and (.*)$")
//	public void the_user_entered_the_valid_standard_user_and_secret_sauce(String username, String password) {
//		login = new POMLoginPage(driver);
//		login.enterUsername(username);
//		login.enterPassword(password);
//	}
//
//	@Then("the user clicks login button")
//	public void the_user_clicks_login_button() {
//		login.loginClick();
//	}
//
//	@And("the user is navigated to the home page of app")
//	public void the_user_is_navigated_to_the_home_page_of_app() {
//		login.isLogoDisplayed();
//	}
//}
