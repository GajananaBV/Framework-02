package SeleniumCode;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTest1 {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver", "/Selenium Automation/chromedriver-win64/Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	//CountOf ALL link	
	 int CountOfAllink = driver.findElements(By.tagName("a")).size();
System.out.println(CountOfAllink);


//CountOF Footer Link
WebElement footerLink = driver.findElement(By.id("gf-BIG"));

System.out.println(footerLink.findElements(By.tagName("a")).size());

//Count of Each section
WebElement EachSection = driver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
System.out.println(EachSection.findElements(By.tagName("a")).size());

//Link for EachSection
for(int i=1;i<EachSection.findElements(By.tagName("a")).size();i++)
{
	String ClickOnLink = Keys.chord(Keys.CONTROL,Keys.ENTER);
	EachSection.findElements(By.tagName("a")).get(i).sendKeys(ClickOnLink);

}

//get the Title of opened tab's

Set<String> tabs = driver.getWindowHandles();
Iterator<String> it = tabs.iterator();

while(it.hasNext())
{
	driver.switchTo().window(it.next());
	System.out.println(driver.getTitle());

}
	
	
	
	
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
