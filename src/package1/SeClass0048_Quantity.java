package package1;
//Searching a product, increasing the quantity to 4 and add it to the cart on Amazon

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeClass0048_Quantity {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.navigate().to("http://www.amazon.in");

		WebElement e1 = driver.findElement(By.id("twotabsearchtextbox"));
		e1.sendKeys("soaps" + Keys.ENTER);
		Thread.sleep(2000);
		WebElement e2 = driver.findElement(By.xpath(
				"(//a[@class='a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal'])[6]"));
		e2.click();

		Set<String> s1 = driver.getWindowHandles();
		Iterator<String> i1 = s1.iterator();
		String p1 = i1.next();
		String c1 = i1.next();

		driver.switchTo().window(c1);

		Thread.sleep(2000);
		WebElement e3 = driver.findElement(By.name("quantity"));
		Select s2 = new Select(e3);
		s2.selectByIndex(3);

		Thread.sleep(2000);
		WebElement e4 = driver.findElement(By.xpath("(//span[@class='a-button-inner'])[2]"));
		e4.click();

	}

}
