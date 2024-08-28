package test_ng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class assert_null 
{
	@Test
	public void m1() 
	{

	String act=null;
	Assert.assertNull(act);
	}
	
	@Test
	public void m2() 
	{
		String act=null;
		Assert.assertNull(act);
	}
	}
