package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageFactory.HomePageFactory;
import PageFactory.LoginPageFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageFactoryStepDefinition {

	WebDriver driver = null;
    LoginPageFactory lpf;
	HomePageFactory hpf;
	@Given("user is on login page")
	public void user_is_on_login_page() {
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
	}

	@When("^user gives valid (.*) and (.*)$")
	public void user_gives_valid_standard_user_and_secret_sauce(String username, String password) {
        lpf = new LoginPageFactory(driver);
        lpf.enterUserName(username);
        lpf.enterPassword(password);
	}

	@Then("user clicks on ligin button")
	public void user_clicks_on_ligin_button() {
		lpf.clickLogin();
	}

	@And("user navigated to home page")
	public void user_navigated_to_home_page() {
		hpf = new HomePageFactory(driver);
		hpf.isCartDisplayed();
	}
}
