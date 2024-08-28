package POM_base_test_utility_testng;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import POM_base_test_utility_testng.POM_login_page_1;
import POM_base_test_utility_testng.POM_login_page_2 ;

public class POM_test_class extends POM_base_class 
{
	POM_login_page_1  Login1;
	POM_login_page_2  Login2;
	POM_home_page_ Home;
	@BeforeClass
	public void OpenBrowser() 
	{
		initliszebrowser();
		//Create object Of POM 1 Class
	     Login1=new POM_login_page_1(driver); 
	   //Create Object of POM 2 Class  
        Login2=new POM_login_page_2 (driver);
       //Create object Object of POM 3 Class
        Home=new POM_home_page_(driver); 
		
	}
	
	
	@BeforeMethod
	public void LoginToApp() throws IOException 
	{
		Login1.enterUsername(POM_utility_class .getDataFromPF("UN"));//GP8097
		Login1.enterPassword(POM_utility_class .getDataFromPF("PSW"));//gms@0110
		Login1.ClickLoginBtn();
		
		Login2.enterPIN(POM_utility_class .getDataFromPF("PIN"));//111000
		Login2.ClickCtnBtn();
	}
	
	
	@Test                               //Test Case/Test Method-->Verify UserID
	public void VerifyUserID() throws EncryptedDocumentException, IOException 
	{
		String ActResult=Home.getKiteloginUserID();//GP8097 
		
	    String  ExpResult=POM_utility_class .GetDatafromExcelsheet(0,0); //GP8097 
	    
	   Assert.assertEquals(ActResult, ExpResult,"Failed:Both Results are different"); 
		
	}
	
	@AfterMethod
	public void LogoutFromApp(ITestResult result) throws IOException 
	{
		    //fail==fail
		if(result.getStatus()==ITestResult.FAILURE) 
		{
			POM_utility_class.CaptureScreenshot(driver);
		}
		
		
		
		
		Home.ClickUserID();
		Home.Clicklogoutbtn();
		
		
	}
	
	@AfterClass
	public void CloseBrowser() 
	{
		driver.close();
	}
	

}
