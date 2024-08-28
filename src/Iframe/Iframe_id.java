package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe_id 
{
	public static void main(String[] args) throws InterruptedException 
	{
System.setProperty("webdriver.chrome.driver","C:\\Users\\Mahesh Shevkar\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Frames.html");
		
	Thread.sleep(3000);
	
	
	driver.switchTo().frame("SingleFrame");

	Thread.sleep(3000);
	
	
	
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Anantrao@1965");
		
	}

}
