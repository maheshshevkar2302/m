package test_ng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class timeout 
{
	@Test(timeOut =2000)
	public void m1() throws InterruptedException 
	{
		
		Thread.sleep(3000);
		Reporter.log("This is First Statement ");
	}}


