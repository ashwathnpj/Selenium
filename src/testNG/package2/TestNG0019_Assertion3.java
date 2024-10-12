package testNG.package2;
//Assertion in TestNG with assertFalse(true) and checking the output

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG0019_Assertion3 {
	@Test
	public void test1() {
		Assert.assertFalse(true);
	}
}
