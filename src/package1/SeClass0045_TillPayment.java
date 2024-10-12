package package1;
//Launching Amazon, searching mobiles, first product adding to cart 
//till payment page 

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class SeClass0045_TillPayment {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.navigate().to("http://www.amazon.in");

		// sign in button
		WebElement e10 = driver.findElement(By.id("nav-link-accountList"));
		Actions a1 = new Actions(driver);
		a1.moveToElement(e10).perform();
		WebElement e11 = driver.findElement(By.xpath("//span[@class='nav-action-inner']"));
		e11.click();

		// sign in
		WebElement mobile = driver.findElement(By.id("ap_email"));
		mobile.sendKeys("anpjoshi6@gmail.com"); // enter email or mobile number to login
		Thread.sleep(1000);
		WebElement continue1 = driver.findElement(By.id("continue"));
		continue1.click();

		Thread.sleep(2000);
		WebElement password = driver.findElement(By.id("ap_password"));
		password.sendKeys(""); // enter password to login
		WebElement signin = driver.findElement(By.id("signInSubmit"));
		signin.click();

		Thread.sleep(4000);
		WebElement e1 = driver.findElement(By.id("twotabsearchtextbox"));
		e1.sendKeys("mobiles" + Keys.ENTER);
		Thread.sleep(2000);
		WebElement e2 = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[3]"));
		e2.click();

		Set<String> s1 = driver.getWindowHandles();
		Iterator<String> i1 = s1.iterator();
		String p1 = i1.next();
		String c1 = i1.next();

		driver.switchTo().window(c1);

		Thread.sleep(2000);
		WebElement e3 = driver.findElement(By.id("buy-now-button"));
		e3.click();

	}

}
