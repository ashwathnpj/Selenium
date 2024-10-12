package package1;
//Launching the google page search for India and Enter using Enter key using "name" locator

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

public class SeClass0004_SearchIndia {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		Thread.sleep(2000);
		WebElement e1 = driver.findElement(By.name("q"));
		
		e1.sendKeys("India");
		Thread.sleep(500);
		e1.sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		driver.quit();
	}

}
