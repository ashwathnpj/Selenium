package testNG.package2;
//Assertion in TestNG with assertFalse(false) and checking the output

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG0020_Assertion4 {
	@Test
	public void test1() {
		Assert.assertFalse(false);
	}
}
