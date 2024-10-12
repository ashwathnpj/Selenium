package package1;
//Launching web application sbi where right click is disabled and registering using dummy data

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeClass0007_RightClickDisabled {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
		Thread.sleep(2000);
		WebElement e4 = driver.findElement(By.partialLinkText("CONTINUE TO LOGIN"));
		e4.click();
		Thread.sleep(2000);
		WebElement e1 = driver.findElement(By.name("userName"));
		e1.sendKeys("demo@gmail.com");
		WebElement e2 = driver.findElement(By.name("password"));
		e2.sendKeys("a@12345678");
		Thread.sleep(2000);
		WebElement e3 = driver.findElement(By.id("Button2"));
		e3.click();

	}

}
