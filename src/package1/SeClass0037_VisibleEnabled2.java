package package1;
//In the HTML page, perform an action on the last name 
//only if it is displayed and enabled 

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeClass0037_VisibleEnabled2 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/ashwathnpj/Desktop/Shortcuts/learningHTML1.html");
		Thread.sleep(3000);

		WebElement e1 = driver.findElement(By.id("121"));
		boolean b1 = e1.isDisplayed();
		boolean b2 = e1.isEnabled();

		if (b1 && b2) {
			e1.sendKeys("Joshi");
		} else {
			if (b1 == false) {
				System.out.println("Search box is not displaying");
			}
			if (b2 == false) {
				System.out.println("Search box is not enabled");
			}

		}

	}

}
