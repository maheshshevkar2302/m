package Screenshot;




import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class scrrenshot_redsky 
{
	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mahesh Shevkar\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");

		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rdskytech.com/");
		
		File Source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);		
		
		System.out.println(Source);
		
		File Destination=new File("C:\\Users\\Mahesh Shevkar\\Desktop\\Screenshot\\sample_5.jpg");
		
		FileHandler.copy(Source,Destination);
		
		
		
		
		
		
		
	}

}
