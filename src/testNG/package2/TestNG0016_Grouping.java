package testNG.package2;
//Grouping of tests with include and exclude in xml 

import org.testng.annotations.Test;

public class TestNG0016_Grouping {
	@Test(groups = { "smoke", "system" })
	public void test1() {
		System.out.println("smoke and system");
	}

	@Test(groups = { "smoke" })
	public void test2() {
		System.out.println("smoke");
	}

	@Test(groups = { "smoke" })
	public void test3() {
		System.out.println("smoke");
	}

	@Test(groups = { "smoke" })
	public void test4() {
		System.out.println("smoke");
	}

}
