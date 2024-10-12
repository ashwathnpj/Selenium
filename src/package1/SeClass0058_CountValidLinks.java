package package1;
//Counting the Valid, broken and handled links on the amazon page

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeClass0058_CountValidLinks {
	static int validLinksCount = 0;
	static int brokenLinksCount = 0;
	static int handledLinksCount = 0;

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().minimize();
		driver.navigate().to("https://www.amazon.in");
		Thread.sleep(3000);
		List<WebElement> l1 = driver.findElements(By.tagName("a"));
		int count = l1.size();
		System.out.println("Total Links = " + count);

		for (int i = 0; i < count; i++) {
			WebElement e1 = l1.get(i);
			String url = e1.getAttribute("href");
			verify_each_links(url);
		}
		System.out.println("Valid Links = " + validLinksCount);
		System.out.println("Broken Links = " + brokenLinksCount);
		System.out.println("Handled Links = " + handledLinksCount);

	}

	static void verify_each_links(String url) throws IOException {

		try {

			URL u1 = new URL(url);
			HttpURLConnection h1 = (HttpURLConnection) u1.openConnection();

			if (h1.getResponseCode() == 200) {
				validLinksCount++;

			} else {
				brokenLinksCount++;
			}
		} catch (MalformedURLException a1) {
			handledLinksCount++;
		}

	}

}
