package all_in_one_programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class minimize 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mahesh Shevkar\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.makemytrip.com/");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);	
		
		driver.manage().window().minimize();
	}

}
