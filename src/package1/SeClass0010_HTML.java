package package1;
//Launching the HTML application and selecting some of the values 

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeClass0010_HTML {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/ashwathnpj/Desktop/Shortcuts/learningHTML1.html");
		Thread.sleep(2000);
		WebElement e1 = driver.findElement(By.name("username"));
		e1.sendKeys("demodata12");
		WebElement e2 = driver.findElement(By.name("say hello"));
		e2.sendKeys("mobile");
		WebElement e3 = driver.findElement(By.name("password"));
		e3.sendKeys("a@123456");
		WebElement e5 = driver.findElement(By.name("fname"));
		e5.sendKeys("demo");
		WebElement e6 = driver.findElement(By.name("lname"));
		e6.sendKeys("data");
		Thread.sleep(2000);
		WebElement e7 = driver.findElement(By.name("name1"));
		e7.click();
		Thread.sleep(2000);
		WebElement e8 = driver.findElement(By.name("name2"));
		e8.click();
		Thread.sleep(2000);
		WebElement e9 = driver.findElement(By.name("name3"));
		e9.click();
		Thread.sleep(2000);
		WebElement e11 = driver.findElement(By.partialLinkText("Click to know about us"));
		e11.click();

	}

}
