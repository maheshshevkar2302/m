package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_contains_text 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mahesh Shevkar\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	
	driver.findElement(By.xpath("//button[contains(text(),'Log ')]")).click();
		
	}

}
