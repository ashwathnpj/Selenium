package testNG.package2;
//youtube searching by passing the 5 inputs for a product(using Data provider) 
//and confirming that test cases are pass or not

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNG0030_DataProviderYoutubeSearch {
	@DataProvider(name = "search")
	public Object[][] method1() {
		return new Object[][] {{"nokia new mobiles"},{"samsung new mobiles"},{"apple new mobiles"},{"realme new mobiles"},{"vivo new mobiles"}};
	}

	@Test(dataProvider = "search")
	public void testcase1(String word) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com");
		driver.manage().window().maximize();
		WebElement e1 = driver.findElement(By.name("search_query"));
		e1.click();
		e1.sendKeys(word+Keys.ENTER);
		Thread.sleep(3000);
		driver.quit();
		
	}

}
