package testNG.package2;
//two parameters in a single @Test Case 

import org.testng.annotations.Test;

public class TestNG0009_TwoParameters {
	@Test(priority = 1)
	public void registration() {
		System.out.println("registration on amazon");
	}

	@Test(priority = 2, invocationCount = 2) //two parameters in a single @Test 
	public void loginLogout() {
		System.out.println("login to amazon and logout from amazon");
	}

}
