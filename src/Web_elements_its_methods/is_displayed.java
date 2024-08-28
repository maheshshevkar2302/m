package Web_elements_its_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class is_displayed 
{
	public static void main(String[] args) 
	
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Mahesh Shevkar\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
	
	
	WebDriver driver=new ChromeDriver();	
	
	driver.get("https://www.facebook.com/");
	
	Boolean Result=driver.findElement(By.xpath("//h2[@class='_8eso']")).isDisplayed();
		
		System.out.println(Result);
		
		
		
		
		
		
		
		
	}

}
