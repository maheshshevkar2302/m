package All_Programs_Practice;

import java.awt.Point;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class get_position 
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mahesh Shevkar\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(3000);
	
		
		org.openqa.selenium.Point Position=driver.manage().window().getPosition();
	
	     System.out.println(Position);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}}
