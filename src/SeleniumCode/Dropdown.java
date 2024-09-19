package SeleniumCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.edge.driver","D:/Selenium Automation/edge/msgedgedriver");
		
		WebDriver driver= new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		WebElement StaticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select Dropdown= new Select(StaticDropdown);
		Dropdown.selectByIndex(2);
		System.out.println(Dropdown.getFirstSelectedOption().getText());

		Dropdown.selectByVisibleText("INR");
		System.out.println(Dropdown.getFirstSelectedOption().getText());
		
		Dropdown.selectByValue("USD");
		System.out.println(Dropdown.getFirstSelectedOption().getText());
		
		
		
		//driver.close();
		
		
	}

}
