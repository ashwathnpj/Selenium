package package1;
//fill the form and refresh 

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeClass0034_Refresh {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		// driver.get("https://grotechminds.com/registration/");
		// second way of launching particular url
		driver.navigate().to("https://grotechminds.com/registration/");
		Thread.sleep(3000);

		WebElement e1 = driver.findElement(By.name("fname"));
		e1.sendKeys("demo");
		WebElement e2 = driver.findElement(By.name("lname"));
		e2.sendKeys("data");
		WebElement e3 = driver.findElement(By.name("email"));
		e3.sendKeys("demodata123@gmail.com");
		WebElement e4 = driver.findElement(By.name("password"));
		e4.sendKeys("demo@1234");
		WebElement e5 = driver.findElement(By.id("male"));
		e5.click();
		WebElement e6 = driver.findElement(By.name("Skills"));
		Select s1 = new Select(e6);
		s1.selectByIndex(1);
		WebElement e7 = driver.findElement(By.name("Country"));
		Select s2 = new Select(e7);
		s2.selectByVisibleText("India");
		WebElement e8 = driver.findElement(By.name("Present-Address"));
		e8.sendKeys("H.no. 100, near mobile shop, Bengaluru, Karnataka, India");
		WebElement e9 = driver.findElement(By.name("Permanent-Address"));
		e9.sendKeys("H.no. 100, near mobile shop, Bengaluru, Karnataka, India");
		WebElement e10 = driver.findElement(By.name("Pincode"));
		e10.sendKeys("585585");
		WebElement e11 = driver.findElement(By.id("Relegion"));
		Select s3 = new Select(e11);
		s3.selectByVisibleText("Hindu");
		WebElement e12 = driver.findElement(By.id("relocate"));
		e12.click();

		Thread.sleep(3000);
		driver.navigate().refresh();

	}

}
