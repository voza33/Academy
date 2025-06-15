package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Pages.LoginPage;
import io.cucumber.java.*;
import io.cucumber.java.en.*;
import io.cucumber.messages.types.Duration;

public class LoginPageSteps {

	private WebDriver driver;
	private LoginPage loginPage;
	
	@Before
	public 	void setup() {
		driver = new ChromeDriver();
	}
	
	@After
	public void tearDown() {
		if(driver!=null) {
			driver.quit();
		}
	}
	
	@Given("I am on the Academy login page")
    public void user_is_on_login_page() {
		driver.get("https://rahulshettyacademy.com/");
		loginPage=new LoginPage(driver);
		 try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

	@When("I have entered a valid username and password")
    public void user_enters_valid_username_password() {
        loginPage.enterEmail();
        try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        loginPage.enterPassword();
        try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    @Given("I click on Login button")
    public void user_clicks_on_login_button() {
        loginPage.clickLoginButton();
        try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    @Then("I am at home page of acadamey website")
    public void user_is_navigated_to_the_homepage() {
        Assert.assertEquals("logout", true);
    }
}
