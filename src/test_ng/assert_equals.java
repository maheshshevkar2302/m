package test_ng;


import org.testng.Assert;
import org.testng.annotations.Test;

public class assert_equals 
{
	@Test
	public void assert_equals_1() 
	{
		String S1="Mahesh";
		String S2="Mahesh";
		
		Assert.assertEquals(S1,S2);
	}
	@Test
	public void assert_equals_2() 
	{
		String S1="Mahesh";
		String S2="Mahesh";
		Assert.assertEquals(S1,S2);
	}
}
