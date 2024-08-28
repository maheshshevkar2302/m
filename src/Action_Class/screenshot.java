package Action_Class;

import java.io.File;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class screenshot 

{
	
	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mahesh Shevkar\\Desktop\\Selenium\\chromedriver_win32 (2)\\chromedriver.exe");
		
	    WebDriver driver=new 	ChromeDriver();
	    
	    driver.get("https://www.amazon.in/");
		
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    
	    File Source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    
	   File Destination=new File("C:\\Users\\Mahesh Shevkar\\Desktop\\Screenshot\\sample_12.jpg");
	    
	    FileHandler.copy(Source,Destination);
		
		
		
		
		
		
		
		
		
	}

}
