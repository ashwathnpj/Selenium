package testNG.package2;
//Assertion in TestNG with assertTrue(false, "message") and checking the output

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG0022_Assertion6 {
	@Test
	public void test1() {
		Assert.assertTrue(false, "sorry");
	}
}
