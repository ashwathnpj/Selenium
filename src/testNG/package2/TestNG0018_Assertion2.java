package testNG.package2;
//Assertion in TestNG with assertTrue(false) and checking the output

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG0018_Assertion2 {
	@Test
	public void test1() {
		Assert.assertTrue(false);
	}
}
