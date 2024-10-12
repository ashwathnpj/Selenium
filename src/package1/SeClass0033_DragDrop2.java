package package1;
//in grotechminds page, do drag and drop then do drop back to original position

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeClass0033_DragDrop2 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/drag-and-drop/");
		Thread.sleep(3000);
		WebElement drag=driver.findElement(By.xpath("//div[@id='container-6']"));
		WebElement drop=driver.findElement(By.id("div2"));
		Actions a1=new Actions(driver);
		a1.dragAndDrop(drag, drop).perform();
		
		//dropping back to original position
		Thread.sleep(3000);
		WebElement drag1=driver.findElement(By.id("div2"));
		WebElement drop1=driver.findElement(By.xpath("//div[@id='container-6']"));
		a1.dragAndDrop(drag1, drop1).perform();

	}

}
