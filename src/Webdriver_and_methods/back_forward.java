package Webdriver_and_methods;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class back_forward 
{
	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mahesh Shevkar\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://web.whatsapp.com/");
	
	Thread.sleep(2000);
	
	driver.get("https://www.facebook.com/login/");
	
	Thread.sleep(2000);
	
	driver.navigate().back();
	
	Thread.sleep(2000);
	
	driver.navigate().forward();
	
	driver.quit();
	
	
		
	}

}
