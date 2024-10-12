package testNG.package2;
//using implicitWait with Duration class and ofSeconds() in it

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNG0034_ImplicitWait {
	@Test
	public void search_google() throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("http://www.google.com");
		WebElement e1 = driver.findElement(By.name("q"));  
		e1.sendKeys("India");
		e1.sendKeys(Keys.ENTER);
		driver.quit();
	}

}
