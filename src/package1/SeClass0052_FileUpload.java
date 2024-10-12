package package1;
//uploading a file 

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeClass0052_FileUpload {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.navigate().to("https://grotechminds.com/registration/");

		WebElement e1 = driver.findElement(By.id("file"));
		e1.sendKeys("C:\\Users\\ashwathnpj\\javaprograms\\selenium\\src\\Screenshots\\ScreenshotGoogle.png");

	}

}
