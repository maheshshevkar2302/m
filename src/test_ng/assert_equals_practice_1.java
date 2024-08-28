package test_ng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class assert_equals_practice_1 
{
	@Test
	public void assert_equals_checks() 
	{
		String S1="My name is Mahesh";
		String S2="My name is Mahesh";
		
		Assert.assertEquals(S1,S2);
		
	}
	
	@Test
	public void assert_equals_checks_2() 
	{
		String S1="My name is Mahesh";
		String S2="My name is Mahesh";
		
		Assert.assertNotEquals(S1,S2);
		

}
}