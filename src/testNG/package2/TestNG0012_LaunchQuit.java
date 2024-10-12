package testNG.package2;
//to execute two different test cases using extends keyword 
//Class1-search product,
//Class2-search and add to cart product 

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestNG0012_LaunchQuit {
	ChromeDriver driver;
	@BeforeMethod
	public void launch() {
		driver = new ChromeDriver();
		driver.get("http://www.amazon.in");
		driver.manage().window().maximize();
	}

	@AfterMethod
	public void quit() {
		driver.quit();
	}

}
