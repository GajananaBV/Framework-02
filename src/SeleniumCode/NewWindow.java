package SeleniumCode;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindow {

	public static void main(String[] args)
	{
		System.setProperty("Webdriver.chrome.driver", "/Selenium Automation/chromedriver-win64/Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		//open new tab
		driver.switchTo().newWindow(WindowType.TAB);
		
		Set<String> window = driver.getWindowHandles();
		Iterator<String> it = window.iterator();
		String parentId = it.next();
		String ChildID = it.next();
		driver.switchTo().window(ChildID);
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		String PrintChild = driver.findElement(By.xpath("//div[text()='GREEN']")).getText();
		System.out.println(PrintChild);
		
		driver.switchTo().window(parentId);
		
	driver.findElement(By.xpath("//form//input[@name='name']")).sendKeys("Gajanan");
		System.out.println();
		driver.quit();

	}

}
