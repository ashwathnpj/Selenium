package testNG.package2;
//to execute two different test cases using extends keyword 
//Class1-search product,
//Class2-search and add to cart product 

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestNG0012_TestCase1 extends TestNG0012_LaunchQuit {
	@Test
	public void search() {
		WebElement e1 = driver.findElement(By.id("twotabsearchtextbox"));
		e1.sendKeys("mobiles" + Keys.ENTER);
	}

}
