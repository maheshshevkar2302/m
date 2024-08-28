package Webdriver_and_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class get_face_url 
{
	public static void main(String[] args)
	{
		
		//Parameter_1=Name of Browser
		//Parameter_2=Path of Chrome Browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mahesh Shevkar\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		
		//Create object of Chrome driver browser with refrence to webdrive
		 WebDriver driver =new ChromeDriver();
		 
		 //to enter url on webpage
		 driver.get("https://www.facebook.com/login/");	
		
		
		
		
		
		
	}

}
