package SeleniumCode;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class WebTableStream {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver", "/Selenium Automation/chromedriver-win64/Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.xpath("//tr/th[1]")).click();
		
		List<WebElement> elementList = driver.findElements(By.xpath("//tr/td[1]"));
		
		List<String> originaList = elementList.stream().map(s->s.getText()).collect(Collectors.toList());
		 List<String> sortedList = originaList.stream().sorted().collect(Collectors.toList());
	
		Assert.assertTrue(originaList.equals(sortedList));
		
	//WebElement Price = elementList.stream().filter(s->s.getText().contains("Beans")).map(s->s.getVPrice(s)).collect(Collectors.toList());
		

	}}
//	private static String getVPrice(WebElement s)

		
	


