package testNG.package2;
//Assertion in TestNG with assertNotEquals(boolean, boolean); and checking the output

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG0026_AssertNotEquals {
	@Test
	public void test1() {
		Assert.assertNotEquals(126, 125); //byte
	}
	@Test
	public void test2() {
		Assert.assertNotEquals(32700, 32701); //short
	}
	@Test
	public void test3() {
		Assert.assertNotEquals(200000, 200001); //int
	}
	@Test
	public void test4() {
		Assert.assertNotEquals(922337200, 922337201); //long
	}
	@Test
	public void test5() {
		Assert.assertNotEquals(3.142, 3.141); //float
	}
	@Test
	public void test6() {
		Assert.assertNotEquals(3.141592, 3.141591); //double
	}
	
	@Test
	public void test7() {
		Assert.assertNotEquals('a', 'b'); //char
	}
	
	@Test
	public void test8() {
		Assert.assertNotEquals(true, false); //boolean
	}
	
	@Test
	public void test9() {
		Assert.assertNotEquals("mobiles", "radios"); //String
	}
}
