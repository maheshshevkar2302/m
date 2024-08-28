package test_ng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class invocation_count 
{
	@Test(invocationCount =5)
	public void m1() 
	{
		Reporter.log("This is First Test Case");
	}

}
