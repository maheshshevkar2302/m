package test_ng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class enabled_1 
{
@Test(enabled=false) 
	public void m1()
	{
		Reporter.log("Test case failed");
	}

}
