package package1;
//Launching flipkart and searching product and clicking on first product and adding to cart

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeClass0051_FlipkartAddCart {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.navigate().to("https://www.flipkart.com/");
		
		WebElement e1=driver.findElement(By.name("q"));
		e1.sendKeys("mobiles"+Keys.ENTER);
		Thread.sleep(2000);
		
		WebElement e2=driver.findElement(By.xpath("(//div[@class='KzDlHZ'])[3]"));
		e2.click();
		
		Set<String> s1 = driver.getWindowHandles();
		Iterator<String> i1 = s1.iterator();
		String p1 = i1.next();
		String c1 = i1.next();

		driver.switchTo().window(c1);
		
		WebElement e3=driver.findElement(By.xpath("//button[@class='QqFHMw vslbG+ In9uk2']"));
		e3.click();
		
		
		


	}

}
