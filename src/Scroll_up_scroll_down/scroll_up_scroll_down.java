package Scroll_up_scroll_down;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scroll_up_scroll_down 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mahesh Shevkar\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(3000);
		
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		
		jse.executeScript("window.scrollBy(0,400);");
		
		Thread.sleep(3000);
		
		jse.executeScript("window.scrollBy(0,400);");
		
		
		
		
		
		
		
		
		
		
		
	}

}
