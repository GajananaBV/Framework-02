package SeleniumCode;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class ScrollTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver", "/Selenium Automation/chromedriver-win64/Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		
		
		
		//table value
		List<WebElement> value = driver.findElements(By.xpath("//div[@class='tableFixHead']//td[4]"));
		int sum =0;
		for(int i=0; i<value.size();i++)
		{
			System.out.println( value.get(i).getText());
			sum= sum + Integer.parseInt(value.get(i).getText());
			
		}
		System.out.println(sum);
		
		String TotalValue = driver.findElement(By.xpath("//div[@class='totalAmount']")).getText();
		System.out.println(TotalValue.split(":")[1].trim());
		String TOtal = TotalValue.split(":")[1].trim();
		int Actual = Integer.parseInt(TOtal);
		
		Assert.assertEquals(sum, Actual);
	}

}
