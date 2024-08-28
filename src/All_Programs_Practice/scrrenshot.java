package All_Programs_Practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class scrrenshot 
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		//Step_1:Name of Browser and path of browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mahesh Shevkar\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		//Step_2:-Create object of chrome driver with reference to webdriver
	      WebDriver driver=new	ChromeDriver();
	    
	    //Step_3:-To enter URL
	      driver.get("https://www.facebook.com/");
	      
	    //wait
	      Thread.sleep(3000);
	      
	    //Steps_5:Typecast driver interface and call the methods
	      File Source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	      
	     //Steps_6:-Call the copy method
	      
	      //Steps_7:Create object of file class and in constructor of file class we need to pass object
	      
	      File Destination=new File("C:\\Users\\Mahesh Shevkar\\Desktop\\Screenshot\\sample_11.jpg");
	      
	      FileHandler.copy(Source,Destination);
	      
		
	}

}
