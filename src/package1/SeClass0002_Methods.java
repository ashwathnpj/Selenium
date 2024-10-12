package package1;
//Utilize the methods on the launched browsers.

import java.util.Set;

//get(), GetTitle(), quit(), close(), Getwindowhandles(), manage(), Getwindowhandle(), maximize(), minimize() 

import org.openqa.selenium.chrome.ChromeDriver;

public class SeClass0002_Methods {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize(); //maximize the browser window
		driver.get("http://www.google.com");
		Thread.sleep(2000);
		
		//browser id of parent window or window that has control
		String currentWindowHandle = driver.getWindowHandle();
		System.out.println("Current window handle id is --> " + currentWindowHandle);
		Thread.sleep(2000);
		
		//browser id of parent and child windows/tabs 
		Set<String> WindowHandles = driver.getWindowHandles();
		System.out.println("All windows handles id is --> " + WindowHandles);
		Thread.sleep(2000);
		
		//title of the page 
		String title=driver.getTitle();
		System.out.println("The title of the page is --> "+title);
		Thread.sleep(2000);
		
		//minimize the browser window
		driver.manage().window().minimize();
		Thread.sleep(2000);
		
		//close parent and child windows
		driver.quit();
		//driver.close(); //close only parent tab/window

	}

}
