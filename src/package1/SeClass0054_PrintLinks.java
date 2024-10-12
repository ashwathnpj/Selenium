package package1;
//amazon page printing all links and its link texts 

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeClass0054_PrintLinks {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);

		List<WebElement> l1 = driver.findElements(By.tagName("a"));
		int count = l1.size();
		System.out.println(count);

		for (int i = 0; i < count; i++) {
			WebElement e1 = l1.get(i);
			String url = e1.getAttribute("href");
			String linktext = e1.getText();
			System.out.println(linktext);
			System.out.println(url);
		}
		driver.quit();

	}

}
