package testNG.package2;
//Assertion in TestNG with assertFalse(true, "message") and checking the output

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG0023_Assertion7 {
	@Test
	public void test1() {
		Assert.assertFalse(true, "sorry");
	}
}
