package package1;
//Searching any product and sorting them using the newest arrivals criteria.

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeClass0049_NewestArrival {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.navigate().to("http://www.amazon.in");

		WebElement e1 = driver.findElement(By.id("twotabsearchtextbox"));
		e1.sendKeys("soaps" + Keys.ENTER);
		Thread.sleep(2000);

		WebElement e2 = driver.findElement(By.xpath("//span[@class='a-button-text a-declarative']"));
		e2.click();
		WebElement e3 = driver.findElement(By.xpath("(//li[@class='a-dropdown-item'])[5]"));
		e3.click();

	}

}
