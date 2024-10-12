package testNG.package2;
//single test case running multiple times using the invocationCount parameter

import org.testng.annotations.Test;

public class TestNG0004_invocationCount {
	@Test(invocationCount = 4)
	public void login() {
		System.out.println("login to amazon");
	}
}
