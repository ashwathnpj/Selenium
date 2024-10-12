package testNG.package2;
//using Annotations, launching the Amazon website, search for a product 
//and add the product to the cart and close the browser 

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG0010_Amazon {
	ChromeDriver driver;

	@BeforeMethod
	public void launch() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.amazon.in");
	}

	@Test
	public void searchAddtoCart() {
		WebElement e1 = driver.findElement(By.id("twotabsearchtextbox"));
		e1.sendKeys("mobiles" + Keys.ENTER);
		WebElement e2 = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[3]"));
		e2.click();

		Set<String> s1 = driver.getWindowHandles();
		Iterator<String> i1 = s1.iterator();
		String p1 = i1.next();
		String c1 = i1.next();

		driver.switchTo().window(c1);
		WebElement e3 = driver.findElement(
				By.xpath("(//span[@class='a-button a-spacing-small a-button-primary a-button-icon natc-enabled'])[2]"));
		e3.click();

	}

	@AfterMethod
	public void quit() {
		driver.quit();
	}

}
