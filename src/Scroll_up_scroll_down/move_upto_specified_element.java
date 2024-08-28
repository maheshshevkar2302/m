package Scroll_up_scroll_down;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class move_upto_specified_element 
{
	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Mahesh Shevkar\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
		
		//Wait 2 sec
		Thread.sleep(2000);
		
		// Identify element upto we have to scroll
		WebElement ele=driver.findElement(By.xpath("//a[text()='Facebook']"));
		
		//To perform scrollIntoView 
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", ele);
	}
}
