package stepsDefinations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.HomePageFactory;
import pageFactory.LoginPageFactory;

public class LoginStepsDefination {

	static WebDriver driver;
	LoginPageFactory login;
	HomePageFactory homepage;

	@Given("user is on login page")
	public void user_is_on_login_page() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.saucedemo.com/v1/");

	}

	@When("user enter {string} and {string}")
	public void user_enter_and(String username, String password) throws InterruptedException {
		/*
		 * driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys(username);
		 * driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys(password
		 * );
		 */

		login = new LoginPageFactory(driver);
		login.enterUsername(username);
		login.enterPassword(password);

	}

	@When("clicks on Login button")
	public void clicks_on_login_button() {
		// driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		login.clickOnLoginButton();
	}

	@Then("User should navigate to Home page")
	public void user_should_navigate_to_home_page() {
		// Assert.assertTrue(driver.findElements(By.xpath("//div[@class='app_logo']")).size()>0,"User
		// should navigate to Home page");
		homepage = new HomePageFactory(driver);
		homepage.isCartDisplayed();

	}

	@Then("user close the browser")
	public void user_close_the_browser() {
		driver.close();
	}

}
