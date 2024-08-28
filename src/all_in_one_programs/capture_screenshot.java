package all_in_one_programs;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class capture_screenshot 
{
	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mahesh Shevkar\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.makemytrip.com/");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);	
		
		File Source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File Destination=new File("C:\\Users\\Mahesh Shevkar\\Desktop\\Screenshot\\sample_11.jpg");
		
		
		FileHandler.copy( Source,Destination);
		
		//Step_1:First we have to typecast into Takescreeshot Interface then we have to call getScreenshotAs method which has returns type file
		//Step_2:We have to call copy method which is present filehandler class which accept two parameter source and destination.
		//Stwp_3:We know about source address but we dont know about destination
		//Step_4:For that purpose we have to crteate object of file and in the constructor file we have to pass path of destination folder 

}}
