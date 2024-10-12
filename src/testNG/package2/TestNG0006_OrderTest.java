package testNG.package2;
//class has one @Test, one @BM and one @AM

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG0006_OrderTest {
	@Test
	public void test1() {
		System.out.println("Test1");
	}

	@BeforeMethod
	public void bm() {
		System.out.println("BeforeMethod");
	}

	@AfterMethod
	public void am() {
		System.out.println("AfterMethod");
	}
}
