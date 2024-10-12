package testNG.package2;
//amazon searching by passing the 5 inputs for a product(using Data provider) 
//and confirming that test cases are pass or not

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNG0029_DataProviderAmazonSearch {
	@DataProvider(name = "search")
	public Object[][] method1() {
		return new Object[][] {{"nokia"},{"samsung"},{"apple"},{"realme"},{"vivo"}};
	}

	@Test(dataProvider = "search")
	public void testcase1(String word) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement e1 = driver.findElement(By.id("twotabsearchtextbox"));
		e1.sendKeys(word+Keys.ENTER);
		driver.quit();
		
	}
}
