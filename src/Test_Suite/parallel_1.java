package Test_Suite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class parallel_1 
{

	@Test
	public void openFlipkartApp() throws InterruptedException  //Test method/Test case
	{
		  // Step-I: Set path of chromedriver.exe file
		  //Parameter-I: Name of the browser
		  //Parameter-II: Path of chromedriver.exe file
		  System.setProperty("webdriver.chrome.driver", 
				  "C:\\Users\\Mahesh Shevkar\\Desktop\\Selenium\\chromedriver_win32 (2)\\chromedriver.exe");	  
		  //Create object of chromedriver class and provide reference of  Webdrive"r interface             
		            WebDriver driver=new ChromeDriver();  
		            driver.get("https://www.flipkart.com/");
		            Thread.sleep(2000);
		            
		            driver.close();

	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
	
}
