package package1;
//Taking the ScreenShot of Amazon home page , name concat with current Time

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class SeClass0043_ScreenShot5 {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.navigate().to("http://www.amazon.in");

		Date d1 = new Date();
		String human = d1.toString();
		String d2 = human.substring(11, 19);

		TakesScreenshot s1 = driver;
		File source = s1.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\ashwathnpj\\eclipse-workspace\\selenium\\src\\Screenshots\\Screenshot"
				+ human.substring(11, 13) + human.substring(14, 16) + human.substring(17, 19) + ".png");
		FileHandler.copy(source, destination);

	}

}
