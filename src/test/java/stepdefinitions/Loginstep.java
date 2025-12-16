//package stepdefinitions;
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
//public class Loginstep {
//	WebDriver driver = null;
//	
//	@Given("user is on login page")
//	public void user_is_on_login_page() {
//	  driver = new ChromeDriver();
//	  driver.get("https://www.saucedemo.com/");	}
//
//	@When("user enterd valid username and password")
//	public void user_enterd_valid_username_and_password() {
//	    driver.findElement(By.id("user-name")).sendKeys("standard_user");
//	    driver.findElement(By.id("password")).sendKeys("secret_sauce");
//	}
//
//	@And("user enter login")
//	public void user_enter_login() {
//	    driver.findElement(By.id("login-button")).click();
//	}
//
//	@Then("user is navigated to home and")
//	public void user_is_navigated_to_home_and() {
//	   driver.findElement(By.tagName("a")).isDisplayed();
//	}
//
//	@And("close the browser")
//	public void close_the_browser() {
//	    driver.close();
//	}
//}
