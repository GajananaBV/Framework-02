package SeleniumCode;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddCart2 {

	public static void main(String[] args) throws InterruptedException  {

		
		System.setProperty("Webdriver.chrome.driver", "/Selenium Automation/chromedriver-win64/Chromedriver.exe");
		WebDriver driver= new ChromeDriver();

	
	
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		//WebDriverWait wait= new WebDriverWait (driver, 5);
	//	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h4[@class='product-name']")));
		
		List<WebElement> products = driver.findElements(By.xpath("//h4[@class='product-name']"));
		String[] addCartOption = {"Cucumber"};
		for (int i =0;i<products.size();i++) {
			String name= products.get(i).getText();
			List<String> OptionAddCart = Arrays.asList(addCartOption);
			if (OptionAddCart.contains(name)) {

				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				
			}

		}

	}

}
