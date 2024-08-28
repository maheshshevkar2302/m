package Page_Object_Module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class guru_test_class 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mahesh Shevkar\\Desktop\\Chromedriver\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/V4/index.php");
		
		
		
		
		
		guru_login_page_1 login_guru=new guru_login_page_1(driver);
		login_guru.enterusername();
		login_guru.enterpassword();
		login_guru.loginbtn();
		
		guru_home_page_2  Home_page =new guru_home_page_2 (driver);
		Home_page.home();
	}
	
	

}
