package testNG.package2;
//parallel testing, running multiple test cases in multiple browsers parallelly 
//search iphones in amazon 

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG0015_PTTestCase2 {
WebDriver driver;
	
	@Test
	@Parameters("browser")
	public void search(String nameofbrowser) throws InterruptedException {
		if (nameofbrowser.equals("chrome")) {
			driver = new ChromeDriver();
		}
		if (nameofbrowser.equals("firefox")) {
			driver = new FirefoxDriver();
		}
		if (nameofbrowser.equals("edge")) {
			driver = new EdgeDriver();
		}
		driver.get("http://www.amazon.in");
		WebElement e1 = driver.findElement(By.id("twotabsearchtextbox"));
		e1.sendKeys("iphones" + Keys.ENTER);
		driver.quit();

	}
}
