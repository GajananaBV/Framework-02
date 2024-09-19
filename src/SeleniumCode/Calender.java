package SeleniumCode;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver", "/Selenium Automation/chromedriver-win64/Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
	//	driver.findElement(By.xpath("//a[text()='Top Deals']")).click();
	String month="12";
	String date= "10";
	String year= "2027";
	String[] ERDate= {month,date,year};
	
		driver.findElement(By.className("react-date-picker__inputGroup")).click();
		driver.findElement(By.className("react-calendar__navigation__label")).click();
		driver.findElement(By.className("react-calendar__navigation__label")).click();
		driver.findElement(By.xpath("//button[text()='"+year+"']")).click();
		driver.findElements(By.className("react-calendar__year-view__months__month")).get(Integer.parseInt(month)-1).click();
		driver.findElement(By.xpath("//abbr[text()='"+date+"']")).click();
		//System.out.println(driver.findElement(By.cssSelector(".react-date-picker__inputGroup")));
		//get Whole data
		List<WebElement> MyDate = driver.findElements(By.className("react-date-picker__inputGroup"));
		for(int i=0;i<MyDate.size();i++)
		{
			System.out.println(MyDate.get(i).getAttribute("value"));
			
		}
		
		
		
		
		
		
		
		
		
		
		//a[text()='Top Deals']
	}

}
