package testNG.package2;
//timeOut parameter using practical example
//ThreadTimeoutException 

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNG0011_timeOut {
	@Test(timeOut=12000)
	public void searchAmazon() {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.amazon.in");

		WebElement e1 = driver.findElement(By.id("twotabsearchtextbox"));
		e1.sendKeys("mobiles" + Keys.ENTER);
		driver.quit();
	}

}
