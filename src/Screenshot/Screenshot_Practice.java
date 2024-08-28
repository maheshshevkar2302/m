package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

public class Screenshot_Practice 
{
	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mahesh Shevkar\\Desktop\\Chromedriver\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions Options=new ChromeOptions();
		
		Options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(Options);
		
		driver.get("https://www.google.co.in/");
		
		File Source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
		
		
		System.out.println(Source);
		
		File Destination=new File("C:\\Users\\Mahesh Shevkar\\Desktop\\New folder (3)\\sample.jpg");
		
		
		FileHandler.copy(Source,Destination);
		
		
	}

}
