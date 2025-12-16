package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class POMLoginPage {

	WebDriver driver;
	
	By txt_username = By.id("user-name");
	By txt_password = By.id("password");
	By login_btn = By.id("login-button");
	By tag_present = By.tagName("a");
	
	
	public POMLoginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void enterUsername(String username)
	{
	   driver.findElement(txt_username).sendKeys(username);	
	}
	public void enterPassword(String password)
	{
	   driver.findElement(txt_password).sendKeys(password);	
	}
	
	public void loginClick()
	{
	   driver.findElement(login_btn).click();	
	}
	
	public void isLogoDisplayed()
	{
	   	driver.findElement(tag_present).isDisplayed();
	}
}
