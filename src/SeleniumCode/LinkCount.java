package SeleniumCode;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkCount {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver", "/Selenium Automation/chromedriver-win64/Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		// total link Count =27

		System.out.println((driver.findElements(By.tagName("a")).size()));

// footerlink count =20

		WebElement footerLink = driver.findElement(By.id("gf-BIG"));
		System.out.println(footerLink.findElements(By.tagName("a")).size());

		// calculate total count link for one scetion ..Discount Coupons
		// table/tbody/tr/td[1]/ul
		WebElement OneSection = footerLink.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		OneSection.findElements(By.tagName("a")).size();

		for (int i = 1; i < OneSection.findElements(By.tagName("a")).size(); i++) {

			String Clickoptio = Keys.chord(Keys.CONTROL, Keys.ENTER);

			OneSection.findElements(By.tagName("a")).get(i).sendKeys(Clickoptio);

		}

	}

}
