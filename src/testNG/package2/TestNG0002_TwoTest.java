package testNG.package2;
//a Class with two @test annotations

import org.testng.annotations.Test;

public class TestNG0002_TwoTest {
	@Test
	public void login() {
		System.out.println("Test1");
	}

	@Test
	public void logout() {
		System.out.println("Test2");
	}
}
