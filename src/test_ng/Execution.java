package test_ng;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Page_Object_Module.guru_home_page_2;
import Page_Object_Module.guru_login_page_1;

public class Execution extends base_class 
{
	guru_login_page_1 login_guru;
	guru_home_page_2  Home_page;
	@BeforeClass
	public void Launch_Browser() 
	{
		Launchbrowser();
		guru_login_page_1 login_guru=new guru_login_page_1(driver);
		guru_home_page_2  Home_page =new guru_home_page_2 (driver);
		
		
		
	}
	
	@AfterClass 
	public void Close_Browser() 
	{
		
		
	}
	
	@BeforeMethod
	public void login() 
	{
		login_guru.enterusername();
		login_guru.enterpassword();
		login_guru.loginbtn();
		
	}
	
	@AfterMethod
	
	public void logout() 
	{
		
	}
	@Test
	public void verify() 
	{
		
		
		
		
	}

}
