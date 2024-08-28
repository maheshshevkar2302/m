package Pop_up;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert_pop_up_accept 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mahesh Shevkar\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe" );
		
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		
		Thread.sleep(3000);
		
		//To enter username in username field
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("12345");
		
		Thread.sleep(3000);
		
		//to enter password in password field 
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		Thread.sleep(3000);
		
		//if we want handle pop up we need to switch focus of main frame to pop up by using method alert which is returns type is alert 
		
		Alert Alt=driver.switchTo().alert();
		
		Thread.sleep(3000);
		
	    Alt.accept();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
