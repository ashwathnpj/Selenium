package testNG.package2;
//registering on amazon with 6 data sets using data provider and assertion concept 

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNG0036_DataProviderAmazonRegistration {
	@DataProvider(name = "registration_details")
	public Object[][] method1() {
		Object[][] data = new Object[6][3];
		// set 1
		data[0][0] = "joe";// username 1
		data[0][1] = "8234567894";// mobile number 1
		data[0][2] = "demo@12345";// password 1

		// set 2
		data[1][0] = "joe root";// username 1
		data[1][1] = "9234567894";// mobile number 2
		data[1][2] = "demo1@12345";// password 1

		// set 3
		data[2][0] = "root";// username 1
		data[2][1] = "7834567894";// mobile number 3
		data[2][2] = "demo12@12345";// password 1

		// set 4
		data[3][0] = "root joe";// username 1
		data[3][1] = "9934567894";// mobile number 4
		data[3][2] = "demo8@12345";// password 1

		// set 5
		data[4][0] = "dr joe";// username 1
		data[4][1] = "8834567894";// mobile number 5
		data[4][2] = "demo98@12345";// password 1

		// set 6
		data[5][0] = "ashwathnarayan";// username 1
		data[5][1] = "8234567894";// mobile number 6
		data[5][2] = "demo2@12345";// password 1

		return data;

	}

	@Test(dataProvider = "registration_details")
	public void testcase1(String un, String pn, String pw) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		WebElement e1 = driver.findElement(By.id("nav-link-accountList"));
		Actions a1 = new Actions(driver);
		a1.moveToElement(e1).perform();
		WebElement e2 = driver.findElement(By.partialLinkText("Start here"));
		e2.click();
		driver.findElement(By.id("ap_customer_name")).sendKeys(un);
		driver.findElement(By.id("ap_phone_number")).sendKeys(pn);
		driver.findElement(By.id("ap_password")).sendKeys(pw);
		Thread.sleep(2000);
		driver.findElement(By.id("continue")).click();
		Assert.assertEquals(driver.getTitle(), "Authentication required");
		driver.quit();
	}

}
