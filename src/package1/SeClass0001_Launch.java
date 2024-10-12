package package1;
//Launching all the web browsers available on my system through selenium code

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeClass0001_Launch {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		FirefoxDriver driver1 = new FirefoxDriver();
		EdgeDriver driver2 = new EdgeDriver();
	}

}
