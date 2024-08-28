package test_ng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class fail_2 
{
	@Test
	public void TC4()  //Test method/Test case
	{
		Reporter.log("running TC4", true);
	}
	@Test
	public void TC5()  //Test method/Test case
	{
	//	Assert.fail();
		Reporter.log("running TC5", true);
	}
	@Test
	public void TC6()  //Test method/Test case
	{
		Reporter.log("running TC6", true);
	}	


}
