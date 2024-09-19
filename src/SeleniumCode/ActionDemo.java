package SeleniumCode;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class ActionDemo {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("Webdriver.chrome.driver", "/Selenium Automation/chromedriver-win64/Chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");

		Actions a= new Actions (driver);
		WebElement move = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		a.moveToElement(move).build().perform();
		a.moveToElement(driver.findElement(By.id("nav-search"))).click().keyDown(Keys.SHIFT).sendKeys("I-Phone").doubleClick().build().perform();
		Thread.sleep(2000);
		a.moveToElement(driver.findElement(By.id("nav-orders"))).contextClick().build().perform();
		
		
		
	}

}
