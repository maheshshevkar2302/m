package test_ng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class demo_1 
{
	@BeforeClass
	public void main() 
	{
		System.out.println("contains code for launching browser");
	}
	@BeforeMethod
	public void login() 
	{
		System.out.println("contains code for logged into application");
	}
	@Test(invocationCount = 5)
	public void demo() 
	{
		System.out.println("contains code for verifying username and password ");
	}
	@Test(priority = 5)
	public void verify_user_id() 
	{
		System.out.println("contains code for verifying username and password ");
	}
	
	@Test(enabled = false)
	public void check_account() 
	{
		System.out.println("account balnce ");
	}
	
	@AfterMethod
	public void logout() 
	{
		System.out.println("contains code for logout application");
	}
	@AfterClass
	public void closebrowser()
	{
		System.out.println("contains code for closing browser");
	}
	
	

}
