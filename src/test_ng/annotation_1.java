package test_ng;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class annotation_1 
{
	@BeforeClass
	public void m1() 
	{
		Reporter.log("Open_Browser",true);
	}
	
	
    @BeforeMethod
    public void m2() 
    {
    	Reporter.log("Login_App,true",true);
    }
    
	@Test
	public void Test_Case_ID_1() 
	{
		Reporter.log("Verify userid_password",true);
	}
	
	@Test
	public void Test_Case_ID_2() 
	{
		Reporter.log("Order",true);
	}
	
@AfterMethod
public void m3() 
{
Reporter.log("Logout_App",true);	}

@AfterClass
public void m4() 
{
	Reporter.log("Close_Browser",true);
	}

}

