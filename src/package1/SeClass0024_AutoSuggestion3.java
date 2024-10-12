package package1;
//On 1mg application, type for cholesterol and selecting the 3rd autosuggested item

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeClass0024_AutoSuggestion3 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("https://www.1mg.com/");
		Thread.sleep(3000);
		WebElement e1 = driver.findElement(By.name("name"));
		e1.sendKeys("cholesterol");
		Thread.sleep(4000);
		List<WebElement> e2 = driver.findElements(By.xpath("//div[@class='styles__search-results-container___3OUHy']/ul/li"));
		e2.get(2).click();

	}

}
