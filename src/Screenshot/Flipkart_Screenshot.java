package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Flipkart_Screenshot 
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mahesh Shevkar\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(3000);
		
		
		File Source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		System.out.println(Source);
		
		File destination=new File("C:\\Users\\Mahesh Shevkar\\Desktop\\Screenshot\\sample1.jpg");
		
		FileHandler.copy(Source, destination);
		
	}

}