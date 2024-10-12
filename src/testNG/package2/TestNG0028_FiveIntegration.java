package testNG.package2;
//five cases of integration and using assertion

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG0028_FiveIntegration {

	WebDriver driver;

	@Test
	// checking offers page integrated correctly
	public void offersPage() throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://pharmeasy.in/");
		WebElement e1 = driver.findElement(By.partialLinkText("Offers"));
		Thread.sleep(2000);
		e1.click();
		Assert.assertEquals(driver.getTitle(), "PharmEasy™ Offers & Coupon Codes: Upto 80% OFF, Cashbacks & more");
		driver.quit();
	}

	@Test(priority = 1)
	// checking offers page and clicking on logo back to home page integrated
	// correctly
	public void logoPage() throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://pharmeasy.in/");
		WebElement e1 = driver.findElement(By.partialLinkText("Offers"));
		Thread.sleep(2000);
		e1.click();
		WebElement e2 = driver.findElement(By.xpath("(//div)[5]"));
		e2.click();
		Assert.assertEquals(driver.getTitle(),
				"PharmEasy: Online Pharmacy & Medical Store in India | 50 Lakhs+ Customers.");
		driver.quit();
	}

	@Test(priority = 2)
	// checking fullBodyCheckup page integrated correctly
	public void fullBodyCheckupPage() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://pharmeasy.in/");
		WebElement e3 = driver.findElement(By.xpath("(//img[@class='c-PJLV'])[6]"));
		e3.click();
		Assert.assertEquals(driver.getTitle(), "Collection Page");
		driver.quit();
	}

	@Test(priority = 3)
	// checking offers page integrated correctly
	public void aboutUsPage() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://pharmeasy.in/");
		WebElement e4 = driver.findElement(By.xpath("(//div[@id='pageLink-Company-0-0'])[2]"));
		e4.click();
		Assert.assertEquals(driver.getTitle(), "About Us | PharmEasy");
		driver.quit();
	}

	@Test(priority = 4)
	// checking offers page and first offer page integrated correctly
	public void offersAndFirstProductPage() throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://pharmeasy.in/");
		WebElement e1 = driver.findElement(By.partialLinkText("Offers"));
		Thread.sleep(2000);
		e1.click();
		WebElement e2 = driver.findElement(By.xpath("(//div[@class='OffersCard_title__nX7J_'])[1]"));
		Thread.sleep(2000);
		e2.click();
		Assert.assertEquals(driver.getTitle(), "Flat 24% Off on medicines");
		driver.quit();
	}
}
