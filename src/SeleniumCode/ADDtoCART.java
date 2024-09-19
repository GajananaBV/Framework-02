package SeleniumCode;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class ADDtoCART {

	public static void main(String[] args) {
		https://rahulshettyacademy.com/AutomationPractice/
			System.setProperty("Webdriver.edge.driver","D:/Selenium Automation/edge/msgedgedriver");
					
					WebDriver driver= new EdgeDriver();
					driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
					driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
					List<WebElement> products = driver.findElements(By.xpath("//h4[@class='product-name']"));
					
					for(int i=0;i<products.size();i++)
					{
						String names = products.get(i).getText();
						if(names.contains("Cucumber"))
						{
							driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
							break;
							
						
					}
					

	}

	}}
