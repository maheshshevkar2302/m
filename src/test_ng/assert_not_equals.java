package test_ng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class assert_not_equals 
{
	@Test
	public void assert_not_equals_1() 
	{
		String S1="Hii";
		String S2="Hello";
		
		Assert.assertNotEquals(S1,S2);
		
		
	}
	@Test
	public void assert_not_equals_2() 
	{
		String S1="Hii";
		String S2="Hii";
		
		Assert.assertNotEquals(S1,S2);
		

}}
