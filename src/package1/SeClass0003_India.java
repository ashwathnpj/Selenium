package package1;
//Launching the google page search for India and click using "name" Locator

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeClass0003_India {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize(); 
		driver.get("http://www.google.com");
		Thread.sleep(2000);
		WebElement e1=driver.findElement(By.name("q"));
		e1.sendKeys("India");
		Thread.sleep(2000);
		WebElement e2=driver.findElement(By.name("btnK"));
		e2.click();
		Thread.sleep(5000);
		driver.quit();
	}

}
