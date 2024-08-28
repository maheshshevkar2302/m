package Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;


public class demo_5 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mahesh Shevkar\\Desktop\\Selenium\\chromedriver_win32 (2)\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		ChromeOptions ch=new ChromeOptions();
		ch.addArguments("headless");
		
		driver.get("https://www.globalsqa.com/samplepagetest/");
		
		WebElement Digit =driver.findElement(By.xpath("//select[@name='g2599-experienceinyears']"));
		
		String Actual=Digit.getAttribute("value");
		
		String Expected="0-1";
		
		
		
		if(Actual.equals(Expected )) 
		{
			System.out.println("Pass");
		}
		
		else 
		{
			System.out.println("fail");
		}
	}
	
}
