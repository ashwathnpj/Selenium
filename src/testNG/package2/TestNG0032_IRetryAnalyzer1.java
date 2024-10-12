package testNG.package2;
//retrying a failed test case using IretryAnalyzer interface

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNG0032_IRetryAnalyzer1 {
	@Test(retryAnalyzer = testNG.package2.TestNG0032_IRetryAnalyzer.class)
	public void google_search() throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		Thread.sleep(2000);
		WebElement e1 = driver.findElement(By.name("qr")); //purposefully failed 
		e1.sendKeys("India");
		Thread.sleep(500);
		e1.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		driver.quit();
	}
}
