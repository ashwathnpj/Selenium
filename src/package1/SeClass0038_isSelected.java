package package1;
//In the Learning HTML page, selecting the gender and confirming that if it is selected

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeClass0038_isSelected {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/ashwathnpj/Desktop/Shortcuts/learningHTML1.html");
		Thread.sleep(3000);

		WebElement e1 = driver.findElement(By.xpath("(//input)[11]"));
		e1.click();

		boolean b1 = e1.isSelected();

		if (b1 == true) {
			System.out.println("Radio button is selected");
		} else {
			System.out.println("Radio button is not selected");
		}

	}

}
