package package1;
//Launching the Amazon and clicking on the Sign in button 
//and using "name" Locator add UserName, Continue 

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeClass0006_AmazonSignIn {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		WebElement e1 = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		e1.click();
		Thread.sleep(1000);
		WebElement e2 = driver.findElement(By.name("email"));
		e2.sendKeys("demo@gmail.com");
		Thread.sleep(1000);
		
		WebElement e3 = driver.findElement(By.id("continue"));
		Thread.sleep(1000);
		e3.click();
		
	}

}
