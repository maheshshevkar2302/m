package Webdriver_and_methods;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class close 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mahesh Shevkar\\Desktop\\Maven\\chromedriver-win64\\chromedriver.exe");
		
		ChromeOptions Options=new ChromeOptions();
		
		Options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(Options);
		
		driver.get("https://www.facebook.com/login/");
		
		Thread.sleep(1000);
		
		//driver.close();    //close method of webdriver is used to close current tab on browser
		
		
		
		
		
		
	}

}
