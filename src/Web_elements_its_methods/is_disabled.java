package Web_elements_its_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class is_disabled 
{
	public static void main(String[] args) 
	{
		
		
		
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mahesh Shevkar\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		
		Boolean result=driver.findElement(By.xpath("//button[@data-testid='royal_login_button']")).isEnabled();
			
	System.out.println(result);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
