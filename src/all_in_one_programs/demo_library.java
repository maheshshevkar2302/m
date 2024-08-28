package all_in_one_programs;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo_library 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mahesh Shevkar\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		
		Thread.sleep(4000);
		
	     driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Redmi note 9 Pro Max");
	     
	     Thread.sleep(4000);
	     
	     driver.findElement(By.xpath("//input[contains(@id,'nav')]")).click();
	}

}
