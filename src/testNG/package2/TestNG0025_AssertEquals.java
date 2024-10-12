package testNG.package2;
//Assertion in TestNG with assertEquals(boolean, boolean); and checking the output

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG0025_AssertEquals {
	
	@Test
	public void test1() {
		Assert.assertEquals(126, 126); //byte
	}
	@Test
	public void test2() {
		Assert.assertEquals(32700, 32700); //short
	}
	@Test
	public void test3() {
		Assert.assertEquals(200000, 200000); //int
	}
	@Test
	public void test4() {
		Assert.assertEquals(922337200, 922337200); //long
	}
	@Test
	public void test5() {
		Assert.assertEquals(3.142, 3.142); //float
	}
	@Test
	public void test6() {
		Assert.assertEquals(3.141592, 3.141592); //double
	}
	
	@Test
	public void test7() {
		Assert.assertEquals('a', 'a'); //char
	}
	
	@Test
	public void test8() {
		Assert.assertEquals(true, true); //boolean
	}
	
	@Test
	public void test9() {
		Assert.assertEquals("mobiles", "mobiles"); //String
	}
}
