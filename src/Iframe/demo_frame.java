package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo_frame 
{
	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Mahesh Shevkar\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://ui.vision/demo/webtest/frames/");
	
	Thread.sleep(3000);
	
	driver.switchTo().frame(driver.findElement(By.xpath("//frame[@src='frame_2.html']")));
	
	Thread.sleep(3000);
	
	
	driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Mahesh@9763");
	
	Thread.sleep(3000);
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
