package testNG.package2;
//parallel testing, running multiple test cases in multiple browsers parallelly 
//search mobiles in amazon, click on first product, click on buy

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG0015_PTTestCase1 {
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
		e1.sendKeys("mobiles" + Keys.ENTER);
		Thread.sleep(2000);
		WebElement e2 = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[3]"));
		e2.click();

		Set<String> s1 = driver.getWindowHandles();
		Iterator<String> i1 = s1.iterator();
		String p1 = i1.next();
		String c1 = i1.next();

		driver.switchTo().window(c1);

		Thread.sleep(2000);
		WebElement e3 = driver.findElement(By.xpath("(//input[@class='a-button-input'])[6]"));
		e3.click();
		driver.quit();

	}
}
