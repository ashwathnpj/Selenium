package package1;
//login to facebook using relative xpath 

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeClass0013_RelativeXPath {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		WebElement e1 = driver.findElement(By.xpath("(//input)[3]"));
		e1.sendKeys("demo@gmail.com");
		Thread.sleep(2000);
		WebElement e2 = driver.findElement(By.xpath("(//input)[4]"));
		e2.sendKeys("demo123");
		Thread.sleep(2000);
		WebElement e3 = driver.findElement(By.xpath("//button"));
		e3.click();
		Thread.sleep(2000);
		
	}

}
