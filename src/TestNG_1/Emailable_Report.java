package TestNG_1;

import org.testng.Reporter;
import org.testng.annotations.Test;
import test_ng.priority;

public class Emailable_Report 
{
	@Test(invocationCount = 5)
	public void m1() 
	{
		Reporter.log("This is Test Case_1",true);
	}
	
	@Test(priority = 0)
	public void m2() 
	{
		Reporter.log("This is Test Case_2", true);
	}
	
	@Test
	public void m3() 
	{
		Reporter.log("This is Test Case_3",true);
	}


}
