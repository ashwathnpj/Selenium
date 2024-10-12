package testNG.package2;
//Assertion in TestNG with assertTrue(true, "message") and checking the output

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG0021_Assertion5 {
	@Test
	public void test1() {
		Assert.assertTrue(true, "successfully done");
	}
}
