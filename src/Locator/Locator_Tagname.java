package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_Tagname 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mahesh Shevkar\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		
	WebDriver	driver=new ChromeDriver();
	
	driver.get("file:///C:/Users/Mahesh%20Shevkar/Desktop/HTML/Tagname.html");
	
	driver.findElement(By.tagName("input")).sendKeys("Mahesh");
		
	}

}
