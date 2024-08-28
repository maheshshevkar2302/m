package Action_Class;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo_8 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mahesh Shevkar\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
	    WebDriver driver=new ChromeDriver();
	    
	    driver.get("https://www.amazon.in/");
		
	    Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Redmi Note 9 Pro");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		
		
		
		
		
		
		
		
		
	}

}
