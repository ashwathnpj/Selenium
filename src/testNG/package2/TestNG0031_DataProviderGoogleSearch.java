package testNG.package2;
//google searching by passing the 3 inputs (using Data provider)

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNG0031_DataProviderGoogleSearch {
	@DataProvider(name = "search")
	public Object[][] method1() {
		return new Object[][] {{"Bharata"},{"Mobiles"},{"Books"}};
	}

	@Test(dataProvider = "search")
	public void testcase1(String word) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		WebElement e1 = driver.findElement(By.name("q"));
		e1.click();
		e1.sendKeys(word+Keys.ENTER);
		Thread.sleep(3000);
		driver.quit();
		
	}
}
