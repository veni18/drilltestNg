package StepDefinitions;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Hotel {
	@Test

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\krishnavenik\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 
        driver.get("https://adactinhotelapp.com/index.php");
    	driver.findElement(By.xpath("(//input[@ name='username'])[1]")).sendKeys("Ssabari99");
    	driver.findElement(By.xpath("//input[@id='password'] ")).sendKeys("asdf1234");
    	driver.findElement(By.xpath("//input[@id='login']")).click();
    	
    	WebElement loc = driver.findElement(By.xpath("//select[@name='location']"));
    	Select s = new Select(loc);
    	s.selectByValue("Sydney");
    	
    	WebElement hotel = driver.findElement(By.xpath("//select[@name='hotels']"));
    	Select s1 = new Select( hotel);
    	s1.selectByValue("Hotel Creek");
    	
    	WebElement type = driver.findElement(By.xpath("//select[@name='room_type']"));
    	Select s2 = new Select(type);
    	s2.selectByValue("Standard");
    	
    	WebElement noRoom = driver.findElement(By.id("room_nos"));
    	Select s3= new Select(noRoom);
    	s3.selectByVisibleText("1 - One");
    	
		WebElement Adult = driver.findElement(By.id("adult_room"));	
		Select s4 = new Select(Adult);
		s4.selectByVisibleText("1 - One");
		
		
		WebElement child = driver.findElement(By.xpath("//select[@id='child_room']"));	
		Select s5 = new Select(child);
		s5.selectByVisibleText("1 - One");	
		
		driver.findElement(By.xpath("//input[@id='Submit']")).click();
		driver.findElement(By.id("radiobutton_0")).click();
		driver.findElement(By.id("continue")).click();
    	driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("sabarish");
    	driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("Balachandran");
    	driver.findElement(By.xpath("//textarea[@name='address']")).sendKeys("perumbur,chennai-97");
    	driver.findElement(By.xpath("//input[@name='cc_num']")).sendKeys("4500248738291008");
    	WebElement card= driver.findElement(By.xpath("//select[@name='cc_type']"));	
		Select s6 = new Select(card);
		s6.selectByVisibleText("American Express");	
    	driver.findElement(By.xpath("//input[@name='cc_cvv']")).sendKeys("876");
    	WebElement month= driver.findElement(By.xpath("//select[@name='cc_exp_month']"));	
		Select s7 = new Select(month);
		s7.selectByVisibleText("January");	
		WebElement year= driver.findElement(By.xpath("//select[@name='cc_exp_year']"));	
		Select s8 = new Select(year);
		s8.selectByVisibleText("2021");
		driver.findElement(By.xpath("//input[@type='button']")).click();
		driver.findElement(By.xpath("//input[@id='search_hotel']")).click();
		
		
    	
 }
}


