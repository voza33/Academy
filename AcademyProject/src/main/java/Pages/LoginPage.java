package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	private WebDriver driver;
	
	private By loginButtonLocator= By.xpath("//div[@class='login-btn'][1]");
	private By emailInputLocator= By.xpath("//input[@id='name']");
	private By passwordInputLocator= By.xpath("//input[@id='email']");
	//private by logoutLinkLocator= by.("");
//	private by forgotPasswordLinkLocator= by.("");
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void enterEmail() {
		WebElement emailInput=driver.findElement(emailInputLocator);
		emailInput.sendKeys("Test@g.com");
	}
	
	public void enterPassword() {
		WebElement passwordInput=driver.findElement(passwordInputLocator);
		passwordInput.sendKeys("Passkey");
	}
	
	public void clickLoginButton() {
		WebElement loginButton=driver.findElement(loginButtonLocator);
		loginButton.click();
	}
	
}
