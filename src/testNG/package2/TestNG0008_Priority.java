package testNG.package2;
//order of execution of @Test by providing priority as 0, -1 and 1

import org.testng.annotations.Test;

public class TestNG0008_Priority {
	@Test(priority = 0)
	public void login() {
		System.out.println("login to amazon");
	}

	@Test(priority = -1)
	public void registration() {
		System.out.println("registration on amazon");
	}

	@Test(priority = 1)
	public void logout() {
		System.out.println("logout from amazon");
	}
}
