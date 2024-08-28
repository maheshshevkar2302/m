package test_ng;

import org.testng.Reporter;
import org.testng.annotations.Test;



public class priorities_1 
{
	@Test(priority = 5)
	public void m1() 
	{
		Reporter.log("This should be run last");
	}
	
	@Test(priority = 0)
	public void m2() 
	{
		Reporter.log("This should be run first");
	}

	@Test(priority = 1)
	public void m3() 
	{
		Reporter.log("This should Be In Progress");
	}

	@Test(priority = 2)
	public void m4() 
	{
		Reporter.log("This should be after In progress");
	}

	@Test(priority = 6)
	public void m5() 
	{
		Reporter.log("This should be run after in Progress");
	}


}
