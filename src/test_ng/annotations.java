package test_ng;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class annotations 
{
	@BeforeClass
	public void m1() 
	{
		Reporter.log("Open browser",true);
	}
	
	@BeforeMethod
	public void m2() 
	{
		Reporter.log("Login into App",true);
	}
	
	@Test                                //Test case verify user id 
	public void Tc001() 
	{
		Reporter.log("Running Test Case_1",true);
	}
	
	@AfterMethod
	public void m3() 
	{
		Reporter.log("Logout from app",true);
	}
	
	@AfterClass
	public void m4() 
	{
		Reporter.log("Close Browser",true);
	}

}
//JVM checking_Steps
//Step_1:first it will check test case available or not
//Step_2:Then will check method available or not 
//Step_3:It will check class available or not 

//Steps for execution
//After running program
//Step_1:-It will open browser first
//Step_2:Then login
//Step_3:It will execute test case
//Step_4:Then logout 
//Step_5:-Closes Browser



