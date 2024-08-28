package test_ng;

import org.testng.annotations.Test;

import graphql.Assert;

public class assert_false
{
	@Test
	public void assert_false_1() 
	{
		Boolean act=false;
		Assert.assertFalse(act);
	}
	
	@Test
	public void assert_false_2() 
	{
		Boolean act=true;
		Assert.assertFalse(act);
	}
	
	public void assert_false_3() 
	{
		boolean act=false;
		Assert.assertFalse(act);
	}

}
