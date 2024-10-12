package package1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeClass0023_AutoSuggestion2 {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		Thread.sleep(3000);
		WebElement e1 = driver.findElement(By.name("search_query"));
		e1.sendKeys("modi");
		Thread.sleep(4000);
		List<WebElement> e2 = driver.findElements(By.xpath("sbsb_b"));
		e2.get(4).click();
	}

}
