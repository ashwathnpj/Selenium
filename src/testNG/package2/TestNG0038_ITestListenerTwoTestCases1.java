package testNG.package2;
//running two test cases 
//taking screenshots of passed test case and failed test case in separate folder
//using a concept of ITestListener
//we also do by writing two test cases in different classes and run in xml

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(testNG.package2.TestNG0038_ITestListenerTwoTestCases.class)
public class TestNG0038_ITestListenerTwoTestCases1 extends TestNG0038_ITestListenerTwoTestCases{
	
	@BeforeMethod
    public void launch() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.google.com");
    }
	@Test
	public void googlePostOffice() throws InterruptedException {
		WebElement e1=driver.findElement(By.name("q"));
		e1.sendKeys("India"+Keys.ENTER);
		WebElement e2=driver.findElement(By.xpath("(//h3[@class='LC20lb MBeuO DKV0Md'])[7]"));
		e2.click();
		//Assert.assertTrue(false); //purposefully fail
		
	}
	
	@Test
	public void googleWiki() throws InterruptedException {
		WebElement e2=driver.findElement(By.name("q"));
		e2.sendKeys("India"+Keys.ENTER);
		WebElement e3=driver.findElement(By.xpath("(//div[@class='notranslate HGLrXd NJjxre iUh30 ojE3Fb'])[6]"));
		e3.click();
		//Assert.assertTrue(false); //purposefully fail
		
	}
	
	@AfterMethod
	public void Quit() throws InterruptedException {
		Thread.sleep(6000);
		driver.quit();
	}

}
