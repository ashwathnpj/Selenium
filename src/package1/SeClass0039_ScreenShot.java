package package1;
//Take the ScreenShot of Google home page

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class SeClass0039_ScreenShot {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.navigate().to("http://www.google.com");

		TakesScreenshot s1 = driver;
		File source = s1.getScreenshotAs(OutputType.FILE);
		File destination = new File(
				"C:\\Users\\ashwathnpj\\eclipse-workspace\\selenium\\src\\Screenshots\\ScreenshotGoogle.png");
		FileHandler.copy(source, destination);

	}

}
