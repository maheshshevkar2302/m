package all_in_one_programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webelement_is_enabled 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mahesh Shevkar\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.makemytrip.com/");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);	
		
		driver.navigate();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		Boolean Enabled=driver.findElement(By.xpath("(//a[contains(@href,'gp')])[13]")).isEnabled();
		
		System.out.println(Enabled);
		
	}

}
