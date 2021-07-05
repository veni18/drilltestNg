package StepDefinitions;

import java.io.File;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestExecutions {
	public static WebDriver driver;
	@Before
	public void test() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\krishnavenik\\eclipse-workspace\\Cucumber\\lib\\chromedriver.exe");
		driver =  new ChromeDriver();
		driver.manage().window().maximize();
	}
	@Given("^user is on homepage$")
	public void user_is_on_homepage() throws Throwable {
		
        driver.get("https://www.redbus.com/");
		
	}

	@When("^user navigates to Login Page$")
	public void user_navigates_to_Login_Page() throws Throwable {
		 driver.findElement(By.linkText("Sign in")).click();
	}

	@When("^user enters username and Password$")
	public void user_enters_username_and_Password() throws Throwable {
		driver.findElement(By.id("email")).sendKeys("blog.cucumber@gmail.com");
        driver.findElement(By.id("passwd")).sendKeys("Cucumber@blog");
        driver.findElement(By.id("SubmitLogin")).click();   
	}

	@Then("^success message is displayed$")
	public void success_message_is_displayed() throws Throwable {
	    System.out.println("Done............");
		 Thread.sleep(3000);
		  
	}
	
	@After
	public void test1() {
		driver.quit(); 
	}

}