package testNG.package2;
//to execute two different test cases using extends keyword 
//Class1-search product,
//Class2-search and add to cart product 

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestNG0012_TestCase2 extends TestNG0012_LaunchQuit {
	@Test
	public void search() {
		// searching a product
		WebElement e1 = driver.findElement(By.id("twotabsearchtextbox"));
		e1.sendKeys("mobiles" + Keys.ENTER);

		// first product click
		WebElement e2 = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[3]"));
		e2.click();

		Set<String> s1 = driver.getWindowHandles();
		Iterator<String> i1 = s1.iterator();
		String p1 = i1.next();
		String c1 = i1.next();

		driver.switchTo().window(c1);

		// add to cart
		WebElement e3 = driver.findElement(
				By.xpath("(//span[@class='a-button a-spacing-small a-button-primary a-button-icon natc-enabled'])[2]"));
		e3.click();
	}

}
