package Page_Object_Module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class kite_test_class 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mahesh Shevkar\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://kite.zerodha.com/");
		
		Thread.sleep(3000);
		
		kite_login_page_1 	M1=new kite_login_page_1 (driver);
		M1.enterusername();
		M1.enterpassword();
		M1.loginclick();
		
		kite_login_page_2 M2=new kite_login_page_2 (driver);
		M2.enterpin();
		M2.conbtn();
		
		
		kite_home_page M3=new kite_home_page (driver);
		M3.dashboard();
	
		
		
		
		
		
		
		
		
	}

}
