package package1;
//Launch the google page, type "India" in the search field 
//only if the search bar is visible and enabled

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeClass0036_VisibleEnabled {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		Thread.sleep(3000);

		WebElement e1 = driver.findElement(By.name("q"));
		boolean b1 = e1.isDisplayed();
		boolean b2 = e1.isEnabled();

		if (b1 && b2) {
			e1.sendKeys("India");
		} else {
			if (b1 == false) {
				System.out.println("Search box is not displaying");
			} else {
				System.out.println("Search box is not enabled");
			}
		}

	}

}
