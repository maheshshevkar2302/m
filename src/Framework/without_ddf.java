package Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class without_ddf 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mahesh Shevkar\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://kite.zerodha.com/");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("GP8097");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Swami@0110");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("449192");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(3000);
		
		String Expected_Result="GP8097";
		
		Thread.sleep(3000);
		
		String Actual_Result=driver.findElement(By.xpath("//span[text()='GP8097']")).getText();
		
		Thread.sleep(3000);
		
		if(Expected_Result.equals(Actual_Result))
		{
			System.out.println("Pass");
		}
		else 
		{
			System.out.println("Fail");
			
		}
	}

}
