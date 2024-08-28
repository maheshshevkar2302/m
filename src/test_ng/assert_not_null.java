package test_ng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class assert_not_null 
{
	@Test
	public void m1() 
	{
		String act="mahesh";
		
		Assert.assertNotNull(act);
	}
@Test
public void m2() 
{
	String S1="Mahesh";
    Assert.assertNotNull(S1);	


}
}
