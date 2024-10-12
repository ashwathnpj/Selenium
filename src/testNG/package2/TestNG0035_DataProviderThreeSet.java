package testNG.package2;
//amazon login with four set of data (using Data provider)

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNG0035_DataProviderThreeSet {
	@DataProvider(name = "login_details")
	public Object[][] method1() {
		Object[][] data = new Object[4][2];
		// set 1
		data[0][0] = "8793925915";// username 1
		data[0][1] = "dfgbng";// password 1
		// set 2
		data[1][0] = "stbymkt@gmail.com";// username 2
		data[1][1] = "dfgtr";// password 2
		// set 3
		data[2][0] = "india1@gmail.com";// username 3
		data[2][1] = "rtghgrfg";// username 3

		// set 4
		data[3][0] = "india2@gmail.com";// username 4
		data[3][1] = "rtghgr123";// username 4

		return data;

	}

	@Test(dataProvider = "login_details")
	public void testcase1(String un, String pwd) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement e1 = driver.findElement(By.id("nav-link-accountList"));
		Actions a1 = new Actions(driver);
		a1.moveToElement(e1).perform();
		WebElement e2 = driver.findElement(By.linkText("Sign in"));
		e2.click();
		driver.findElement(By.name("email")).sendKeys(un);
		driver.findElement(By.className("a-button-input")).click();
		driver.findElement(By.id("ap_password")).sendKeys(pwd);
		driver.findElement(By.id("signInSubmit")).click();
		driver.quit();
	}
}
