package package1;
//clicking drop down https://grotechminds.com/dropdown 

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeClass0028_DropDown3 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/dropdown/");
		Thread.sleep(3000);

		// code to select demo2 using select by Visible Text.
		WebElement e1 = driver.findElement(By.name("Choice1"));
		Select s1 = new Select(e1);
		s1.selectByVisibleText("Demo2");

		// a code to select SQL 15 using select By Value.
		WebElement e9 = driver.findElement(By.name("Choice9"));
		Select s9 = new Select(e9);
		s9.selectByValue("SQL15");

		// the procedure of Selecting Night 10 dropdown
		WebElement e7 = driver.findElement(By.name("Choice7"));
		Select s7 = new Select(e7);
		s7.selectByIndex(10);

		// codes to select QTP10 and Energy15 using Select by Visible Text.
		WebElement e8 = driver.findElement(By.name("Choice8"));
		Select s8 = new Select(e8);
		s8.selectByVisibleText("QTP10");
		WebElement e4 = driver.findElement(By.name("Choice4"));
		Select s4 = new Select(e4);
		s4.selectByVisibleText("Energy15");

		// codes to select QTP9 and Energy14 using Select by Visible Text.
		WebElement e08 = driver.findElement(By.name("Choice8"));
		Select s08 = new Select(e08);
		s9.selectByVisibleText("QTP9");
		WebElement e04 = driver.findElement(By.name("Choice4"));
		Select s04 = new Select(e04);
		s4.selectByVisibleText("Energy14");

		// codes to select QTP8 and Energy13 using Select by Visible Text.
		WebElement e008 = driver.findElement(By.name("Choice8"));
		Select s008 = new Select(e08);
		s9.selectByVisibleText("QTP8");
		WebElement e004 = driver.findElement(By.name("Choice4"));
		Select s004 = new Select(e04);
		s4.selectByVisibleText("Energy13");

		// codes to select QTP7 and Energy12 using Select by Visible Text.
		WebElement e10 = driver.findElement(By.name("Choice8"));
		Select s10 = new Select(e10);
		s9.selectByVisibleText("QTP7");
		WebElement e11 = driver.findElement(By.name("Choice4"));
		Select s11 = new Select(e11);
		s4.selectByVisibleText("Energy12");

		// codes to select QTP6 and Energy11 using Select by Visible Text.
		WebElement e12 = driver.findElement(By.name("Choice8"));
		Select s12 = new Select(e12);
		s9.selectByVisibleText("QTP6");
		WebElement e2 = driver.findElement(By.name("Choice4"));
		Select s2 = new Select(e2);
		s4.selectByVisibleText("Energy11");

	}

}
