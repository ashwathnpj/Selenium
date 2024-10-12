package package1;
//Launching the facebook web application and log in to the page using "name" locator

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeClass0005_FacebookLogin {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize(); 
		driver.get("http://www.facebook.com");
		Thread.sleep(2000);
		WebElement e1=driver.findElement(By.name("email"));
		e1.sendKeys("demo123@gmail.com");
		Thread.sleep(1000);
		WebElement e2=driver.findElement(By.name("pass"));
		e2.sendKeys("1234@demo");
		Thread.sleep(1000);
		WebElement e3=driver.findElement(By.name("login"));
		e3.click();
		Thread.sleep(5000);
		driver.quit();


	}

}
