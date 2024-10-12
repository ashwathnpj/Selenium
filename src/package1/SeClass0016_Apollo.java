package package1;
//Search pmc  in apollo pharmacy and click on the first result

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeClass0016_Apollo {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("https://www.apollopharmacy.in/");
		Thread.sleep(3000);
		WebElement e1 = driver.findElement(By.xpath("//div[@class='SearchPlaceholder_searchRoot__LWDXI icon-searchIcon SearchPlaceholder_icon___bJlq']"));
		e1.click();
		Thread.sleep(3000);
		WebElement e2 = driver.findElement(By.id("searchProduct"));
		e2.sendKeys("Pmc");
		Thread.sleep(1000);
		e2.sendKeys(Keys.ENTER);
		Thread.sleep(4000);
		//WebElement e3 = driver.findElement(By.xpath("(//h2)[1]"));
		WebElement e3 = driver.findElement(By.xpath("(//div[@class='pT'])[1]"));
		e3.click();
	
	}

}
