package package1;
//Launch Naukri clicking on continue to google 
//and move the control from parent to child  and move the control back to parent.

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeClass0050_Naukri {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.navigate().to(
				"https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand&gad_source=1&gclid=EAIaIQobChMI_rfz_tmIiAMV46hmAh1dXDrTEAAYASAAEgKlj_D_BwE&gclsrc=aw.ds");
		Thread.sleep(2000);
		WebElement e1 = driver
				.findElement(By.xpath("//button[@class='socialbtn google resman-btn-tertiary resman-btn-medium']"));
		e1.click();

		Set<String> s1 = driver.getWindowHandles();
		Iterator<String> i1 = s1.iterator();
		String p1 = i1.next();
		String c1 = i1.next();

		driver.switchTo().window(c1);

		Thread.sleep(2000);
		WebElement e2 = driver.findElement(By.name("identifier"));
		e2.sendKeys("demodata@gmail.com");

		driver.switchTo().window(p1);

	}

}
