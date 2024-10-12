package testNG.package2;
//taking screenshot of passed test case and failed test case in separate folder
//using a concept of ITestListener

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(testNG.package2.TestNG0037_ITestListener.class)
public class TestNG0037_ITestListener1 extends TestNG0037_ITestListener {
	@Test
	public void googleSearch() throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.get("http://www.google.com");
		WebElement e1=driver.findElement(By.name("q"));
		e1.sendKeys("India"+Keys.ENTER);
		WebElement e2=driver.findElement(By.xpath("(//h3[@class='LC20lb MBeuO DKV0Md'])[7]"));
		e2.click();
		//Assert.assertTrue(false); //purposefully fail
		
	}

}
