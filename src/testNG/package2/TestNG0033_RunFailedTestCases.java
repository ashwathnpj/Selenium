package testNG.package2;
//running the failed test case in the TestNg 
//failed tests separate xml file created, running that file

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNG0033_RunFailedTestCases {
	@Test
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
