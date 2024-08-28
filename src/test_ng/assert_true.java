package test_ng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class assert_true 
{
	@Test
	public void assert_true_1() 
	{
		Boolean act=true;
		
		Assert.assertTrue(act);
		
	}
	
	@Test
	public void assert_true_2() 
	{
		Boolean act=false;
		
		Assert.assertTrue(act);
		
	}
	
	public void assert_false_3() 
	{
		boolean act=true;
		
		Assert.assertFalse(act);
		}
	@Test
	public void assert_false_4() 
	{
		
		boolean act=false;
		Assert.assertFalse(act);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
