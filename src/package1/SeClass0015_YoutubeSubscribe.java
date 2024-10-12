package package1;
//searching grotechminds in youtube, and click on subscribe button 

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeClass0015_YoutubeSubscribe {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		Thread.sleep(3000);
		//WebElement e1 = driver.findElement(By.id("search"));
		//id will not work because, there are multiple id same name "search"
		
		WebElement e1 = driver.findElement(By.name("search_query"));
		e1.sendKeys("grotech minds");
		Thread.sleep(1000);
		e1.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		WebElement e2 = driver.findElement(By.xpath("(//div[@class='yt-spec-touch-feedback-shape__fill'])[10]"));
		e2.click();
	}

}
