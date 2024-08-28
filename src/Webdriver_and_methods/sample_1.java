package Webdriver_and_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample_1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mahesh Shevkar\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
	WebDriver driver=new ChromeDriver();
	
	
	
	driver.get("https://www.google.co.in/");
	
	Thread.sleep(300);
	
	driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("amazon");
	
	
	
	}

}
