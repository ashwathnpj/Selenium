package package1;
//finding out the valid and invalid links in the google.com

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeClass0057_ValidLinks {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().minimize();
		driver.navigate().to("https://www.google.com");
		Thread.sleep(3000);
		List<WebElement> l1 = driver.findElements(By.tagName("a"));
		int count = l1.size();
		System.out.println(count);
		for (int i = 0; i < count; i++) {
			WebElement e1 = l1.get(i);
			String url = e1.getAttribute("href");
			System.out.println(url);
			verify_each_links(url);
		}
	}

	static void verify_each_links(String url) throws IOException {
		try {
			URL u1 = new URL(url);
			HttpURLConnection h1 = (HttpURLConnection) u1.openConnection();

			if (h1.getResponseCode() == 200) {
				System.out.println("It is a valid links " + h1.getResponseCode() + "  " + h1.getResponseMessage());
			} else {
				System.out.println("It is a broken links" + h1.getResponseCode() + h1.getResponseMessage());
			}
		} catch (MalformedURLException a1) {
			System.out.println("It is a broken links-Handled");
		}

	}

}
