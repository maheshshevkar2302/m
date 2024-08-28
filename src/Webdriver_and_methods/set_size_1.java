package Webdriver_and_methods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class set_size_1
{
	public static void main(String[] args) 
	{
	System.setProperty("webdriver.chrome.driver","\\C:\\Users\\Mahesh Shevkar\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
driver.get("https://web.whatsapp.com/");

Dimension d1=new Dimension(700,500);

driver.manage().window().setSize(d1);
	}

}
