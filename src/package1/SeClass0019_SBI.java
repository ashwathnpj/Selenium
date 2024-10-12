package package1;
//Launching the SBI website where right click is disabled and 
//click on continue to login button using LinkText or PartialLinkText 
//and add UserName and Password

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeClass0019_SBI {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
		Thread.sleep(3000);
		WebElement e1 = driver.findElement(By.partialLinkText("CONTINUE TO LOGIN"));
		e1.click();
		Thread.sleep(3000);
		WebElement e2 = driver.findElement(By.name("userName"));
		e2.sendKeys("demo123");
		WebElement e3 = driver.findElement(By.name("password"));
		e3.sendKeys("demo@123");
	}

}
