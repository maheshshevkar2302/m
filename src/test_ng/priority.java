package test_ng;

import org.testng.annotations.Test;

public class priority 
{
	@Test(invocationCount = 5)
	public void TC1() 
	{
		
	}
	
	@Test(timeOut = 5000)
	public void TC2() throws InterruptedException 
	{
		Thread.sleep(7000);
	}
	
	@Test(priority=0)
	public void TC3() 
	{
		
	}


}
