package test_ng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class enabled 
{
	@Test(enabled =true)
	public void m2() 
	{
		Reporter.log("Pass");
	}

}
