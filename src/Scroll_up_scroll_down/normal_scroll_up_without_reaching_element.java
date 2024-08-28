package Scroll_up_scroll_down;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class normal_scroll_up_without_reaching_element 
{
	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Mahesh Shevkar\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.makemytrip.com/");
	
	Thread.sleep(3000);
	
	//Step_1:-If we have to scroll up and scroll down then we have to type cast into javascriptexecutor 
	
	((JavascriptExecutor)driver).executeScript("window.scrollBy(0,2000)");
	
	Thread.sleep(3000);
	
	((JavascriptExecutor)driver).executeScript("window.scrollBy(0,3000)");

		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
