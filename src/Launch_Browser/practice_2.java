package Launch_Browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice_2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mahesh Shevkar\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
	WebDriver driver=new	ChromeDriver();
	
	driver.get("https://www.instagram.com/accounts/emailsignup/?hl=en");
	
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//input[@aria-label='Mobile Number or Email']")).sendKeys("9763468277");
		
	}

}
