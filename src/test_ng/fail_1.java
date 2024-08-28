package test_ng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class fail_1 
{
	@Test
	public void TC1()  //Test method/Test case
	{
		Reporter.log("running TC1", true);
	}
	@Test
	public void TC2()  //Test method/Test case
	{
		//Assert.fail();
		Reporter.log("running TC2", true);
	}
	@Test
	public void TC3()  //Test method/Test case
	{
		Reporter.log("running TC3", true);
	}
	
}



