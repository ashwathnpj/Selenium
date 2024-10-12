package package1;
//Launching a google and typing Bengaluru and select any auto suggestion

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeClass0018_GoogleAutoSuggestion {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		WebElement e1 = driver.findElement(By.name("q"));
		e1.sendKeys("Bengaluru");
		Thread.sleep(3000);
		List<WebElement> e2 = driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
		int count = e2.size();
		System.out.println("Total number of auto suggestions displayed is " + count);
		e2.get(3).click(); // clicking on 4th auto suggestion

	}

}
