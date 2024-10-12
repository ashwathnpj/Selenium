package testNG.package2;
//a Test case is disabled, then it is not executed 
//just we want to skip the registration, execute only login 

import org.testng.annotations.Test;

public class TestNG0007_DisabledTest {
	@Test(enabled = false)
	public void registration() {
		System.out.println("registration on amazon");
	}

	@Test
	public void login() {
		System.out.println("login on amazon");
	}
}
