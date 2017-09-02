package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.*;
//import org.openqa.selenium.chrome.ChromeDriver;

import BrowserFactory.BrowserFactory;



public class Login_Steps 
{
	WebDriver driver = BrowserFactory.getBrowser("IE");
	
	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable {
		
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://www.google.com");
		}

	@When("^User Navigate to LogIn Page$")
	public void user_Navigate_to_LogIn_Page() throws Throwable {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[contains(text(),'Gmail')]")).click();
		}

	@When("^User enters UserName and Password$")
	public void user_enters_UserName_and_Password() throws Throwable {
		driver.findElement(By.xpath("//a[@data-g-label='Sign in']")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("sapna.jujare"); 
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		}

	@Then("^Message displayed Login Successfully$")
	public void message_displayed_Login_Successfully() throws Throwable {
		System.out.println("Login Successfully");
		BrowserFactory.closeAllDriver();

	}
}
