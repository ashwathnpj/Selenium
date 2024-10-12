package package1;
//Launch web application and select the nth auto suggestion item 

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeClass0025_AutoSuggestion4 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("https://pharmeasy.in/");
		Thread.sleep(3000);
		WebElement e1 = driver.findElement(By.xpath("//div[@class='c-PJLV c-bXbWpx c-bXbWpx-icOztnM-css']"));
		e1.click();
		WebElement e2 = driver.findElement(By.id("topBarInput"));
		e2.sendKeys("cholesterol");
		Thread.sleep(3000);
		List<WebElement> e3 = driver.findElements(By.xpath("//div[@class='c-PJLV c-bXbWpx c-bXbWpx-bZJlhX-direction-column c-bXbWpx-iioqier-css']/a/div"));
		int count=e3.size();
		e3.get(count-1).click();

	}

}
