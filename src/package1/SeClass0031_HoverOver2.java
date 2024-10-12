package package1;
//On the flipkart website,hover overing home and furniture 
//and then hover overing home decor and then clicking on clocks

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeClass0031_HoverOver2 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		WebElement e1 = driver.findElement(By.xpath("(//span)[15]"));
		Actions a1 = new Actions(driver);
		a1.moveToElement(e1).perform();
		WebElement e2 = driver.findElement(By.linkText("Home Decor"));
		a1.moveToElement(e2).perform();
		WebElement e3 = driver.findElement(By.linkText("Clocks"));
		e3.click();
	}
}
