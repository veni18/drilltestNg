package StepDefinitions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.*;
import org.testng.annotations.Test;
 
public class ParallelTest {
 
 @Test
 public void data() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\krishnavenik\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/index.php");
    	driver.findElement(By.xpath("(//input[@ name='username'])[1]")).sendKeys("Ssabari99");
    	driver.findElement(By.xpath("//input[@id='password'] ")).sendKeys("asdf1234");
    	driver.findElement(By.xpath("//input[@id='login']")).click();
 
  }
 
   }
