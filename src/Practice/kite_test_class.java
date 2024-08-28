package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class kite_test_class 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mahesh Shevkar\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://kite.zerodha.com/");
		
		
		 kite_login_Page_1 Login=new kite_login_Page_1(driver);
		
	     Login.enterusername();
	     Login.enterpassword();
	     Login.logbtn();
	     
	     kite_login_page_2  Login_1=new kite_login_page_2 (driver);
	     
	     Login_1.enterpin();
	     Login_1.Continue();
		
		
		
		
		
	}

}
