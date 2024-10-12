package package1;
//Login to grotechminds web application and entering username and copy paste to last name field 

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeClass0012_CopyText {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/registration/");
		Thread.sleep(2000);
		WebElement e1 = driver.findElement(By.name("fname"));
		e1.sendKeys("Ashwathnarayan");
		Thread.sleep(2000);
		e1.click();
		Thread.sleep(2000);
		e1.sendKeys(Keys.CONTROL+"A");
		Thread.sleep(2000);
		e1.sendKeys(Keys.CONTROL+"C");
		WebElement e2 = driver.findElement(By.name("lname"));
		e2.sendKeys(Keys.CONTROL+"V");
	
	}

}
