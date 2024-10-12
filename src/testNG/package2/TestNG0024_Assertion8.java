package testNG.package2;
//Assertion in TestNG with assertFalse(false, "message") and checking the output

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG0024_Assertion8 {
	@Test
	public void test1() {
		Assert.assertFalse(false, "successfully done");
	}
}
