package Page_Object_Module_Revision;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test_class 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mahesh Shevkar\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://demo.guru99.com/V4/index.php");
	
	guru_login_page M1=new guru_login_page (driver) ;
	
	M1.username();
	M1.password();
	M1.login();
	
	guru_home_page M2=new guru_home_page(driver) ;
	M2.verify_userid();
	}

}
