package package1;
//Launch the Amazon application and search for fridge 
//and select the 4th drop down item from the drop down

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeClass0021_DropDown1 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		WebElement e1 = driver.findElement(By.id("searchDropdownBox"));
		Select s1 = new Select(e1);
		s1.selectByIndex(3); // it will select 4th
		Thread.sleep(1000);
		WebElement e2 = driver.findElement(By.id("twotabsearchtextbox"));
		e2.sendKeys("fridge");
		e2.sendKeys(Keys.ENTER);

	}

}
