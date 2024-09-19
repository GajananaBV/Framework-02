package SeleniumCode;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;
public class UpdatedDropdown {

	public static void main(String[] args) throws InterruptedException 
	{
System.setProperty("Webdriver.edge.driver","D:/Selenium Automation/edge/msgedgedriver");
		
		WebDriver driver= new EdgeDriver();
		
		driver.get("https://www.kayak.co.in/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		WebElement D = driver.findElement(By.xpath("//div[text()='1 adult']"));
		System.out.println(D.getText());
		Thread.sleep(2000);
		int i=0;
		while(i<5) {
			driver.findElement(By.xpath("//button[@class='T_3c-button'][2]"));
			i++;
			System.out.println(D.getText());
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h2[text()=\"Save up to 20% on flights – Compare 100s of travel sites at once\"])")).click();
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
