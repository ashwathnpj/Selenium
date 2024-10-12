package testNG.package2;
//parallel testing, running test cases in multiple browsers parallelly 

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG0014_ParallelTesting {
	WebDriver driver;

	@Test
	@Parameters("browser")
	public void search(String nameofbrowser) {
		if (nameofbrowser.equals("chrome")) {
			driver = new ChromeDriver();
		}
		if (nameofbrowser.equals("firefox")) {
			driver = new FirefoxDriver();
		}
		driver.get("http://www.amazon.in");
		WebElement e1 = driver.findElement(By.id("twotabsearchtextbox"));
		e1.sendKeys("mobiles" + Keys.ENTER);
		driver.quit();

	}

}
