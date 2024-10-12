package testNG.package2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG0027_AssertEqualsAmazon {
	WebDriver driver;

	@Test
	public void amazon_assertion() throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

		WebElement e1 = driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
		e1.click();

		WebElement e2 = driver.findElement(By.id("ap_email"));
		e2.sendKeys("demo@gmail.com");

		WebElement e3 = driver.findElement(By.id("continue"));
		e3.click();

		WebElement e4 = driver.findElement(By.id("ap_password"));
		e4.sendKeys("1234@demo");

		WebElement e5 = driver.findElement(By.id("signInSubmit"));
		e5.click();

		Thread.sleep(5000);
		WebElement e6 = driver.findElement(By.id("twotabsearchtextbox"));

		// Assert.assertEquals(driver.getTitle(),"Online Shopping site in India: Shop
		// Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
		Assert.assertEquals(e6.isDisplayed(), true);

	}
}
