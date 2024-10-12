package package1;
//Launching Amazon, searching mobiles, first product adding to cart 

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeClass0044_AddCart {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.navigate().to("http://www.amazon.in");

		WebElement e1 = driver.findElement(By.id("twotabsearchtextbox"));
		e1.sendKeys("mobiles" + Keys.ENTER);
		Thread.sleep(2000);
		WebElement e2 = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[3](//span[@class='a-size-medium a-color-base a-text-normal'])[3]"));
		e2.click();

		Set<String> s1 = driver.getWindowHandles();
		Iterator<String> i1 = s1.iterator();
		String p1 = i1.next();
		String c1 = i1.next();

		driver.switchTo().window(c1);

		Thread.sleep(2000);
		WebElement e3 = driver.findElement(
				By.xpath("(//span[@class='a-button a-spacing-small a-button-primary a-button-icon natc-enabled'])[2]"));
		e3.click();

	}

}
