package package1;
////Launching Amazon, searching mobiles, first product wishlist 

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeClass0047_WishList {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.navigate().to("http://www.amazon.in");
		
		Thread.sleep(2000);
		WebElement e12 = driver.findElement(By.id("twotabsearchtextbox"));
		e12.sendKeys("mobiles" + Keys.ENTER);
		Thread.sleep(2000);
		WebElement e14 = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[3]"));
		e14.click();

		Set<String> s1 = driver.getWindowHandles();
		Iterator<String> i1 = s1.iterator();
		String p1 = i1.next();
		String c1 = i1.next();

		driver.switchTo().window(c1);

		Thread.sleep(2000);
		WebElement wishlist = driver.findElement(By.linkText("Add to Wish List"));
		  wishlist.click();
		
	}

}
