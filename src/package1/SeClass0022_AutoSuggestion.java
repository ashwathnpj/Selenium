package package1;
//Selecting the 4th auto suggestion item on the flipkart application by searching shoes
//right click on auto suggestion, it will goes off

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeClass0022_AutoSuggestion {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		WebElement e1 = driver.findElement(By.name("q"));
		e1.sendKeys("shoes");
		Thread.sleep(4000);
		List<WebElement> e2 = driver.findElements(By.xpath("//ul[@class='_1sFryS _2x2Mmc _3ofZy1']/li/div"));
		e2.get(3).click();

	}

}
