package POM_base_test_utility_testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class POM_base_class 
{
	
	
	
	
	
	
	
	
	
	
	
public  WebDriver driver;
	
	public void initliszebrowser() 
	{
		 // Step-I: Set path of chromedriver.exe file
		  //Parameter-I: Name of the browser
		  //Parameter-II: Path of chromedriver.exe file
		  System.setProperty("webdriver.chrome.driver", 
				  "C:\\Users\\Mahesh Shevkar\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		  //Create object of chromedriver class and provide reference of  Webdriver interface             
		      driver=new ChromeDriver();

		      driver.get("https://kite.zerodha.com/");
		      
		      driver.manage().window().maximize();
		            
		      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
		
	}
	
	


}
