package SeleniumCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

import java.time.Duration;

public class Locator1 {

	public static void main(String[] args) 
	{
		System.setProperty("Webdriver.edge.driver","D:/Selenium Automation/edge/msgedgedriver");
		
		WebDriver driver= new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demoqa.com/login");
		
		System.out.println((driver.findElement(By.xpath("//h2")).getText()));
		Assert.assertEquals(driver.findElement(By.xpath("//h2")).getText(), "Welcome,");
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	//	driver.findElement(By.id("newUser")).click();
		//driver.findElement(By.id("firstname")).sendKeys("Gajanan")
	//	driver.findElement(By.id("firstname")).sendKeys("Gajanan")
	//	driver.findElement(By.id("firstname")).sendKeys("Gajanan")
		driver.close();
	}
	

}
